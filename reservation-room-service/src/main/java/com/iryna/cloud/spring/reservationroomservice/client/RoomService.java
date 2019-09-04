package com.iryna.cloud.spring.reservationroomservice.client;

import com.iryna.cloud.spring.reservationroomservice.domains.Room;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "ROOMSERVICES", fallback = RoomServiceFallbackImpl.class)
public interface RoomService {

  //  @HystrixCommand
    @RequestMapping(method = RequestMethod.GET, value = "/rooms")
    List<Room> findAll(@RequestParam(name = "roomNumber", required = false) String roomNumber);

}
