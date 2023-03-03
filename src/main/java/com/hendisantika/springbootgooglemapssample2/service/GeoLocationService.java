package com.hendisantika.springbootgooglemapssample2.service;

import com.google.maps.GeoApiContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-googlemaps-sample2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/4/23
 * Time: 06:07
 * To change this template use File | Settings | File Templates.
 */
@Service
@Slf4j
public class GeoLocationService {
    private final GeoApiContext geoApiContext;

    @Autowired
    public GeoLocationService(@Value("${gmaps.api.key}") String apiKey) {
        geoApiContext = new GeoApiContext.Builder().apiKey(apiKey)
                .maxRetries(2)
                .connectTimeout(10L, TimeUnit.SECONDS)
                .build();
    }
}
