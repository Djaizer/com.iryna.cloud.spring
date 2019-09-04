package com.iryna.cloud.spring.reservationroomservice.domains;

import lombok.Data;
import lombok.Setter;

@Data
public class Room {

    private long id;
    private String name;
    private String roomNumber;
    private String bedInfo;

}
