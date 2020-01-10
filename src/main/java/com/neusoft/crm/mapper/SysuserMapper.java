package com.neusoft.crm.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neusoft.crm.entity.Sysuser;

@Mapper
public interface SysuserMapper {

	@Select("select * from sysuser where userName=#{userName} and userPassword=#{userPassword}")
	public Sysuser selectSysuserByNameByPass(Sysuser sysuser);

}
