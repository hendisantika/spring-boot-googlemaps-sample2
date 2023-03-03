package com.hendisantika.springbootgooglemapssample2.dto;

import com.hendisantika.springbootgooglemapssample2.entity.JobPosition;
import com.hendisantika.springbootgooglemapssample2.entity.Role;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-googlemaps-sample2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/4/23
 * Time: 06:06
 * To change this template use File | Settings | File Templates.
 */
@Data
public class CreateEmployeeForm {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;

    private String street;
    private String city;
    private String country;

    private Role role;
    private JobPosition jobPosition;
}
