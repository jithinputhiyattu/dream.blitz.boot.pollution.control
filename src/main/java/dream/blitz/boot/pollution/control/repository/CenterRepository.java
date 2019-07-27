package dream.blitz.boot.pollution.control.repository;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import dream.blitz.boot.pollution.control.jpa.Center;

public interface CenterRepository extends CrudRepository<Center, UUID> {

}
