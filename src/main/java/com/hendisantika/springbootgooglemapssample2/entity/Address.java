package com.hendisantika.springbootgooglemapssample2.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-googlemaps-sample2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/4/23
 * Time: 06:02
 * To change this template use File | Settings | File Templates.
 */
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String street;
    private String city;
    private String country;

    @Override
    public String toString() {
        return String.join(", ", street, city, country);
    }
}
