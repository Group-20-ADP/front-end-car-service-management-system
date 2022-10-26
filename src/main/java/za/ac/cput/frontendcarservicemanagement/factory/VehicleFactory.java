package za.ac.cput.frontendcarservicemanagement.factory;
/**
 author: aphiwe skeyi 217157785
 */
import za.ac.cput.frontendcarservicemanagement.entity.Customer;
import za.ac.cput.frontendcarservicemanagement.entity.Vehicle;
import za.ac.cput.frontendcarservicemanagement.util.Helper;

public class VehicleFactory {

    public static Vehicle createVehicle(String make, String model, String year, long customer_Id){
        Helper.checkStringParam(make, "Make");
        Helper.checkStringParam(model, "model");
        Helper.checkStringParam(year, "year");

        return Vehicle.builder()
                .make(make)
                .model(model)
                .year(year)
                .customer_Id(customer_Id)
                .build();
    }
}
