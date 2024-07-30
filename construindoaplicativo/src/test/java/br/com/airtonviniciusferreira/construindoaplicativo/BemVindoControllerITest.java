package br.com.airtonviniciusferreira.construindoaplicativo;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BemVindoControllerITest {

    @Autowired
    private TestRestTemplate template;

    
    @Test
    public void getBemVindo() {
        ResponseEntity<String> response = template.getForEntity("/", String.class);
        assertThat(response.getBody()).isEqualTo("Saudações do Spring Boot!\n");
    }

    @Test void getBemVindoNoEqual() {
        ResponseEntity<String> response = template.getForEntity("/", String.class);
        assertThat(response.getBody()).isNotEqualTo("Hello Word!");
    }

}
