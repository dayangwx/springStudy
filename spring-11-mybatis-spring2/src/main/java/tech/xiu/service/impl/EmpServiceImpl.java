package tech.xiu.service.impl;

import org.apache.ibatis.session.SqlSession;
import tech.xiu.pojo.Emp;
import tech.xiu.service.EmpService;

import java.util.List;

public class EmpServiceImpl implements EmpService {

    private SqlSession sqlSession;

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    private String mapperLocation = "tech.xiu.dao.EmpMapper.";

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
