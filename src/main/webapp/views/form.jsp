<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" type="text/css" href="form.css">
    <title>Add a Book</title>
</head>
<body>
<div class="header">
    <h1>Add a Book</h1>
</div>
<div class="form-container">
    <form action="bookadded" method="post">
        <label for="id">Book ID:</label>
        <input type="number" id="id" name="id" required>

        <label for="name">Book Name:</label>
        <input type="text" id="name" name="name" required>

        <label for="author">Author:</label>
        <input type="text" id="author" name="author" required>

        <label for="price">Price:</label>
        <input type="number" id="price" name="price" required>

        <label for="stock">Stock:</label>
        <input type="number" id="stock" name="stock" required>

        <button type="submit">Submit</button>
    </form>
</div>
</body>
</html>
