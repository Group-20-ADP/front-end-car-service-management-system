package za.ac.cput.frontendcarservicemanagement.factory;

import za.ac.cput.frontendcarservicemanagement.entity.UserCredentials;
import za.ac.cput.frontendcarservicemanagement.util.Helper;

public class UserCredentialFactory {
    public static UserCredentials createUserCredentials(String name, String lastName, String email, String address) {
        Helper.checkStringParam(name, "Name");
        Helper.checkStringParam(lastName, "LastName");
        Helper.checkStringParam(email, "Email");
        Helper.checkEmail(email);
        Helper.checkStringParam(address, "Address");

        return UserCredentials.builder()
                .name(name)
                .lastName(lastName)
                .email(email)
                .address(address)
                .build();
    }

}
