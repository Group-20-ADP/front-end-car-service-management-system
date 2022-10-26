package za.ac.cput.frontendcarservicemanagement.entity;
/**
 author: aphiwe skeyi 217157785
 */
import lombok.*;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer implements Serializable {

    private Long id;
    private User user;
}
