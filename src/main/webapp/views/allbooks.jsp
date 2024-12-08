<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" type="text/css" href="allbooks.css">
    <title>All Books</title>
</head>
<body>
<div class="header">
    <h1>All Books</h1>
</div>
<div class="table-container">
    <table>
        <thead>
        <tr>
            <th>Book Details</th>
            <th>Stock Details</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="book" items="${books}">
            <tr>
                <td>
                    <p>ID: ${book.id}</p>
                    <p>Name: ${book.name}</p>
                    <p>Author: ${book.author}</p>
                </td>
                <td>
                    <p>Price: ${book.price}</p>
                    <p>Stock: ${book.stock}</p>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
