package za.ac.cput.frontendcarservicemanagement.entity;

import java.io.Serializable;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee implements Serializable {
    private Long empId;
    private UserCredentials user;
    private Role role;
}
