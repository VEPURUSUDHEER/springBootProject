package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.demo.entity.Admin;
import com.example.demo.repository.AdminRepository;

//service class - for crud operations

@Service
public class AdminService 
{
	@Autowired
	public AdminRepository adminrepo;
	
	//1)post data(inserting data into the table
	
	public Admin addAdmin(Admin adm)
	{
		return adminrepo.save(adm); 
	}
		
	//2)display(retrive data)
	
	public List<Admin> getAdmin()
	{
		return adminrepo.findAll();
	}
	
	//3)delete data
	
	public void deleteAdmin(int id)
	{
		adminrepo.deleteById(id);
	}
	
	//4)update
	
	public Admin updateAdmin(Admin adm)
	{
			
		//update table admin name ="ramesh" where id=5 -sql
			
	    Integer adminId=adm.getAdminId();//user input in postman
		Admin adm1=adminrepo.findById (adminId).get();//findById(table data in db)
		adm1.setAdminName(adm.getAdminName());
	    return adminrepo.save(adm);
			
	}
		

}
