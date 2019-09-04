package com.iryna.cloud.spring.reservationroomservice;


import com.iryna.cloud.spring.reservationroomservice.client.RoomService;
import com.iryna.cloud.spring.reservationroomservice.domains.Room;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoomReservationController {

    @Autowired
    private RoomService roomService;

   // @HystrixCommand
    @RequestMapping(value = "/rooms", method = RequestMethod.GET)
    public List<Room> getAllRooms(@RequestParam(name = "roomNumber", required = false) String roomNumber) {
        return this.roomService.findAll(roomNumber);
    }


/*    @Autowired
    private RestTemplate restTemplate;*/

/*
    @RequestMapping(value = "/rooms", method = RequestMethod.GET)
public List<Room> getAvailableRooms() {
    ResponseEntity<List<Room>> responseEntity = this.restTemplate.exchange("http://roomservices/rooms", HttpMethod.GET, null, new ParameterizedTypeReference<List<Room>>() {
    });
    return responseEntity.getBody();
}
*/

}
