# Contruindo Aplicativo
Aprendendo o basico para criação de uma aplicação spring boot

- Aprendendo a construir um aplicativo com Spring Boot
- Aprendendo a contruir testes unitarios
- Aprendendo a contruir testes de integração
- Aprendendo a Iniciar os teste
- Aprendendo a configurar monitorar

# Arquitetura
Projeto criado em ```spring boot 3.4.0-SNAPSHOT```, utilizando ```java 21```, desenvolvido utilizando ```dev container``` 

# Criação de rotas
Criando a roda padrão ```/``` , com uma mensagem de
```
Saudações do Spring Boot!\n
```

# Dependencias
Adicionando as dependencias para o testes, e para o monitoramento 

- Para o teste foi adicionado :

    ```
    spring-boot-starter-test
    ```
- Para o monitoramento foi adicionado o 
    ```
    spring-boot-starter-actuator
    ```

para que possa instalar as dependencias basta rodar o comando:

```
./mvnw install
```

# Teste

O teste apresentam em duas classes, para os testes unitarios o sulfixo é ```Test.java```, já para os testes de integraçaão o sulfixo é ```ITest.java```

Para iniciar o teste rode o comando:

```
./mvnw test
```

# Iniciar

Para iniciar a aplicação rode o comando:

```
./mvnw spring-boot:run
```

# Monitoramento

Para consultar as url basta acessa-las
- Acessar os links disponiveis no actuator:
    ```
    http://localhost:8080/actuator
    ```

- Acessar a saude da aplicação:
    ```
    curl http://localhost:8080/actuator/health
    ```



- Para a aplicação
    ```
    curl -X POST http://localhost:8080/actuator/shutdown
    ```
é possivel destivar essa opção de desligamento deixando a propriedade ```management.endpoint.shutdown.enabled=true``` no arquivo ```application.properties``` com o valor ```false```