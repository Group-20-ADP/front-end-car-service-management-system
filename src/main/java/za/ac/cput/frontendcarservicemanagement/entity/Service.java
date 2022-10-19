package za.ac.cput.frontendcarservicemanagement.entity;

import java.io.Serializable;
import lombok.*;

@Builder
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Service implements Serializable {
    private Long serviceId;
    private String name, cost, length;
}
