package com.salt.crm.service;

import com.salt.common.utils.Page;
import com.salt.crm.pojo.Customer;
import com.salt.crm.pojo.CustomerVo;
import com.salt.crm.pojo.QueryVo;

public interface CustomerService {
	
	// 通过四个条件 查询分页对象
	public Page<Customer> selectPageByQueryVo(QueryVo vo);
	
	//通过ID查询客户
	public Customer selectCustomerById(Integer id);
	
	//修改客户通过ID
	public void updateCustomerById(Customer customer);
	
	//通过ID 删除客户
	public void deleteCustomerById(Integer id);
	
	//增加客户
	public void insertCustomer(CustomerVo customerVo);

}
