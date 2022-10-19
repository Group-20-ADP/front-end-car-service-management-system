package za.ac.cput.frontendcarservicemanagement.factory;

import za.ac.cput.frontendcarservicemanagement.entity.Workshop;
import za.ac.cput.frontendcarservicemanagement.util.Helper;

public class WorkshopFactory {

    public static Workshop createWorkshop(String name, String location) {
        Helper.checkStringParam(name, "Name");
        Helper.checkStringParam(location, "Location");

        return Workshop.builder()
                .name(name)
                .location(location)
                .build();
    }
}
