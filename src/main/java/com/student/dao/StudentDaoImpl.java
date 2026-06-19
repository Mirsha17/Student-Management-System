package com.student.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.student.model.Student;
import com.student.util.DBConnection;
public class StudentDaoImpl implements StudentDao{
	@Override
    public void addStudent(Student student){
		try{
			Connection con = DBConnection.getConnection();
			String sql ="insert into student(name,department,email) values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, student.getName());
            ps.setString(2, student.getDepartment());
            ps.setString(3, student.getEmail());
            ps.executeUpdate();
            con.close();
            } catch (Exception e){
            e.printStackTrace();
        }
    }
	@Override
    public List<Student> getAllStudents(){
		List<Student> list = new ArrayList<>();
		try{
			Connection con = DBConnection.getConnection();
			String sql = "select * from student";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()){
				Student s = new Student();
				s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setDepartment(rs.getString("department"));
                s.setEmail(rs.getString("email"));
                list.add(s);
            }
			con.close();
			} catch (Exception e){
            e.printStackTrace();
        }
		return list;
    }
	@Override
    public Student getStudentById(int id){
		Student s = new Student();
		try{
			Connection con = DBConnection.getConnection();
			String sql = "select * from student where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setDepartment(rs.getString("department"));
                s.setEmail(rs.getString("email"));
            }
			con.close();
			} catch (Exception e){
            e.printStackTrace();
        }
		return s;
    }
	@Override
    public void updateStudent(Student student){
		try{
			Connection con = DBConnection.getConnection();
			String sql = "update student set name=?,department=?,email=? where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, student.getName());
            ps.setString(2, student.getDepartment());
            ps.setString(3, student.getEmail());
            ps.setInt(4, student.getId());
            ps.executeUpdate();
            con.close();
            } catch (Exception e){
            e.printStackTrace();
        }
    }
	@Override
    public void deleteStudent(int id){
		try{
			Connection con = DBConnection.getConnection();
			String sql = "delete from student where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
			con.close();
			} catch (Exception e){
            e.printStackTrace();
        }
    }
}