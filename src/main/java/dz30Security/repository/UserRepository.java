package dz30Security.repository;

import dz30Security.model.Userr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Userr, Integer> {
//    Optional<Object> findByLogin(String username);

    Optional<Userr> findByLogin(String login);
}
