<html>
<head>
<title>Attendance</title>
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
}
input, select {
    width: 100%;
    padding: 8px;
    margin: 10px 0;
}
</style>
</head>
<body>
<h2>Mark Attendance</h2>
<form action="saveAttendance" method="post">
Student ID:
<input type="number" name="studentId">
Date:
<input type="date" name="attendanceDate">
Status:
<select name="status">
<option>Present</option>
<option>Absent</option>
</select>
<input type="submit" value="Save">
</form>
</body>
</html>