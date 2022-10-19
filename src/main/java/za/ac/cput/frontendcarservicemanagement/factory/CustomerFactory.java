package za.ac.cput.frontendcarservicemanagement.factory;

import za.ac.cput.frontendcarservicemanagement.entity.Customer;
import za.ac.cput.frontendcarservicemanagement.entity.UserCredentials;

public class CustomerFactory {
    public static Customer createCustomer(String name,String lastName,String email,String address) {
        UserCredentials userCredentials = UserCredentialFactory.createUserCredentials(name, lastName, email, address);


        return Customer.builder()
                .userCredentials(userCredentials)
                .build();
    }
}
