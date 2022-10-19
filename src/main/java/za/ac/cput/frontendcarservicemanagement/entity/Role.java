package za.ac.cput.frontendcarservicemanagement.entity;

import lombok.*;


@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Role {
    private String roleName, description;
}
