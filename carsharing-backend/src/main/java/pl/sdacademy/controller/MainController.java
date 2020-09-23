package pl.sdacademy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sdacademy.entity.Task;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MainController {


    @GetMapping("/")
    public ResponseEntity main(){
        return ResponseEntity.ok("bingo");

    }


    @GetMapping("/task")
    public ResponseEntity task() {
        return ResponseEntity.ok(new Task(1l, "Start Spring"));
    }


}
