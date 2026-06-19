<%@ page import="java.util.List" %>
<%@ page import="com.student.model.Student" %>
<html>
<head>
<title>Students</title>
<style>
body {
    font-family: Arial;
    background: #f4f6f9;
}
h2 {
    text-align: center;
}
table {
    width: 85%;
    margin: auto;
    margin-top: 20px;
    border-collapse: collapse;
    background: white;
}
th {
    background: #3498db;
    color: white;
    padding: 10px;
}
td {
    text-align: center;
    padding: 10px;
}
tr:nth-child(even) {
    background: #f2f2f2;
}
a {
    color: #3498db;
    text-decoration: none;
}
</style>
</head>
<body>
<h2>Student List</h2>
<table>
<tr>
<th>ID</th>
<th>Name</th>
<th>Department</th>
<th>Email</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<%
List<Student> students = (List<Student>) request.getAttribute("students");
for(Student s : students) {
%>
<tr>
<td><%=s.getId()%></td>
<td><%=s.getName()%></td>
<td><%=s.getDepartment()%></td>
<td><%=s.getEmail()%></td>
<td><a href="editStudent?id=<%=s.getId()%>">Edit</a></td>
<td><a href="deleteStudent?id=<%=s.getId()%>">Delete</a></td>
</tr>
<% } %>
</table>
</body>
</html>
