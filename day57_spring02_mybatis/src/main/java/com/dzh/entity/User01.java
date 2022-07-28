package com.dzh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data

@Component
public class User01 {

    private Integer id;
    private String name;
    private String password;

    /**
     * set·½·¨×¢Èë
     */
    private Car car;
    @Autowired
    public void setCar(Car car) {
        this.car = car;
    }
}
