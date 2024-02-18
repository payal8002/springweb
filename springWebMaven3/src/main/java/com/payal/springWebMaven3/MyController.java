package com.payal.springWebMaven3;


import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.payal.springWebMaven3.model.UserDTO;




@Controller
public class MyController {
	@RequestMapping(value="/login", method = RequestMethod.POST)
	
	public ModelAndView login(@RequestParam String username, @RequestParam String password) {
		if(password.equals("azam1234")) {
			//return "rsp1.jsp";
			return new ModelAndView("rsp1.jsp","msg","Login Success Mr/Mrs. "+username);
		}
		//return "rsp2.jsp";
		return new ModelAndView("rsp1.jsp","msg","Login Failed invalid username or password ");
	}
	@RequestMapping("/registration")
		public ModelAndView registration(@ModelAttribute UserDTO dto) {
		System.out.println(dto);
			//return "rsp1.jsp";
		return new ModelAndView("rsp2.jsp","user",dto );
	
	}
	@RequestMapping("/listUser")
	public ModelAndView listUser() {
	UserDTO dto1 = new UserDTO(); 
	 dto1.setUsername("Azam");
	UserDTO dto2 = new UserDTO(); 
	dto2.setUsername("Amir");
	UserDTO dto3 = new UserDTO(); 
	dto3.setUsername("Raxe");
	ArrayList< UserDTO> list = new ArrayList< UserDTO>();
	list.add(dto1);
	 list.add(dto2);
	 list.add(dto3);
	return new ModelAndView("rsp3.jsp","userList",list);
	}
}

