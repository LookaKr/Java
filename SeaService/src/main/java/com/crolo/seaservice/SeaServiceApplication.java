package com.crolo.seaservice;

import com.crolo.seaservice.dao.postgresqlQueries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SeaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeaServiceApplication.class, args);
    }

}
