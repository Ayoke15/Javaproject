package service;

import model.Telephone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TelephoneRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TelephoneService {
    @Autowired
    private TelephoneRepository telephoneRepository;

    public List<Telephone> findAll() {
        return telephoneRepository.findAll();
    }

    public Optional<Telephone> findById(Long id) {
        return telephoneRepository.findById(id);
    }

    public Telephone save(Telephone telephone) {
        return telephoneRepository.save(telephone);
    }

    public void deleteById(Long id) {
        telephoneRepository.deleteById(id);
    }
}
