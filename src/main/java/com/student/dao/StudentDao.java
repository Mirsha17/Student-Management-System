package com.student.dao;
import java.util.List;
import com.student.model.Student;
public interface StudentDao{
	void addStudent(Student student);
	List<Student> getAllStudents();
	Student getStudentById(int id);
	void updateStudent(Student student);
	void deleteStudent(int id);
}