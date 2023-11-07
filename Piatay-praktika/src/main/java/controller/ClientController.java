//package controller;
//
//import model.Client;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import service.ClientService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/clients")
//public class ClientController {
//    @Autowired
//    private ClientService clientService;
//
//    @GetMapping
//    public List<Client> getAllClients() {
//        return clientService.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public Client getClientById(@PathVariable Long id) {
//        return clientService.findById(id).orElse(null);
//    }
//
//    @PostMapping
//    public Client createClient(@RequestBody Client client) {
//        return clientService.save(client);
//    }
//
//    @PutMapping("/{id}")
//    public Client updateClient(@PathVariable Long id, @RequestBody Client client) {
//        if (clientService.findById(id).isPresent()) {
//            return clientService.save(client);
//        }
//        return null;
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteClient(@PathVariable Long id) {
//        clientService.deleteById(id);
//    }
//}
