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
    @Test void should_return_correct_car_when_parks_cars_and_fecth_it_by_ticket()throws Exception{
        Car actualFirstCar = new Car();
        Car actualSecondCar = new Car();
        ParkingBoy parkingBoy = new ParkingBoy();
        Ticket firstTicket = parkingBoy.park(actualFirstCar);
        Ticket secondTicket = parkingBoy.park(actualSecondCar);
        Car expectedFirstCar = parkingBoy.fetch(firstTicket);
        Car expectedSecondCar = parkingBoy.fetch(secondTicket);
        Assertions.assertEquals(actualFirstCar,expectedFirstCar);
        Assertions.assertEquals(actualSecondCar,expectedSecondCar);
    }
    @Test void should_get_exception_by_wrong_ticket()throws Exception{
        Car car = new Car();
        ParkingBoy parkingBoy = new ParkingBoy();
        Ticket wrongTicket = new Ticket();
        parkingBoy.park(car);
        Assertions.assertThrows(Exception.class,()->{
            parkingBoy.fetch(wrongTicket);
        });
    }
    @Test void should_get_exception_By_give_ticket_has_been_used()throws Exception{
        Car car = new Car();
        ParkingBoy parkingBoy = new ParkingBoy();
        Ticket actualTicket = parkingBoy.park(car);//Not Used
        parkingBoy.fetch(actualTicket);
        Assertions.assertThrows(Exception.class,()->{
            parkingBoy.fetch(actualTicket);
        });
    }
}