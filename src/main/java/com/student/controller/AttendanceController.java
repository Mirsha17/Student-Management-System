package com.student.controller;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.student.dao.AttendanceDao;
import com.student.dao.AttendanceDaoImpl;
import com.student.model.Attendance;
@Controller
public class AttendanceController{
	AttendanceDao dao = new AttendanceDaoImpl();
	@RequestMapping("/attendance")
    public String attendancePage(){
		System.out.println("Attendance called");
		return "attendance";
    }
	@PostMapping("/saveAttendance")
    public String saveAttendance(@ModelAttribute Attendance attendance){
		dao.markAttendance(attendance);
		return "redirect:/attendanceReport";
    }
	@RequestMapping("/attendanceReport")
    public String attendanceReport(Model model){
    	List<Attendance> list = dao.getAttendanceReport();
    	model.addAttribute("attendanceList", list);
    	return "attendanceReport";
    }
}