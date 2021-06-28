package com.crolo.seaservice.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class postgresqlQueries {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void run() {
        String sql = "INSERT INTO accounts(user_id, username, password, email)\n" +
                "values (3,'luka4','lukaajti4', 'lookakrolo4@gmail.com')";
        jdbcTemplate.update(sql);
    }
}
