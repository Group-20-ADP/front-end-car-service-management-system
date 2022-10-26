/**Entity for VehicleService Entity
 Author: Manasseh Barnes (218009615)
 Milestone: Builder Pattern Implementation - first deliverable
 */
package za.ac.cput.frontendcarservicemanagement.entity;

import lombok.*;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle implements Serializable {
    private Long id;

    private String make;

    private String model;

    private String year;

    private String type;

    private long customer_Id;
}
