package com.thoughtworks.tdd;

/**
 * @title: ParkingBoy
 * @projectName: ParkingLot-2019-7-11-13-35-0-378
 * @description: TODO
 * @author: macmanboy@foxmail.com(Gio Zhang)
 * @date: 2019/7/13 10:56
 */
public class ParkingBoy {
    private ParkingLot parkingLot;

    public ParkingBoy() {
        parkingLot = new ParkingLot();
    }
    public Ticket park(Car car)throws Exception{
        return (this.parkingLot.Park(car));
    }
    public Car fetch(Ticket ticket)throws Exception{
        Car car= parkingLot.fetchCar(ticket);
        if (car!=null){
            return car;
        }
        else throw new Exception();
    }
}
