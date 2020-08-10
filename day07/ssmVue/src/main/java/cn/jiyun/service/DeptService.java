package cn.jiyun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jiyun.mapper.DeptMapper;
import cn.jiyun.pojo.Dept;

@Service
public class DeptService {
	
	@Autowired
	private DeptMapper deptMapper;
	public List<Dept> findDeptAll(){
		return deptMapper.findDeptAll();
	}
}
