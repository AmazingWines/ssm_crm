package com.salt.crm.mapper;

import java.util.List;

import com.salt.crm.pojo.BaseDict;

public interface BaseDictMapper {
	//查询
	public List<BaseDict> selectBaseDictListByCode(String code);
}
