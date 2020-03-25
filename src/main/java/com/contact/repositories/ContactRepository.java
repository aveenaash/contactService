package com.contact.repositories;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.contact.entities.ContactEntity;

@Repository
public interface ContactRepository extends CrudRepository<ContactEntity, Integer> {

	ContactEntity save(Optional<ContactEntity> entity);


}