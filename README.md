# 📦 API de Gestão (Clientes, Produtos e Pedidos)

## 🧠 Descrição

API REST desenvolvida em Spring Boot para gerenciamento de:

* Clientes
* Produtos
* Pedidos

Permite operações completas de CRUD (Create, Read, Update, Delete).

---

## 🚀 Tecnologias utilizadas

* Java
* Spring Boot
* Maven

---

## ⚙️ Como executar o projeto

### Pré-requisitos

* Java instalado
* Maven instalado

### Passos

```bash
git clone https://github.com//GitBrowserBit/api_rest_baozi_store.git
cd api_rest_baozi_store
mvn spring-boot:run
```

---

# 📌 Endpoints da API

---

## 👤 CLIENTES

### 🔹 Listar clientes

GET /clientes

---

### 🔹 Criar cliente

POST /clientes

```json
{
  "nome": "João Silva",
  "clienteDesde": "2026-03-21"
}
```

---

### 🔹 Atualizar cliente

PUT /clientes/{id}

```json
{
  "nome": "Thiago Lopes Machado",
  "clienteDesde": "2026-03-20"
}
```

---

### 🔹 Deletar cliente

DELETE /clientes/{id}

---

## 📦 PRODUTOS

### 🔹 Listar produtos

GET /produtos

---

### 🔹 Criar produto

POST /produtos

```json
{
  "nomeProduto": "Baozi de frango",
  "preco": 13.50,
  "estoque": 20
}
```

---

### 🔹 Atualizar produto

PUT /produtos/{id}

```json
{
  "nomeProduto": "Baozi de frango",
  "preco": 12.50,
  "estoque": 30
}
```

---

### 🔹 Deletar produto

DELETE /produtos/{id}

---

## 🧾 PEDIDOS

### 🔹 Listar pedidos

GET /pedidos

---

### 🔹 Criar pedido

POST /pedidos

```json
{
  "clienteId": 1,
  "produtoId": 2,
  "quantidade": 3
}
```

---

### 🔹 Atualizar pedido

PUT /pedidos/{id}

```json
{
  "clienteId": 1,
  "produtoId": 2,
  "quantidade": 5
}
```

---

### 🔹 Deletar pedido

DELETE /pedidos/{id}

---

## 📁 Estrutura do projeto

```
src/
 ├── controller/
 ├── repository/
 └── model/
```

---

## 🧪 Testes

Os endpoints foram testados utilizando o Postman.

---

## 👨‍💻 Autor

Thiago Lopes Machado.

---

## 📄 Licença

Este projeto está sob a licença MIT.
