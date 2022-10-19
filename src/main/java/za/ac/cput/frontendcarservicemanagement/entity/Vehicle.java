/**Entity for VehicleService Entity
 Author: Manasseh Barnes (218009615)
 Milestone: Builder Pattern Implementation - first deliverable
 */
package za.ac.cput.frontendcarservicemanagement.entity;

import java.io.Serializable;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle implements Serializable {
    private Long vehicleID;
    private String make, model, type, year;
    private Customer customerId;
}
