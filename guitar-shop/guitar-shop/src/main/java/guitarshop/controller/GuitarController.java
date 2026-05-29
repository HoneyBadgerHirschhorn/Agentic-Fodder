package guitarshop.controller;

import guitarshop.model.Guitar;
import guitarshop.service.GuitarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/guitars")
@CrossOrigin(origins = "*")
public class GuitarController {

    private final GuitarService service;

    public GuitarController(GuitarService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Guitar>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/type/{type}")
    public ResponseEntity<List<Guitar>> getByType(@PathVariable String type) {
        return ResponseEntity.ok(service.findByType(type));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Guitar> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }


}
