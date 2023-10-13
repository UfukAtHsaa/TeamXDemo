package de.hsaa.teamx.teamx.persistence;

import de.hsaa.teamx.teamx.domain.Message;
import org.springframework.data.repository.ListCrudRepository;

public interface MessageRepository extends ListCrudRepository<Message, Long> {
}
