package com.salt.crm.service;

import java.util.List;

import com.salt.crm.pojo.BaseDict;

public interface BaseDictService {
	//查询
	public List<BaseDict> selectBaseDictListByCode(String code);
}
