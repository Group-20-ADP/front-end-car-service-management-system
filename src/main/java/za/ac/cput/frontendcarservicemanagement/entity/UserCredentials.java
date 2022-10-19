package za.ac.cput.frontendcarservicemanagement.entity;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserCredentials implements Serializable {
    private String name, lastName, email, address;
}
