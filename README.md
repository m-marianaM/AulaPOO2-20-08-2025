# aluno-webservice

Projeto Maven Java 17 + Spring Boot 3

## Como rodar

```sh
mvn spring-boot:run
```

## Endpoints

- GET /alunos → listar todos os alunos
- GET /alunos/{id} → buscar aluno por idaluno
- POST /alunos → inserir novo aluno
- PUT /alunos/{id} → atualizar aluno existente
- DELETE /alunos/{id} → excluir aluno

## Exemplo de JSON de request

```json
{
  "nome": "Maria Silva",
  "curso": "Engenharia",
  "idade": 22
}
```

## Comandos curl para teste

Listar todos:
```
curl -X GET http://localhost:8080/alunos
```
Buscar por id:
```
curl -X GET http://localhost:8080/alunos/1
```
Inserir novo:
```
curl -X POST http://localhost:8080/alunos -H "Content-Type: application/json" -d '{"nome":"João","curso":"Matemática","idade":20}'
```
Atualizar:
```
curl -X PUT http://localhost:8080/alunos/1 -H "Content-Type: application/json" -d '{"nome":"João","curso":"Física","idade":21}'
```
Excluir:
```
curl -X DELETE http://localhost:8080/alunos/1
```
