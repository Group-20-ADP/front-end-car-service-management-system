package za.ac.cput.frontendcarservicemanagement.factory;

import za.ac.cput.frontendcarservicemanagement.entity.Service;
import za.ac.cput.frontendcarservicemanagement.util.Helper;

public class ServiceFactory {
    public static Service createService(String name, String cost, String length) {
        Helper.checkStringParam(name, "ServiceName");
        Helper.checkStringParam(cost, "Cost");
        Helper.checkStringParam(length, "Length");

        return Service.builder()
                .name(name)
                .cost(cost)
                .length(length)
                .build();
    }
}
