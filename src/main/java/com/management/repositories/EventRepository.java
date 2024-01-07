package com.management.repositories;



import com.management.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(path = "rest")
public interface EventRepository extends JpaRepository<Event, Long> {

}
