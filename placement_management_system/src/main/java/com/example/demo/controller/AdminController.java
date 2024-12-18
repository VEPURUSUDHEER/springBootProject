package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Admin;
import com.example.demo.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	AdminService admservice;
	
	@PostMapping("/addAdmin")
	public Admin regAdmin(@RequestBody  Admin adm)
	{
	
		return admservice.addAdmin(adm);
		
	}
	
	
	@GetMapping("/getAdmin")
	public List<Admin> getAdmin()
	{
		return admservice.getAdmin();
	}
	
	
	
	@DeleteMapping("/deleteadm/{id}")
	public void deleteAdmin(@PathVariable Integer id)
	{
		admservice.deleteAdmin(id);
		
		
	}
	
	
	@PutMapping("/updateadm")	
	public Admin updateAdmin(@RequestBody Admin adm)
	{
		return admservice.updateAdmin(adm);
	}
	
	
	

}
