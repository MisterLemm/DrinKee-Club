package MisterLemm.DrinKeeClub.repository;

import MisterLemm.DrinKeeClub.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<User, String > {
}
