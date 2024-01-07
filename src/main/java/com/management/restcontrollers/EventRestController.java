package com.management.restcontrollers;

import com.management.entities.Event;
import com.management.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class EventRestController {
   @Autowired
    EventService eventService;

    @GetMapping("/events")
    List<Event> getAllEvents(){
        return eventService.getAllEvents();
    }

    @GetMapping("/events/{idEvent}")
    public Event getEventById(@PathVariable("idEvent") Long idEvent){
        return eventService.getEventById(idEvent);
    }
    @GetMapping("/events/category/{idCategory}")
    public List<Event> getAllEventsByCategory(@PathVariable("idCategory") Long idCategory){
        return eventService.findAllEventsByIdCategory(idCategory);
    }
    @PostMapping("/events/save")
    public Event createEvent(@RequestBody Event Event){
        return eventService.saveEvent(Event);
    }
    @PutMapping("/events/update")
    public Event updateEvent(@RequestBody Event event){
        return eventService.updateEvent(event);
    }
    @DeleteMapping("/events/{idEvent}")
    public void deleteEventById(@PathVariable("idEvent") Long idEvent){
        eventService.deleteEventById(idEvent);
    }

}
