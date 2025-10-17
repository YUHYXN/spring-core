package com.codeit.springcore.chap03;

import com.codeit.springcore.config.AppConfig;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    void hotelTest() {

        AppConfig config = new AppConfig();

        Hotel hotel = config.hotel();


    }

}