package cn.jiyun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.jiyun.mapper.EmpMapper;
import cn.jiyun.pojo.Emp;
import cn.jiyun.pojo.EmpVo;

@Service
public class EmpService {

	@Autowired
	private EmpMapper empMapper;
	
	public PageInfo<EmpVo> findPage(EmpVo empVo ,Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		List<EmpVo> list = empMapper.findPage(empVo);
		return new PageInfo<EmpVo>(list);
	}
	public void addEmp(Emp emp){
		empMapper.addEmp(emp);
	}
	public Emp findById(Integer id){
		return empMapper.findById(id);
	}
	public void updateEmp(Emp emp) {
		// TODO Auto-generated method stub
		empMapper.updateEmp(emp);
	}
	public void delEmp(Integer id) {
		// TODO Auto-generated method stub
		empMapper.delEmp(id);
	}
}
