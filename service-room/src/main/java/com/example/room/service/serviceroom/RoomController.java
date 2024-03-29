package com.example.room.service.serviceroom;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value = "/rooms")
@Api(value = "rooms", description = "Some service to get all o separate room", tags = ("rooms"))
public class RoomController {
    @Autowired
    RoomRepository roomRepository;

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(nickname = "getRooms", value = "Get Rooms", notes = "Get all or separate rooms")
    public List<Room> getRooms(@RequestParam(value = "roomNumber", required = false) String roomNumber) {
        if(StringUtils.isNotEmpty(roomNumber)) {
            return Collections.singletonList(roomRepository.findByRoomNumber(roomNumber));
        }
        return (List<Room>) roomRepository.findAll();
    }



}
