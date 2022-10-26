package za.ac.cput.frontendcarservicemanagement.entity;

import lombok.*;

import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Service implements Serializable {
    private Long id;

    private String name;

    private String description;

    private Long cost;

    private long workshop_Id;
}
