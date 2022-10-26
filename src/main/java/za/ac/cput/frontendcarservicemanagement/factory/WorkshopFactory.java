package za.ac.cput.frontendcarservicemanagement.factory;

/*Author
  Moegamad Nur Duncan 220014442
* */

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

    public static Workshop createWorkshop(long workshopID, String name, String location) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
