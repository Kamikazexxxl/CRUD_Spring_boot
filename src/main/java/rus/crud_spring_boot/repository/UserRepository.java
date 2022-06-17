package rus.crud_spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rus.crud_spring_boot.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
