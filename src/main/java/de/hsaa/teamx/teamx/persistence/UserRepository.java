package de.hsaa.teamx.teamx.persistence;

import de.hsaa.teamx.teamx.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {
    UserEntity findByUsername(String username);
}
