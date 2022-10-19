package za.ac.cput.frontendcarservicemanagement.factory;

import za.ac.cput.frontendcarservicemanagement.entity.Customer;
import za.ac.cput.frontendcarservicemanagement.entity.Vehicle;
import za.ac.cput.frontendcarservicemanagement.util.Helper;

public class VehicleFactory {
    static Customer cust = Customer.builder().build();

    public static Vehicle createVehicle(String make, String model, String year, Customer customer) {
        Helper.checkStringParam(model, "Name");
        Helper.checkStringParam(year, "Location");
        cust = customer;

        return Vehicle.builder()
                .make(make)
                .model(model)
                .year(year)
                .customerId(customer)
                .build();
    }
}
