package carmanagementservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import carmanagementservice.entity.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}
