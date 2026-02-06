
```markdown
# Sistema CRUD de Produtos

## Descrição

Este é um **sistema CRUD de produtos** desenvolvido com **Spring Boot**, permitindo **criar, listar, atualizar e deletar produtos**.  
O sistema possui **front-end estático** em HTML, CSS e JavaScript, integrado ao backend Spring Boot, e utiliza **PostgreSQL** como banco de dados.  

O projeto foi **deployado na Azure**, permitindo que seja acessado via URL pública, mas também pode ser executado localmente para desenvolvimento.

> ⚠️ **Importante:** Todo o código funcional está na branch `mapper`. Para rodar corretamente, você deve fazer checkout para essa branch.

---

## Tecnologias Utilizadas

- **Java 21**  
- **Spring Boot**  
- **Maven**  
- **PostgreSQL**  
- **HTML, CSS e JavaScript** (front-end estático)  
- **IntelliJ IDEA** (IDE)  
- **Azure** (deploy do backend)  

---

## Estrutura do Projeto

```

springapp/
├─ src/main/java/com/bootcampjava/springapp
│  ├─ controller/        # Controladores REST
│  ├─ model/             # Modelos/Entidades
│  ├─ repository/        # Repositórios JPA
│  └─ service/           # Serviços de negócio
├─ src/main/resources/
│  ├─ application.properties  # Configurações do Spring
│  └─ static/                  # Front-end (index.html, style.css, script.js)
└─ pom.xml                      # Configuração Maven

````

---

## Funcionalidades

1. **Criar produtos** com nome, descrição e preço.  
2. **Listar produtos** em uma tabela dinâmica.  
3. **Editar produtos** existentes.  
4. **Deletar produtos**.  
5. **Integração com front-end** estático servido pelo Spring Boot ou via Azure.  

---

## Como Rodar Localmente

### Pré-requisitos

- Java 21 instalado  
- Maven instalado  
- PostgreSQL rodando localmente  
- IntelliJ IDEA (opcional, mas recomendado)

### Passo a passo

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/CRUD-de-Produtos-Springboot.git
cd CRUD-de-Produtos-Springboot/springapp
````

2. Faça checkout para a **branch `mapper`**, onde o código está funcionando:

```bash
git checkout mapper
```

3. Compile e rode o projeto:

```bash
mvn clean install
mvn spring-boot:run
```

4. Acesse o sistema via navegador:

```
http://localhost:8081/index.html
```

---

## Como Acessar no Azure

O projeto está deployado na Azure com a seguinte URL:

```
https://bootcamp-produtos-thymos.azurewebsites.net/produtos
```

* O backend e o front-end estão integrados.
---

## Observações

* Todos os arquivos front-end estão dentro de `src/main/resources/static/`.
* Para atualizar o front-end, basta substituir os arquivos e redeployar o backend no Azure.
* **É obrigatório estar na branch `mapper` para que o projeto funcione corretamente**, tanto localmente quanto em deploy.

---

## Autor

**Thymos Victor Leal**

* GitHub: [thymosvictor](https://github.com/thymosvictor)
* Projeto feito como estudo e deploy em Azure.

---


```


