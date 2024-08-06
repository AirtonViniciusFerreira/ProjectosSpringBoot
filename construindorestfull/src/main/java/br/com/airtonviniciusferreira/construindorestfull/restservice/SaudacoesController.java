package  br.com.airtonviniciusferreira.construindorestfull.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.airtonviniciusferreira.construindorestfull.restservice.dto.SaudacaoDto;


@RestController
public class SaudacoesController {

    private static final String modelo = "Olá, %s!";
    private final AtomicLong contador = new AtomicLong();

    @GetMapping("/saudacoes")
    public SaudacaoDto saudacao(
        @RequestParam(value="nome", defaultValue="Mundo" ) String nome
    ) {
        return  new SaudacaoDto(
            contador.incrementAndGet(), 
            String.format(modelo, nome)
            );
    }

}
