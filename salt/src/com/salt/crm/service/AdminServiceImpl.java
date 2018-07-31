package com.salt.crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salt.crm.mapper.AdminMapper;
import com.salt.crm.pojo.Admin;

/**
 * 管理员登录
 * @author ac
 *
 */
@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminMapper adminMapper;

	//登录查询用户
	public Admin findAdmin(Admin admin) {
		return adminMapper.findAdmin(admin);
	}
}
