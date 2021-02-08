package github.pathakgaurav.sampleregistrationbackend.repository;

import github.pathakgaurav.sampleregistrationbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
