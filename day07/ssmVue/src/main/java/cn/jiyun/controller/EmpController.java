package cn.jiyun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;

import cn.jiyun.pojo.Emp;
import cn.jiyun.pojo.EmpVo;
import cn.jiyun.service.EmpService;

@Controller
@CrossOrigin(value="http://localhost:63342")
@RequestMapping("emp")
public class EmpController {

	@Autowired
	private EmpService empService;
	
	@RequestMapping("findPage")
	@ResponseBody
	public PageInfo<EmpVo> findPage(EmpVo empVo,@RequestParam(defaultValue="1") Integer pageNum,@RequestParam(defaultValue="10")Integer pageSize){
		return empService.findPage(empVo, pageNum, pageSize);
	}
	@RequestMapping("save")
	public void addEmp(@RequestBody Emp emp){
		if(emp.getId()==null){
			empService.addEmp(emp);
		}else{
			empService.updateEmp(emp);
		}
		
	}
	@RequestMapping("findById")
	public Emp findById(Integer id){
		return empService.findById(id);
	}
	@RequestMapping("del")
	public void delEmp(Integer id){
		empService.delEmp(id);
	}
}
