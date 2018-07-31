package com.salt.crm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salt.crm.pojo.Admin;
import com.salt.crm.service.AdminService;

/**
 * 登录
 * @author ac
 *
 */
@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	//登录入口
	@RequestMapping(value = "/admin/login")
	public String login() {
		return "login";
	}
	
	//登录查询
	@RequestMapping(value = "/admin/findAdmin")
	public String findAdmin(Model model, HttpSession session, Admin admin) {
		Admin formAdmin = adminService.findAdmin(admin);
		if(formAdmin == null) {
			model.addAttribute("msg", "用户名或密码错误！");
			return "login";
		}
		session.setAttribute("formAdmin", formAdmin);
		return "redirect:/customer/list";
	}
	
	//退出登录
	@RequestMapping(value = "/admin/exit")
	public String exit(HttpSession session) {
		session.invalidate();
		return "redirect:/admin/login";
	}
}
