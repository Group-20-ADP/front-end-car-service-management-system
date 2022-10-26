package za.ac.cput.frontendcarservicemanagement.factory;

import za.ac.cput.frontendcarservicemanagement.entity.Employee;
import za.ac.cput.frontendcarservicemanagement.entity.Role;
import za.ac.cput.frontendcarservicemanagement.entity.User;
import za.ac.cput.frontendcarservicemanagement.util.Helper;

public class EmployeeFactory {
    public static Employee createEmployee(String firstName, String lastName, String email, String password, long role_Id) {
        User user = UserFactory.createUser(firstName, lastName, email, password);

        return Employee.builder()
                .user(user)
                .role_Id(role_Id)
                .build();
    }
}
