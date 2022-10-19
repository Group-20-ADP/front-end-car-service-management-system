package za.ac.cput.frontendcarservicemanagement.entity;

import java.io.Serializable;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer implements Serializable {
    private Long custId;
    private UserCredentials userCredentials;

}
