/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.com.airtonviniciusferreira.graalvm.restservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author vscode
 */
@RestController
public class OlaMundoController {
    
    @RequestMapping("/")
    public String home() {
        return "Olá Mundo!";
    }

}
