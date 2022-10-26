package za.ac.cput.frontendcarservicemanagement.entity;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {

    private Long id;

    private User user;

    private long role_Id;
}
