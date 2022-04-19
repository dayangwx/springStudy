package tech.xiu.service;

import tech.xiu.pojo.Emp;

import java.util.List;

public interface EmpService {

    List<Emp> selectEmps();

    Integer addEmp(Emp emp);

    Integer updateEmp(Emp emp);

    Integer deleteEmp(int id);
}
