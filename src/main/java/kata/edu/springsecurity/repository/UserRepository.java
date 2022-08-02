package kata.edu.springsecurity.repository;

import kata.edu.springsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
}
