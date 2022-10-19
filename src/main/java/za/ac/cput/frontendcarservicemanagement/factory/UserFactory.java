package za.ac.cput.frontendcarservicemanagement.factory;

import za.ac.cput.frontendcarservicemanagement.entity.User;
import za.ac.cput.frontendcarservicemanagement.util.Helper;

public class UserFactory {
    public static User createUser(String userName, String password) {
        Helper.checkStringParam(userName, "UserName");
        Helper.checkStringParam(password, "Password");

        return User.builder()
                .userName(userName)
                .userPassword(password)
                .build();
    }
}
