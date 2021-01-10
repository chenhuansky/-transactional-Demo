package com.seu.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Transactional
    public void insert(){
        String sql="insert into mybatis.user(id,name,pwd) values (?,?,?)";
        jdbcTemplate.update(sql,2022,"txname","tx-password");
        String name=null;
        name.toCharArray();
    }
}
