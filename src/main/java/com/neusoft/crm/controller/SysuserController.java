package com.neusoft.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.neusoft.crm.entity.Sysuser;
import com.neusoft.crm.service.SysuserService;

@RestController
public class SysuserController {
	
	@Autowired
	private SysuserService sysuserService;

	@RequestMapping("/selectSysuserByNameByPass")
	public Sysuser selectSysuserByNameByPass(@RequestBody Sysuser sysuser) throws Exception{
		return sysuserService.selectSysuserByNameByPass(sysuser);
	}
	
}
