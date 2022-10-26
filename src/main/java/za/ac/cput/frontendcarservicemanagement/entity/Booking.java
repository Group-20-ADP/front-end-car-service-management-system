/**Entity for BookingRepository Entity
 Author: Manasseh Barnes (218009615)
 Milestone: Builder Pattern Implementation - first deliverable
 */
package za.ac.cput.frontendcarservicemanagement.entity;

import lombok.*;

import java.io.Serializable;

@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Booking implements Serializable {
    private long id;

    private String booking_status;


    private long customer;


    private long service;


    private long vehicle;
}
