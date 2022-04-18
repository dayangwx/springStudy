package tech.xiu.service.impl;

import tech.xiu.mapper.EmpMapper;
import tech.xiu.pojo.Emp;
import tech.xiu.service.EmpService;

import java.util.List;

public class EmpServiceImpl implements EmpService {

    private EmpMapper empMapper;

    public void setEmpMapper(EmpMapper empMapper) {
        this.empMapper = empMapper;
    }

    @Override
    public List<Emp> selectEmps() {
        return empMapper.selectEmps();
    }

    @Override
    public Integer addEmp(Emp emp) {
        return empMapper.insertEmp(emp);
    }

    @Override
    public Integer updateEmp(Emp emp) {
        return empMapper.updateEmp(emp);
    }

    @Override
    public Integer deleteEmp(int id) {
        return empMapper.deleteEmp(id);
    }
}
