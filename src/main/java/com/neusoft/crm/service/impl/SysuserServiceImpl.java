package com.neusoft.crm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.crm.entity.Sysuser;
import com.neusoft.crm.mapper.SysuserMapper;
import com.neusoft.crm.service.SysuserService;

@Service
public class SysuserServiceImpl implements SysuserService{

	@Autowired
	private SysuserMapper sysuserMapper;

	@Override
	public Sysuser selectSysuserByNameByPass(Sysuser sysuser) {
		return sysuserMapper.selectSysuserByNameByPass(sysuser);
	}
}
