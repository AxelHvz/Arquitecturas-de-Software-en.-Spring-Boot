package sv.edu.udb.infrastructure.adapter;

import sv.edu.udb.domain.model.Contact;
import sv.edu.udb.domain.repository.ContactRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaContactRepository extends JpaRepository<Contact,Long>, ContactRepository {

}
