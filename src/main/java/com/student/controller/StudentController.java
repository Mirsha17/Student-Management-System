package com.student.controller;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.student.model.Student;
import com.student.service.StudentService;
import com.student.service.StudentServiceImpl;
@Controller
public class StudentController{
	StudentService service = new StudentServiceImpl();
	@RequestMapping("/home")
    public String home(){
        return "home";
    }
	@RequestMapping("/addStudent")
    public String addStudentPage(){
        return "addStudent";
    }
	@PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute Student student){
		service.addStudent(student);
		return "redirect:/students";
    }
	@RequestMapping("/students")
    public String getStudents(Model model){
		List<Student> students = service.getAllStudents();
		model.addAttribute("students", students);
		return "studentList";
    }
	@GetMapping("/editStudent")
	public String editStudent(@RequestParam("id") int id,Model model){
	Student student = service.getStudentById(id);
		model.addAttribute("student", student);
		return "editStudent";
    }
	@PostMapping("/updateStudent")
    public String updateStudent(@ModelAttribute Student student){
		service.updateStudent(student);
		return "redirect:/students";
    }
	@GetMapping("/deleteStudent")
    public String deleteStudent(@RequestParam("id") int id){
		service.deleteStudent(id);
		return "redirect:/students";
    }
}