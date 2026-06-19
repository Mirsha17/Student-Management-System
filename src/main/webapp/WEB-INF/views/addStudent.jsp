<html>
<head>
<title>Add Student</title>
<style>
body {
    font-family: Arial;
    background: #f4f6f9;
}
h2 {
    text-align: center;
}
form {
    width: 40%;
    margin: auto;
    margin-top: 30px;
    background: white;
    padding: 20px;
    border-radius: 8px;
    box-shadow: 0px 0px 10px #ccc;
}
input {
    width: 100%;
    padding: 8px;
    margin: 10px 0;
    border: 1px solid #ccc;
    border-radius: 5px;
}
input[type="submit"] {
    background: #3498db;
    color: white;
    border: none;
}
input[type="submit"]:hover {
    background: #2980b9;
}
</style>
</head>
<body>
<h2>Add Student</h2>
<form action="saveStudent" method="post">
Name:
<input type="text" name="name">
Department:
<input type="text" name="department">
Email:
<input type="email" name="email">
<input type="submit" value="Save">
</form>
</body>
</html>