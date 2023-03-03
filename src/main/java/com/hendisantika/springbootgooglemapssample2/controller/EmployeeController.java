package com.hendisantika.springbootgooglemapssample2.controller;

import com.hendisantika.springbootgooglemapssample2.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-googlemaps-sample2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/4/23
 * Time: 06:08
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;
    @Value("${gmaps.api.key}")
    private String gmapsApiKey;
}
