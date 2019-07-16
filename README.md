# Sistema_Pedidos
Teste Xbrain sistema de pedidos em Java, utilizando Spring Boot

# Informações

Para consumir a API utilizar a rota: http://localhost:8080/api/v1/pedido
* É necessário enviar o método que desejar chamar;
  * Para criar novo Pedido enviar request com o método: POST
  * Para retornar lista de Pedidos enviar request com o método: GET
  
* O modelo de Json para envio deve respeitar o contrato REST descrito:

                * {
                    "codigo_cliente": Long,
                    "codigo_produtos": Long,
                    "valor_total": Double,
                    "endereco_entrega": "String"
                  }
                  
# Próximos Passos

* Criar Table no BD chamada Entrega;
* Implementar o RabbitMQ para criar um lista de pedidos com os dados:

  - Endereço
  - IdPedido
	
Para posteriormente persistir esses dados em uma outra Table do BD denominada Entrega;
