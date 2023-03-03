package com.hendisantika.springbootgooglemapssample2.controller;

import com.hendisantika.springbootgooglemapssample2.dto.CreateEmployeeForm;
import com.hendisantika.springbootgooglemapssample2.entity.Employee;
import com.hendisantika.springbootgooglemapssample2.entity.JobPosition;
import com.hendisantika.springbootgooglemapssample2.entity.Role;
import com.hendisantika.springbootgooglemapssample2.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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

    @GetMapping
    public ModelAndView viewAllUsers() {
        final List<Employee> employees = employeeService.getAll();
        final ModelAndView modelAndView = new ModelAndView("employees");
        modelAndView.addObject("employees", employees);
        modelAndView.addObject("gmapsApiKey", gmapsApiKey);
        modelAndView.addObject("jobPositions", JobPosition.values());
        modelAndView.addObject("createEmployeeForm", new CreateEmployeeForm());
        modelAndView.addObject("roles", Role.values());
        return modelAndView;
    }

    @PostMapping
    public ModelAndView createEmployee(@ModelAttribute CreateEmployeeForm employeeForm) {
        employeeService.create(employeeForm);
        return new ModelAndView("redirect:/");
    }
}
