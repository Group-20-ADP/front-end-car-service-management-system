package za.ac.cput.frontendcarservicemanagement.factory;
/**
 author: aphiwe skeyi 217157785
 */
import za.ac.cput.frontendcarservicemanagement.entity.Customer;
import za.ac.cput.frontendcarservicemanagement.entity.User;

public class CustomerFactory {
    public static Customer createCustomer(String firstName,String lastName,String email, String password) {
        User user = UserFactory.createUser(firstName, lastName, email, password);

        return Customer.builder()
                .user(user)
                .build();
    }
}
