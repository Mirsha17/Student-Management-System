package com.student.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.student.dao.StudentDao;
import com.student.dao.StudentDaoImpl;
import com.student.model.Student;
@Service
public class StudentServiceImpl implements StudentService{
	StudentDao dao = new StudentDaoImpl();
    @Override
    public void addStudent(Student student){
        dao.addStudent(student);
    }
    @Override
    public List<Student> getAllStudents(){
        return dao.getAllStudents();
    }
    @Override
    public Student getStudentById(int id){
        return dao.getStudentById(id);
    }
    @Override
    public void updateStudent(Student student){
        dao.updateStudent(student);
    }
    @Override
    public void deleteStudent(int id){
        dao.deleteStudent(id);
    }
}
