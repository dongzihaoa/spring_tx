package com.dzh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.io.Serializable;

@Data //相当于getter setter toString
@AllArgsConstructor //全参构造器
@NoArgsConstructor //无参构造器

@Component
//@Scope("prototype") //双例模式
public class User implements Serializable {

    @Value("1001")
    private Integer id;

    @Value("dzh")
    private  String name;

    @Value("dzh")
    private  String password;

//    @Autowired
//    @Qualifier("myCar")
    @Resource(name = "myCar")
    private Car car;

    @PostConstruct
    public void init() {
        System.out.println("User 初始化");
    }

    @PreDestroy
    public  void destroy() {
        System.out.println("User 销毁");
    }

}
