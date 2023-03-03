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
 * Time: 06:03
 * To change this template use File | Settings | File Templates.
 */
@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeoLocation {

    private Double latitude;
    private Double longitude;
}
