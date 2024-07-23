package br.com.airtonviniciusferreira.iniciorapido.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class BemVindoControler {
    
    @GetMapping("/")
    public String get(@RequestParam(value = "nome", defaultValue = "Mundo") String nome) {
        return String.format("Olá %s! \n Bem Vindo!" ,nome );
    }
}
