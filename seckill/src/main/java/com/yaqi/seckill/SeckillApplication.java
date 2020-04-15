package com.yaqi.seckill;

import com.yaqi.seckill.dao.UserMapper;
import com.yaqi.seckill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class SeckillApplication {

	public static void main(String[] args) {

		SpringApplication.run(SeckillApplication.class, args);
	}

}

