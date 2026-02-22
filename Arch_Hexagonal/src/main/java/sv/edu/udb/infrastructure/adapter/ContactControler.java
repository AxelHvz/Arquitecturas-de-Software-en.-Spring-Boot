package sv.edu.udb.infrastructure.adapter;

import sv.edu.udb.application.ConntactService;
import sv.edu.udb.domain.model.Contact;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacs")
public class ContactControler {

    private final ConntactService service;

    public ContactControler(ConntactService service) {
        this.service = service;
    }

    @PostMapping
    public Contact crear(@RequestBody Contact contact) {
        return service.crearContact(contact);
    }

    @GetMapping
    public List<Contact> list() {
        return service.listarContacts();
    }

}
