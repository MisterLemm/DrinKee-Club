package MisterLemm.DrinKeeClub.repository;

import MisterLemm.DrinKeeClub.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
