/**
 * 
 */
package cn.jiyun.mapper;

import java.util.List;

import cn.jiyun.pojo.Emp;
import cn.jiyun.pojo.EmpVo;

/**
 * @author GGG
 *
 */
public interface EmpMapper {

	List<EmpVo> findPage(EmpVo empVo);

	

	void addEmp(Emp emp);



	Emp findById(Integer id);



	void updateEmp(Emp emp);



	void delEmp(Integer id);
}
