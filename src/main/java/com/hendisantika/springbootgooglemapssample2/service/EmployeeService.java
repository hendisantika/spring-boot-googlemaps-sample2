package com.hendisantika.springbootgooglemapssample2.service;

import com.hendisantika.springbootgooglemapssample2.entity.Employee;
import com.hendisantika.springbootgooglemapssample2.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-googlemaps-sample2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/4/23
 * Time: 06:04
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final GeoLocationService geoLocationService;

    @Transactional
    public void create(CreateEmployeeForm form) {
        final Employee employee = new Employee(form.getFirstName(), form.getLastName(), form.getUsername(),
                form.getEmail(),
                new Address(form.getStreet(), form.getCity(), form.getCountry()),
                form.getRole(), form.getJobPosition());
        employeeRepository.save(employee);
    }
}
