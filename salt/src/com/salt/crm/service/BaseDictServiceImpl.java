package com.salt.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salt.crm.mapper.BaseDictMapper;
import com.salt.crm.pojo.BaseDict;

@Service
public class BaseDictServiceImpl implements BaseDictService {
	
	@Autowired
	private BaseDictMapper baseDictMapper;

	@Override
	public List<BaseDict> selectBaseDictListByCode(String code) {
		return baseDictMapper.selectBaseDictListByCode(code);
	}

}
