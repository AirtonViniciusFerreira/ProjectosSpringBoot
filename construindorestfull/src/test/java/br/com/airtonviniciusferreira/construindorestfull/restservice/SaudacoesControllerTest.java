package br.com.airtonviniciusferreira.construindorestfull.restservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import br.com.airtonviniciusferreira.construindorestfull.restservice.dto.SaudacaoDto;

@SpringBootTest
@AutoConfigureMockMvc
public class SaudacoesControllerTest {

    @Autowired
    private MockMvc mvc;

    private static long PADRAO_SAUDACAO_ID = 1;
    private final static String PADRAO_SAUDACAO_NOME = "Mundo";

    private final static String SAUDACAO_NOME = "Tester";

    private final static String PADRAO_MENSAGEM = "Olá, %s!";

    @Test
    public void getSaudacaoPadrao() throws Exception {
        SaudacaoDto saudacaoDto = new SaudacaoDto(
            PADRAO_SAUDACAO_ID++,
            String.format(PADRAO_MENSAGEM, PADRAO_SAUDACAO_NOME)
       );

        this.mvc
            .perform(MockMvcRequestBuilders
                .get("/saudacoes")
                .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$.id").value(saudacaoDto.id()))
            .andExpect(jsonPath("$.conteudo").value(saudacaoDto.conteudo()));
    }

    @Test
    public void getSaudacaoParametro() throws Exception {
       SaudacaoDto saudacaoDto = new SaudacaoDto(
            PADRAO_SAUDACAO_ID++,
            String.format(PADRAO_MENSAGEM, SAUDACAO_NOME)
       );

        this.mvc
            .perform(MockMvcRequestBuilders
                .get("/saudacoes")
                .param("nome", SAUDACAO_NOME)
                .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.id").value(saudacaoDto.id()))
            .andExpect(jsonPath("$.conteudo").value(saudacaoDto.conteudo()));
    }

}
