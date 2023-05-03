package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Login;
import com.example.demo.Repository.LoginRepository;

@Service
public class LoginService {
	@Autowired
	LoginRepository lrepo;
	public String validateUser(String uname, String pwd)
	{
		String result="";
		Login user= lrepo.findByUname(uname);
		if(user == null)
		{
			result="Invalid user";
		}
		else
		{
			if(user.getPwd().equals(pwd))
			{
				result="Login Successful";
			}
			else
			{
				result="Login Failed";
			}
	
		}
return result;
}
}