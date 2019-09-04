package com.iryna.cloud.spring.reservationroomservice.client;

import com.iryna.cloud.spring.reservationroomservice.domains.Room;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class RoomServiceFallbackImpl implements RoomService {
    @Override
    public List<Room> findAll(String roomNumber) {
        List<Room> list = new ArrayList<>();
        Room room = new Room();
        room.setName("Ordfs");
        room.setRoomNumber("AAAA");
        list.add(room);
        return list;
        //return Collections.EMPTY_LIST;
    }
}
