package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MenuDto;
import com.example.demo.dto.UserDto;
import com.example.demo.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	// code
	
	
	@RequestMapping(value="validateUser")
	public UserDto findUserByUsernameAndPassword(@RequestParam("username") String username,@RequestParam("password") String password) {
		
		
		return adminService.findUserByUsernameAndPassword(username, password);
		
	
	}
	
	
	
	@RequestMapping(value="findMenusByUserid")
	public List<MenuDto> findMenusByUserid(@RequestParam("userId") Integer userId){
		return adminService.findMenusById(userId);
	}

}
