package micro.taller.candresborjamunozdnmontanez.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nombre")
public class NameController {
    @GetMapping("/nmontanez")
    public ResponseEntity<String> nmontanez() {
        return ResponseEntity.ok("Nicolás Montañez Velasco");
    }

    @GetMapping("/munozdjuan")
    public ResponseEntity<String> munozdjuan() {
        return ResponseEntity.ok("Juan Esteban Muñoz Díaz");
    }

    @GetMapping("/candresborja")
    public ResponseEntity<String> candresborja() {
        return ResponseEntity.ok("Carlos Andrés Borja González");
    }
}
