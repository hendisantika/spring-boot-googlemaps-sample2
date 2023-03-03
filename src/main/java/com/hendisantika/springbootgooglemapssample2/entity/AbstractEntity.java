package com.hendisantika.springbootgooglemapssample2.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-googlemaps-sample2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/4/23
 * Time: 06:01
 * To change this template use File | Settings | File Templates.
 */
@Data
@MappedSuperclass
public class AbstractEntity {
    @Id
    @SequenceGenerator(name = "eloc_sequence", sequenceName = "eloc_sequence", initialValue = 1000, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "eloc_sequence")
    protected Long id;
}
