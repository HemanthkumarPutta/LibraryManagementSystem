<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="bookadded.css">
    <title>Book Added Successfully</title>
</head>
<body>
<div class="container">
    <h1>Book Added Successfully!</h1>
    <p>Your book has been added to the library database.</p>

    <div class="book-details">
        <h2>Book Details</h2>
        <table>
            <tr>
                <th>ID</th>
                <td>${book.id}</td>
            </tr>
            <tr>
                <th>Name</th>
                <td>${book.name}</td>
            </tr>
            <tr>
                <th>Author</th>
                <td>${book.author}</td>
            </tr>
            <tr>
                <th>Price</th>
                <td>${book.price}</td>
            </tr>
            <tr>
                <th>Stock</th>
                <td>${book.stock}</td>
            </tr>
        </table>
    </div>

    <div class="actions">
        <a href="home" class="button">Go to Home</a>
        <a href="form" class="button">Add Another Book</a>
        <a href="allbooks" class="button">View All Books</a>
    </div>
</div>
</body>
</html>
