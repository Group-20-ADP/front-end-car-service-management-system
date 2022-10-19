package za.ac.cput.frontendcarservicemanagement.factory;

import za.ac.cput.frontendcarservicemanagement.entity.Booking;
import za.ac.cput.frontendcarservicemanagement.util.Helper;

import java.util.Date;

public class BookingFactory {
    public static Booking createBooking( String name, String location) {
        Helper.checkStringParam(name, "Name");
        Helper.checkStringParam(location, "Location");

        return Booking.builder()
                .date(new Date())

                .build();
    }
}
