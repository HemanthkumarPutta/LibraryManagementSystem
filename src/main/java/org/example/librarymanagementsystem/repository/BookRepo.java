package org.example.librarymanagementsystem.repository;

import org.example.librarymanagementsystem.LibraryManagementSystemApplication;
import org.example.librarymanagementsystem.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

@Repository
public class BookRepo{

    String url="jdbc:postgresql://localhost:5432/library", username="postgres", password="592735";
    Connection con = DriverManager.getConnection(url, username, password);

    public BookRepo() throws Exception {
        System.out.println("Connection Established...");
    }

    public void addBook(Book book) throws SQLException {
        String sql = "insert into library values(?,?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, book.getId());
        stmt.setString(2, book.getName());
        stmt.setString(3, book.getAuthor());
        stmt.setInt(4, book.getPrice());
        stmt.setInt(5, book.getStock());
        stmt.execute();
        System.out.println("Book added succesfully..");
    }

    public List<Book> getAllBooks() throws SQLException {
        String sql = "select * from library order by \"Id\" ";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        List<Book> books = new ArrayList<>();
        while(rs.next()) {
            books.add(new Book(rs.getInt("Id"),rs.getString("Name"),rs.getString("Author")
                    ,rs.getInt("Price"),rs.getInt("Stock")));
            System.out.println(rs.getInt("Id")+" "+rs.getString("Name")+" "+rs.getString("Author")
            + " " + rs.getInt("Price") + " "+ rs.getInt("Stock"));
        }
        return books;
    }
}
