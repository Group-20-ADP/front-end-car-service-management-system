package za.ac.cput.frontendcarservicemanagement.factory;

import za.ac.cput.frontendcarservicemanagement.entity.Service;
import za.ac.cput.frontendcarservicemanagement.entity.User;
import za.ac.cput.frontendcarservicemanagement.entity.Workshop;
import za.ac.cput.frontendcarservicemanagement.util.Helper;

public class ServiceFactory {
    public static Service createService(String name, String description, Long cost, long workshop_Id) {

        return Service.builder()
                .name(name)
                .description(description)
                .cost(cost)
                .workshop_Id(workshop_Id)
                .build();
    }
}
