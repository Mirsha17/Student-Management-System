package com.student.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.student.model.Attendance;
import com.student.util.DBConnection;
public class AttendanceDaoImpl implements AttendanceDao{
	@Override
    public void markAttendance(Attendance attendance){
		try{
			Connection con = DBConnection.getConnection();
			String sql = "insert into attendance(student_id,attendance_date,status) values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, attendance.getStudentId());
            ps.setString(2, attendance.getAttendanceDate());
            ps.setString(3, attendance.getStatus());
            ps.executeUpdate();
            con.close();
            }catch(Exception e){
            	e.printStackTrace();
        }
    }
	@Override
    public List<Attendance> getAttendanceReport(){
		List<Attendance> list = new ArrayList<>();
		try{
			Connection con = DBConnection.getConnection();
			String sql = "select * from attendance";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Attendance a = new Attendance();
				a.setAttendanceId(rs.getInt("attendance_id"));
				a.setStudentId(rs.getInt("student_id"));
				a.setAttendanceDate(rs.getString("attendance_date"));
				a.setStatus(rs.getString("status"));
				list.add(a);
            }
			con.close();
			} catch(Exception e){
				e.printStackTrace();
        }
		return list;
    }
}