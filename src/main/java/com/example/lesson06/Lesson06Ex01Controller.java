package com.example.lesson06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson06/ex01")
@Controller
public class Lesson06Ex01Controller {

	// 회원가입 화면
	// http://localhost/lesson06/ex01/add-user-view
	@GetMapping("/add-user-view")
	public String addUserView() {
		return "lesson06/addUser";
	}
	
	// 회원가입 진행 - AJAX가 한 요청
	// AJAX가 하는 요청의 응답값은 반드시 String이다.
	// http://localhost/lesson06/ex01/add-user
	@ResponseBody
	@PostMapping("/add-user")
	public String addUser(
			@RequestParam("name") String name,
			@RequestParam("yyyymmdd") String yyyymmdd,
			@RequestParam("email") String email,
			@RequestParam(value = "introduce", required = false) String introduce) {
		
		// db insert
		
		// 응답값 본문(body) => "성공"
		return "성공";
	}
	
	// 완료 화면
	@GetMapping("/after-add-user-view")
	public String afterAddUserView() {
		return "";
	}
}
