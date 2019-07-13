package com.thoughtworks.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * @title: ParkingBoyTest
 * @projectName: ParkingLot-2019-7-11-13-35-0-378
 * @description: TODO
 * @author: macmanboy@foxmail.com(Gio Zhang)
 * @date: 2019/7/13 11:07
 */
class ParkingBoyTest {

    @Test
    public void should_return_car_when_park_car_and_fetch_it_by_ticket()throws Exception{
        Car actualCar = new Car();
        ParkingBoy parkingBoy = new ParkingBoy();
        Ticket ticket = parkingBoy.park(actualCar);
        Car expectedCar = parkingBoy.fetch(ticket);
        Assertions.assertEquals(actualCar,expectedCar);
    }
}