package za.ac.cput.frontendcarservicemanagement.factory;

import za.ac.cput.frontendcarservicemanagement.entity.Employee;
import za.ac.cput.frontendcarservicemanagement.entity.UserCredentials;

public class EmployeeFactory {
    public static Employee createEmployee(String name, String lastName, String email, String password) {
        UserCredentials userCredentials = UserCredentialFactory.createUserCredentials(name, lastName, email, password);


        return Employee.builder()
                .user(userCredentials)
                .build();
    }
}
