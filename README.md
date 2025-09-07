# ✴️ Conteúdos

- [📚 Biblioteca Pessoal de Livros](#1)
    - [Livros & Autores](#1.2)
  - [Quotes](#1.3)
- [🏗️ Arquitetura & Estrutura do Projeto](#2)
  - [Camada de Modelo](#2.1)
  - [DAO](#2.2)
  - [Service](#2.3)
  - [Main/Controller](#2.4)
- [✨ Estrutura de Pacotes](#3)
- [🗄️ Modelo de Banco de Dados](#4)
  - [Tabelas](#4.1)
  - [Relacionamentos](#4.2)
- [🚀 Começando](#5)
  - [Pré-requisitos](#5.1)
  - [Configuração](#5.2)
- [📝 Uso](#6)
  - [Menu](#6.1)
- [📈 Roadmap & Funcionalidades Futuras](#7)
- [📜 Licença](#8)
---
# 📚 Biblioteca Pessoal de Livros

Um poderoso gerenciador pessoal de leitura construído em **Java** (sem frameworks) com **MySQL**, e **Angular** 
para interface. 
Permite controlar livros, autores, e quotes com filtros avançados e importação opcional via APIs 
externas.

---

## ✨ Funcionalidades

### Livros & Autores

* Adicionar, listar e buscar livros.
* Adicionar, listar e buscar autores.
* Associar livros aos autores.
* Importar dados de livros de APIs externas (ex.: Google Books) caso não estejam na biblioteca.

### Quotes

* Adicionar, listar e gerenciar quotes.
* Gerar quotes aleatórias.
* Associar quotes a autores ou livros.

---

## 🏗️ Arquitetura & Estrutura do Projeto

O backend segue uma **arquitetura em camadas**:

### Camada de Modelo (Domain Layer)

Entidades:
`Autor, Livro, Quotes, Fanfics, Tag`

### DAO (Data Access Layer)

Responsável pelas operações CRUD no MySQL via JDBC:
`AutorDAO, LivroDAO, QuoteDAO, TagDAO`

### Service (Camada de Lógica de Negócio)

Implementa regras de negócio como:

* Buscar livros via API externa
* Gerar quotes aleatórias
* Filtrar livros por tags
* Atualizar status de empréstimos

### Main / Controller

Terminal-based ou endpoints simulados para testes.

---

## ✨ Estrutura de Pacotes

```
src/
 └── main/
     ├── java/com/libraryapp/
     │   ├── model/
     │   ├── dao/
     │   ├── service/
     │   └── main/
     └── resources/
         └── db.properties
```

---

## 🗄️ Modelo de Banco de Dados

### Tabelas:

* **author**(id, nome, data\_nascimento)
* **book**(id, titulo, ano, genero, author\_id)
* **quote**(id, texto, author\_id)
* **tag**(id, nome)


### Relacionamentos:

* 1\:N → Livro → Autor
* 1\:N → Citação → Autor
* N\:N → Livros ↔ Tag

---

## 🚀 Começando

### Pré-requisitos

* Java 17+
* MySQL 8+
* Angular 11
* Biblioteca JDBC (já vem com Java)
* Opcional: chave API para busca externa de livros (Google Books API)

### Configuração

1. Criar banco MySQL (ex.: `library_db`)
2. Configurar conexão em `resources/db.properties`
3. Executar scripts SQL para criar tabelas

---

## 📝 Uso

* Adicione autores, livros e quotes via menu.
* Busque livros localmente ou via API externa.
* Filtre livros por tags ou título.
* Gere quotes aleatórias a qualquer momento.

### Menu Exemplo:

1. Adicionar Livro;
2. Listar Livros;
3. Buscar Livro (Local / API);
4. Filtrar Livros por Tags;
5. Adicionar Autor;
6. Listar Autores;
7. Adicionar Quotes;
8. Listar Quotes;
9. Gerar Quote Aleatório.

---

## 📈 Roadmap & Funcionalidades Futuras

* Autenticação de usuários e roles (admin vs usuário)
* Sistema de popularidade/votação para quotes e livros.
* Busca avançada de livros (filtros multi-tag)

---

## 📜 Licença

Este projeto está licenciado sob a **MIT License**.

---
