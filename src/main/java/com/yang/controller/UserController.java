package com.yang.controller;

import javax.servlet.http.HttpServletRequest;

import com.yang.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yang.entity.User;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 
 * created by yangqing on 2018年2月19日 下午9:48:55
 */
@Controller
public class UserController {
	@Autowired
	UserService userService;
		
	@RequestMapping("/login")
	public String login(User user,HttpServletRequest request){
		
		//获取当前用户
		Subject subject=SecurityUtils.getSubject();
		UsernamePasswordToken token=new UsernamePasswordToken(user.getUsername(), user.getPassword());
		try{
			//为当前用户进行认证，授权
			subject.login(token);
			request.setAttribute("user", user);
			return "success";
			
		}catch(Exception e){
			e.printStackTrace();
			request.setAttribute("user", user);
			request.setAttribute("errorMsg", "用户名或密码错误！");
			return "login";
		}
	}
	
	@RequestMapping("/teacher")
	public String index() {
		return "index";
	}

	@RequestMapping("/selectuser")
	public ModelAndView selectuser(){
		ModelAndView mv=new ModelAndView();
		List<User> users= (List<User>) userService.selectUser();
        mv.addObject(users);
		mv.setViewName("userlist");
		return mv;
	}
}


