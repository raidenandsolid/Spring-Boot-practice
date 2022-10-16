package com.example.springboot.service;

import com.example.springboot.entities.Username;
import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UsernameService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String getUsername (String id) {
        int userId = 0;
        if(!StringUtils.isEmpty(id)) {
            userId = Integer.parseInt(id);
        }
        if (userId == 0) return "User does not exist";
        String sql = "SELECT * FROM username WHERE user_id = " + userId;
        Username username = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Username.class));
        return username.getUserId() + " " + username.getFirstName() + " " + username.getLastName();
    }
}
