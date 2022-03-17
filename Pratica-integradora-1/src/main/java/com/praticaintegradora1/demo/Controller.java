package com.praticaintegradora1.demo;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/roman")
public class Controller {
    @PostMapping(path = "/{number}")
    public ResponseEntity<String> convertToRoman(@PathVariable("number") Integer number){
        Service service = new Service();
        try {
            String response = service.convertToRoman(number);
            return ResponseEntity.status(200).body(response);
        } catch ( Exception e) {
            return ResponseEntity.status(400).body("deu ruim");
        }
    }
}
