package com.dzh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component("myCar")//引入对象
public class Car {
    @Value("1")
    private Integer cId;
    @Value("布加迪")
    private String cName;
}
