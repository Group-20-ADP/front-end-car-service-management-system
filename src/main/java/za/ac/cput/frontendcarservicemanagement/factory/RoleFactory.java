package za.ac.cput.frontendcarservicemanagement.factory;

import za.ac.cput.frontendcarservicemanagement.entity.Role;
import za.ac.cput.frontendcarservicemanagement.util.Helper;

public class RoleFactory {
    public static Role createRole(String name) {
        Helper.checkStringParam(name, "name");

        return Role.builder()
                .name(name)
                .build();
    }
}
