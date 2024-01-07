package com.management.services;

import com.management.entities.Category;
import com.management.entities.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EventService {

    Event saveEvent(Event Event);
    Event updateEvent(Event Event);
    Event getEventById(Long id);
    List<Event> getAllEvents();
    void deleteEventById(Long id);
    void deleteAllEvents();

    List<Event> findAllEventsByPrice(double priceEvent);
    List<Event> findAllEventsByNamePrice(@Param("nameEvent") String nameEvent , @Param("priceEvent") double priceEvent);
    List<Event> findAllEventsByCategory(Category category);

    List<Event> findAllEventsByIdCategory(Long idCategory);
    List<Event> findAllEventsByNameSort();

    Page<Event> getAllEventsByPage(int page, int size);

}
