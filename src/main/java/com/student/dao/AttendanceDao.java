package com.student.dao;
import java.util.List;
import com.student.model.Attendance;
public interface AttendanceDao{
	void markAttendance(Attendance attendance);
	List<Attendance> getAttendanceReport();
}