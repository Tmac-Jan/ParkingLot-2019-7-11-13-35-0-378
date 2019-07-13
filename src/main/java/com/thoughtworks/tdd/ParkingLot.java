package com.thoughtworks.tdd;

import java.util.LinkedHashMap;

/**
 * @title: ParkingLot
 * @projectName: ParkingLot-2019-7-11-13-35-0-378
 * @description: TODO
 * @author: macmanboy@foxmail.com(Gio Zhang)
 * @date: 2019/7/13 10:56
 */
public class ParkingLot {
    private LinkedHashMap<Ticket, Car> ticketCars;

    public LinkedHashMap<Ticket, Car> getTicketCars() {
        return ticketCars;
    }

    public Car fetchCar(Ticket ticket){
        return  ticketCars.remove(ticket);
    }
    public ParkingLot(){
        this.ticketCars = new LinkedHashMap<>(0);
    }
    public Ticket Park(Car car){
        Ticket ticket = new Ticket();
        ticketCars.put(ticket,car);
        return  ticket;
    }
}
