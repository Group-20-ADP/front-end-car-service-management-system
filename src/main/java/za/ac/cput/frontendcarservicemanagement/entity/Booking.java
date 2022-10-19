/**Entity for BookingRepository Entity
 Author: Manasseh Barnes (218009615)
 */
package za.ac.cput.frontendcarservicemanagement.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Booking implements Serializable {
    private long bookingID;
    private Date date;
    private String duration;
    private Customer  customer;
    private List<Vehicle> vehicleID;

}
