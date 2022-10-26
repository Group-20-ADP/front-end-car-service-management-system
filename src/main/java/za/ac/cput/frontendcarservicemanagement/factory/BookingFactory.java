package za.ac.cput.frontendcarservicemanagement.factory;

import za.ac.cput.frontendcarservicemanagement.entity.Booking;

public class BookingFactory {
    public static Booking createBooking(String booking_status, long customer, long service, long vehicle){
        return Booking.builder()
                .booking_status(booking_status)
                .customer(customer)
                .service(service)
                .vehicle(vehicle)
                .build();
    }
}