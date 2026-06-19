<%@ page import="java.util.List" %>
<%@ page import="com.student.model.Attendance" %>
<html>
<head>
<title>Attendance Report</title>
<style>
body {
    font-family: Arial;
    background: #f4f6f9;
}
table {
    width: 85%;
    margin: auto;
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
</style>
</head>
<body>
<h2>Attendance Report</h2>
<table>
<tr>
<th>ID</th>
<th>Student ID</th>
<th>Date</th>
<th>Status</th>
</tr>
<%
List<Attendance> list = (List<Attendance>) request.getAttribute("attendanceList");
for(Attendance a : list) {
%>
<tr>
<td><%=a.getAttendanceId()%></td>
<td><%=a.getStudentId()%></td>
<td><%=a.getAttendanceDate()%></td>
<td><%=a.getStatus()%></td>
</tr>
<% } %>
</table>
</body>
</html>