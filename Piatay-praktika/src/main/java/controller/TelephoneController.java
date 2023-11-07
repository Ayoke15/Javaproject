//package controller;
//
//import model.Telephone;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import service.TelephoneService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/telephones")
//public class TelephoneController {
//    @Autowired
//    private TelephoneService telephoneService;
//
//    @GetMapping
//    public List<Telephone> getAllTelephones() {
//        return telephoneService.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public Telephone getTelephoneById(@PathVariable Long id) {
//        return telephoneService.findById(id).orElse(null);
//    }
//
//    @PostMapping
//    public Telephone createTelephone(@RequestBody Telephone telephone) {
//        return telephoneService.save(telephone);
//    }
//
//    @PutMapping("/{id}")
//    public Telephone updateTelephone(@PathVariable Long id, @RequestBody Telephone telephone) {
//        if (telephoneService.findById(id).isPresent()) {
//            return telephoneService.save(telephone);
//        }
//        return null;
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteTelephone(@PathVariable Long id) {
//        telephoneService.deleteById(id);
//    }
//}
