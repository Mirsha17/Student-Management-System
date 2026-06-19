<%@ page import="com.student.model.Student" %>
<%
Student s = (Student) request.getAttribute("student");
%>
<html>
<head>
<title>Edit Student</title>
<style>
body {
    font-family: Arial;
    background: #f4f6f9;
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
}
</style>
</head>
<body>
<h2>Edit Student</h2>
<form action="updateStudent" method="post">
<input type="hidden" name="id" value="<%=s.getId()%>">
Name:
<input type="text" name="name" value="<%=s.getName()%>">
Department:
<input type="text" name="department" value="<%=s.getDepartment()%>">
Email:
<input type="email" name="email" value="<%=s.getEmail()%>">
<input type="submit" value="Update">
</form>
</body>
</html>