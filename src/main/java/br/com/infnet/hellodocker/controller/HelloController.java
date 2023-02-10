package br.com.infnet.hellodocker.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/")
public class HelloController {
    @Value("${greeting}")
    String greeting = "";
    @GetMapping
    public ResponseEntity helloWorld(){
        return ResponseEntity.ok(Map.of("message", greeting));
    }
}
