package sv.edu.udb.domain.repository;

import sv.edu.udb.domain.model.Contact;
import java.util.List;
import java.util.Optional;

public interface ContactRepository {

    Contact save(Contact contact);
    List<Contact> findAll();
    Optional<Contact> findById(Long id);

}
