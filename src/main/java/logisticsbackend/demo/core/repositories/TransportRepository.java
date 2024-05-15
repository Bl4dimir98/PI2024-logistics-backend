package logisticsbackend.demo.core.repositories;

import org.springframework.data.repository.CrudRepository;
import logisticsbackend.demo.core.entities.Transport;

public interface TransportRepository extends CrudRepository<Transport, Long> {

}
