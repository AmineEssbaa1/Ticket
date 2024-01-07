package com.management.services;

import com.management.entities.Category;
import com.management.entities.Event;

import org.springframework.data.domain.Page;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EventServiceImpl  implements EventService {


    @Override
    public Event saveEvent(Event Event) {
        return null;
    }

    @Override
    public Event updateEvent(Event Event) {
        return null;
    }

    @Override
    public Event getEventById(Long id) {
        return null;
    }

    @Override
    public List<Event> getAllEvents() {
        return null;
    }

    @Override
    public void deleteEventById(Long id) {

    }

    @Override
    public void deleteAllEvents() {

    }

    @Override
    public List<Event> findAllEventsByPrice(double priceEvent) {
        return null;
    }

    @Override
    public List<Event> findAllEventsByNamePrice(String nameEvent, double priceEvent) {
        return null;
    }

    @Override
    public List<Event> findAllEventsByCategory(Category category) {
        return null;
    }

    @Override
    public List<Event> findAllEventsByIdCategory(Long idCategory) {
        return null;
    }

    @Override
    public List<Event> findAllEventsByNameSort() {
        return null;
    }

    @Override
    public Page<Event> getAllEventsByPage(int page, int size) {
        return null;
    }
}
