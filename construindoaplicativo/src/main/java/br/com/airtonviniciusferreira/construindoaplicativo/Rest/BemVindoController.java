package br.com.airtonviniciusferreira.construindoaplicativo.Rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class BemVindoController {

    @GetMapping("/")
    public String index() {
        return new String("Saudações do Spring Boot!\n");
    }
    
}
