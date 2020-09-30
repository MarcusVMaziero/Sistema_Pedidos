# Sistema_Pedidos
 Sistema de pedidos em Java, utilizando Spring Boot, RabbitMq e H2
 
 Para saber mais sobre as tecnologias
 
 Java: https://docs.oracle.com/javase/8/docs/api/
 
 Spring-Boot: https://spring.io/projects/spring-boot
 
 RabbitMq: https://www.rabbitmq.com/
 
 H2: https://www.h2database.com/html/main.html

# Documentação
 A documentação do Projeto esta disponivel pelo swagger
 
 Para acessar basta rodar o projeto e acessar via navegador o link: http://localhost:8080/swagger-ui.html

# Próximos Passos

 -Quebrar os projeto em 3 com Pedido, Entrega e Cliente e efetivar a comunicação entre eles com o RabbitMq
 
 -Cliente service deve ser responsavel pelos dados do cliente e sua conta
 
 -Entrega service deve realizar o processo de permitir a consulta de entregas e seu gerenciamento
 
 -Pedido service deve criar novos endpoint´s para consulta e gerenciamento
 
 -Externizar configurações do RabbitMq
 
 -Criar projeto com "libs" dados gerais que podem ser usados por todos os services .jar
 
 -Criar frontEnd
