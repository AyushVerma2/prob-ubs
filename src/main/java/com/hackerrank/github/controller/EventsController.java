package com.hackerrank.github.controller;

import com.hackerrank.github.model.Event;
import com.hackerrank.github.repo.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping(value = "/events")
public class EventsController {
    @Autowired
    private EventRepo eventRepo;

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable long id) {

    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody Event event) throws IOException {

        if(null != eventRepo.getOne(event.getId())){
            eventRepo.save(event);
            ResponseEntity.ok(HttpStatus.OK);
        }

        return ResponseEntity.ok(HttpStatus.BAD_REQUEST);
    }

}
