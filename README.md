Interface do microsserviço Order (contrato Feign + DTOs).

A implementação fica em [Order-service](https://github.com/pato-nego/Order-service).

## Endpoints


| Método | Rota                   | Descrição                                                                                                                       |
| --------- | ------------------------ | ----------------------------------------------------------------------------------------------------------------------------------- |
| POST    | `/orders`              | Cria um pedido para o usuário logado (201; 400 se o produto não existir)                                                        |
| GET     | `/orders`              | Lista os pedidos do usuário logado (200)                                                                                         |
| GET     | `/orders/{id}`         | Detalha um pedido do usuário (200; 404 se não for dele). `?currency=BRL` converte os totais (422 se a moeda não for suportada) |
| GET     | `/orders/health-check` | 200 enquanto o serviço está de pé, sem corpo                                                                                   |

O usuário vem no header `id-account`, que o gateway define depois de validar o cookie `__store_jwt_token`.

## Instalação

```sh
mvn clean install
```

Rode antes de compilar o `Order-service`
