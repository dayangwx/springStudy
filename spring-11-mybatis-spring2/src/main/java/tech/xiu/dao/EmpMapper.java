package tech.xiu.dao;

import tech.xiu.pojo.Emp;

import java.util.List;

public interface EmpMapper {

    List<Emp> selectEmps();

    Integer insertEmp(Emp emp);

    Integer updateEmp(Emp emp);

    Integer deleteEmp(int id);
}
