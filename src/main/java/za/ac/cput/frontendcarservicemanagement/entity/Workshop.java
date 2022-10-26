package za.ac.cput.frontendcarservicemanagement.entity;

/*Author
  Moegamad Nur Duncan 220014442
* Builder Pattern for Workshop Entity
* Date : 07 April 2022
* */

import lombok.*;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Workshop implements Serializable {

    private long id;

    private String name;

    private String location;
}
