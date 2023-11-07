//package controller;
//
//import model.WashingMachine;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import service.WashingMachineService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/washing-machines")
//public class WashingMachineController {
//    @Autowired
//    private WashingMachineService washingMachineService;
//
//    @GetMapping
//    public List<WashingMachine> getAllWashingMachines() {
//        return washingMachineService.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public WashingMachine getWashingMachineById(@PathVariable Long id) {
//        return washingMachineService.findById(id).orElse(null);
//    }
//
//    @PostMapping
//    public WashingMachine createWashingMachine(@RequestBody WashingMachine washingMachine) {
//        return washingMachineService.save(washingMachine);
//    }
//
//    @PutMapping("/{id}")
//    public WashingMachine updateWashingMachine(@PathVariable Long id, @RequestBody WashingMachine washingMachine) {
//        if (washingMachineService.findById(id).isPresent()) {
//            return washingMachineService.save(washingMachine);
//        }
//        return null;
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteWashingMachine(@PathVariable Long id) {
//        washingMachineService.deleteById(id);
//    }
//}
