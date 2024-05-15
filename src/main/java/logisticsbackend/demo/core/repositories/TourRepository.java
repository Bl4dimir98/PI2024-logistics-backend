package logisticsbackend.demo.core.repositories;

import org.springframework.data.repository.CrudRepository;

import logisticsbackend.demo.core.entities.Tour;

public interface TourRepository extends CrudRepository<Tour, Long> {
    
}
