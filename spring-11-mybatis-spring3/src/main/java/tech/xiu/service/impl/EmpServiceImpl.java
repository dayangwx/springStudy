package tech.xiu.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.xiu.pojo.Emp;
import tech.xiu.service.EmpService;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private SqlSession sqlSession;

    private String mapperLocation = "tech.xiu.mapper.EmployeeMapper.";

    @Override
    public List<Emp> selectEmps() {
        return sqlSession.selectList(mapperLocation+"selectEmps");
    }

    @Override
    public Integer addEmp(Emp emp) {
        return sqlSession.insert(mapperLocation+"insertEmp",emp);
    }

    @Override
    public Integer updateEmp(Emp emp) {
        return sqlSession.update(mapperLocation+"updateEmp",emp);
    }

    @Override
    public Integer deleteEmp(int id) {
        return sqlSession.delete(mapperLocation+"deleteEmp",id);
    }
}
