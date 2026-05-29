package guitarshop.service;

import guitarshop.exception.ResourceNotFoundException;
import guitarshop.model.Guitar;
import guitarshop.repository.GuitarRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GuitarService {

    private final GuitarRepository repository;

    public GuitarService(GuitarRepository repository) {
        this.repository = repository;
    }

    public List<Guitar> findAll() {
        return repository.findAll();
    }

    public List<Guitar> findByType(String type) {
        return repository.findByType(type.toUpperCase());
    }

    public Guitar findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Guitar not found with id: " + id));
    }


}
