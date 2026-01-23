
```
# 🌟 API de Produtos com Spring Boot

Este projeto é uma **API REST de Produtos** desenvolvida em **Java com Spring Boot**, permitindo realizar operações CRUD (Create, Read, Update, Delete) sobre produtos.  

O objetivo do projeto é **praticar desenvolvimento de APIs REST, manipulação de dados em memória e Spring Boot**.

---

## 🎯 Objetivos

- Criar uma API REST funcional para cadastro e gerenciamento de produtos.
- Implementar operações **CRUD** (Create, Read, Update, Delete).
- Trabalhar com Spring Boot, Controllers, Services e Request/Response JSON.
- Permitir testes locais simples usando ferramentas como **Postman** ou **Insomnia**.
- Garantir endpoints claros, incluindo um endpoint de teste `/produtos/hello`.

---

## 🛠 Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot** (Web)
- **Maven** (gerenciamento de dependências)
- **Postman** (testes de API)
- IDE sugerida: **IntelliJ IDEA** ou **Eclipse**
- Sistema operacional: qualquer SO que suporte Java

---

## 📦 Estrutura do Projeto

```

src/
└── main/
├── java/
│    └── com.bootcampjava.springapp/
│         ├── controller/ProdutoController.java   # Controlador REST
│         ├── model/Produto.java                # Classe modelo de produto
│         └── service/ProdutoService.java      # Lógica CRUD em memória
└── resources/
└── application.properties                # Configurações do Spring Boot

````

---

## 🚀 Como Executar na Máquina

1. Clone o repositório:

```bash
git clone <URL_DO_REPOSITORIO>
````

2. Acesse a pasta do projeto:

```bash
cd springapp
```

3. Rode a aplicação com Maven:

```bash
mvn spring-boot:run
```

> A API estará disponível em: `http://localhost:8080`

---

## 📌 Endpoints Disponíveis

### 1️⃣ Endpoint de teste

* **GET** `/produtos/hello`
* Retorno: `"API de Produtos rodando Springboot"`

---

### 2️⃣ Criar Produto

* **POST** `/produtos`
* **Headers:** `Content-Type: application/json`
* **Body JSON:**

```json
{
  "nome": "Notebook",
  "preco": 3500.00,
  "estoque": true
}
```

* Retorno: Produto criado com ID incremental, status `201 Created`.

---

### 3️⃣ Listar Todos os Produtos

* **GET** `/produtos`
* Retorno: Lista de produtos em JSON, status `200 OK`.

---

### 4️⃣ Buscar Produto por ID

* **GET** `/produtos/{id}`
* Substitua `{id}` pelo ID retornado no POST
* Retorno: Produto ou `404 Not Found`.

---

### 5️⃣ Atualizar Produto

* **PUT** `/produtos/{id}`
* **Headers:** `Content-Type: application/json`
* **Body JSON:**

```json
{
  "nome": "Notebook Gamer",
  "preco": 4200.00,
  "estoque": false
}
```

* Retorno: Produto atualizado ou `404 Not Found`.

---

### 6️⃣ Deletar Produto

* **DELETE** `/produtos/{id}`
* Retorno: Status `204 No Content` se removido ou `404 Not Found` se não existir.

---

## 💻 Testando no Postman

1. Teste `/produtos/hello` para verificar se API está rodando.
2. Crie produtos com **POST** `/produtos`.
3. Liste produtos com **GET** `/produtos`.
4. Busque produtos individuais com **GET** `/produtos/{id}`.
5. Atualize produtos com **PUT** `/produtos/{id}`.
6. Delete produtos com **DELETE** `/produtos/{id}`.

> ⚠️ Sempre copie o `id` retornado pelo POST para testar os endpoints GET, PUT e DELETE.

---

## 📝 Observações

* O **banco de dados é simulado em memória** (lista no `ProdutoService`), então os dados se perdem ao reiniciar a aplicação.
* IDs são **incrementais** (1,2,3...) para facilitar testes.
* Use `Content-Type: application/json` para requisições POST e PUT.

---

Feito com ❤️ por Thymos Victor

```
