package dream.blitz.boot.pollution.control.repository;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import dream.blitz.boot.pollution.control.jpa.Vehicle;


public interface VehicleRepository extends CrudRepository<Vehicle, UUID> {

	Optional<Vehicle> findByNumber(String number);

	Optional<Vehicle> findByMobile(String mobile);


}
