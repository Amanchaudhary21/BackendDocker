package in.stricks.backenddocker.repository;
import in.stricks.backenddocker.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface UserRepository extends JpaRepository<Users, UUID> {

}
