package com.sou.xml;


import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHomeController {
	
	@GetMapping(value="/home",produces= {"application/xml","application/json"})
	public @ResponseBody Student getStudent()
	{
		
		Student student=new Student();
		student.setFirstName("sougandh");
		student.setLastName("alamuri");
		student.setUsername("sougandh");
		return student;
	}
	@XmlRootElement
	class  Student{
		String Username;
		String FirstName;
		String LastName;
		public String getUsername() {
			return Username;
		}
		public void setUsername(String username) {
			Username = username;
		}
		public String getFirstName() {
			return FirstName;
		}
		public void setFirstName(String firstName) {
			FirstName = firstName;
		}
		public String getLastName() {
			return LastName;
		}
		public void setLastName(String lastName) {
			LastName = lastName;
		}
		
	}
	

}
