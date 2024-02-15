
PicPay Simples
Projeto: Aplicativo Spring Boot para realizar transferências simples entre contas do PicPay.

Sobre o Projeto
O PicPay Simples é uma aplicação de exemplo desenvolvida em Java utilizando o framework Spring Boot. O objetivo deste projeto é demonstrar como criar uma aplicação que gerencia transações financeiras entre usuários.

Funcionalidades:

Criar usuários
Consultar saldo
Realizar transferências
Tecnologias utilizadas:

Spring Boot
Java 17
JPA
Hibernate
Lombok
RestTemplate (para simular interações externas)
Configuração:

Banco de dados H2 em memória (para desenvolvimento)
Propriedades definidas no arquivo application.properties
Como executar:

Clone o repositório.
Execute o comando mvn clean install no terminal.
Acesse o console H2 em http://localhost:8080/h2-console.
Use o usuário sa e senha em branco para conectar.
Documentação:

A API é documentada usando anotações Swagger. Acesse a documentação em http://localhost:8080/swagger-ui/index.html.
Para saber mais sobre as entidades e serviços do projeto, consulte os arquivos Java nas pastas domain e services.
Contribuição:

Sugestões e pull requests são bem-vindas!
Licença:

MIT
Observações:

Este projeto é um exemplo para fins educacionais e não reflete necessariamente a implementação oficial do PicPay.
As interações externas (autorização de transações e envio de notificações) são simuladas usando mockAPIs.
Espero que este README seja útil!
