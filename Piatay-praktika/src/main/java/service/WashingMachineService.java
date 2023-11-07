package service;

import model.WashingMachine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.WashingMachineRepository;

import java.util.List;
import java.util.Optional;

@Service
public class WashingMachineService {
    @Autowired
    private WashingMachineRepository washingMachineRepository;

    public List<WashingMachine> findAll() {
        return washingMachineRepository.findAll();
    }

    public Optional<WashingMachine> findById(Long id) {
        return washingMachineRepository.findById(id);
    }

    public WashingMachine save(WashingMachine washingMachine) {
        return washingMachineRepository.save(washingMachine);
    }

    public void deleteById(Long id) {
        washingMachineRepository.deleteById(id);
    }
}
