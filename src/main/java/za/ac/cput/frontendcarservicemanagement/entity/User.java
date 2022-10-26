/**
 Author: Kurtney Clyde Jantjies (218138105)
 */
package za.ac.cput.frontendcarservicemanagement.entity;

import lombok.*;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private String firstName, lastName, email, password;
}
