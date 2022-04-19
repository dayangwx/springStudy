package tech.xiu.mapper;

import tech.xiu.pojo.Emp;

import java.util.List;

public interface EmployeeMapper {

    List<Emp> selectEmps();

    Integer insertEmp(Emp emp);

    Integer updateEmp(Emp emp);

    Integer deleteEmp(int id);
}
