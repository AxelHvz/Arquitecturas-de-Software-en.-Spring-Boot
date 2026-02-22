package sv.edu.udb.application;

import sv.edu.udb.domain.model.Contact;
import sv.edu.udb.domain.repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConntactService {

    private final ContactRepository repository;

    public ConntactService(ContactRepository repository) {
        this.repository = repository;
    }

    public Contact crearContact(Contact contact){
        return repository.save(contact);
    }

    public List<Contact> listarContacts(){
        return repository.findAll();
    }

}
