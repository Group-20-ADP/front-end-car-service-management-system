package za.ac.cput.frontendcarservicemanagement.factory;

import za.ac.cput.frontendcarservicemanagement.entity.Role;
import za.ac.cput.frontendcarservicemanagement.util.Helper;

public class RoleFactory {
    public static Role createRole(String name, String description) {
        Helper.checkStringParam(name, "RoleName");
        Helper.checkStringParam(description, "Description");

        return Role.builder()
                .roleName(name)
                .description(description)
                .build();
    }
}
