package com.xiu.mapper;

import com.xiu.pojo.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AccountDao {

    @Insert("insert into account(name,job)values(#{name},#{job})")
    void save(Account account);

    @Delete("delete from account where id = #{id} ")
    void delete(Integer id);

    @Update("update account set name = #{name} , job = #{job} where id = #{id} ")
    void update(Account account);

    @Select("select * from account")
    List<Account> findAll();

    @Select("select * from account where id = #{id} ")
    Account findById(Integer id);
}
