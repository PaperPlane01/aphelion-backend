package org.equinox.repository;

import org.equinox.model.domain.PersonalInformation;
import org.equinox.model.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonalInformationRepository extends JpaRepository<PersonalInformation, Long> {
    PersonalInformation save(PersonalInformation personalInformation);
    void delete(PersonalInformation personalInformation);
    Optional<PersonalInformation> findById(Long id);
    Optional<PersonalInformation> findByUser(User user);
}
