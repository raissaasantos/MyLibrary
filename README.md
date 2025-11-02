# ✴️ Conteúdos

- [📚 Biblioteca Pessoal de Livros](#biblioteca-pessoal-de-livros)
- [✨ Funcionalidades](#funcionalidades)
- [🏗️ Arquitetura & Estrutura do Projeto](#arquitetura--estrutura-do-projeto)
- [✨ Estrutura de Pacotes](#estrutura-de-pacotes)
- [🗄️ Modelo de Banco de Dados](#modelo-de-banco-de-dados)
- [🐳 Docker](#docker)
- [🚀 Começando](#começando)
- [📝 Uso](#uso)
- [📈 Roadmap & Funcionalidades Futuras](#roadmap--funcionalidades-futuras)
- [📜 Licença](#licença)

---

# 📚 Biblioteca Pessoal de Livros

Um poderoso gerenciador pessoal de leitura construído em **Java** com **Spring Boot**, **MySQL** e **Angular** para interface.  
Permite controlar livros, autores e quotes com filtros avançados e importação opcional via APIs externas.

---

# ✨ Funcionalidades

## Livros & Autores

- Adicionar, listar e buscar livros.
- Adicionar, listar e buscar autores.
- Associar livros aos autores.
- Importar dados de livros de APIs externas (ex.: Google Books) caso não estejam na biblioteca.

## Quotes

- Adicionar, listar e gerenciar quotes.
- Gerar quotes aleatórias.
- Associar quotes a autores ou livros.

---

# 🏗️ Arquitetura & Estrutura do Projeto

O backend segue uma **arquitetura em camadas**:

### Camada de Modelo (Domain Layer)

Entidades:  
`Autor, Livro, Quote, Tag, Fanfics`

### Repository (Data Access Layer)

Responsável pelas operações CRUD no MySQL via **Spring Data JPA**:  
`AutorRepository, LivroRepository, QuoteRepository, TagRepository`

### Service (Camada de Lógica de Negócio)

Implementa regras de negócio como:

- Buscar livros via API externa
- Gerar quotes aleatórias
- Filtrar livros por tags
- Atualizar status de empréstimos

### Controller

Exposição de **endpoints REST** para integração com frontend Angular ou testes via Postman.

---

# ✨ Estrutura de Pacotes

```
backend/
└── src/main/java/com/libraryapp/
├── model/
├── repository/
├── service/
└── controller/
└── src/main/resources/
└── application.properties
```
```
frontend/
└── (Angular project)
```
```
docker/
├── Dockerfile.backend
├── Dockerfile.frontend
└── docker-compose.yml
```
---


---

# 🗄️ Modelo de Banco de Dados

### Tabelas

- **author**(id, nome, data_nascimento)
- **book**(id, titulo, ano, genero, author_id)
- **quote**(id, texto, author_id)
- **tag**(id, nome)

### Relacionamentos

- 1:N → Livro → Autor
- 1:N → Quote → Autor
- N:N → Livro ↔ Tag

---

# 🚀 Começando

## Pré-requisitos

- Java 17+
- MySQL 8+
- Angular 11+
- Spring Boot 3+
- Opcional: chave API para busca externa de livros (Google Books API)

## Configuração

1. Configurar banco MySQL (`library_db`) e credenciais em `application.properties`.
2. Rodar backend Spring Boot:
   ```bash
   ./mvnw spring-boot:run
---

# 📝 Uso

- Adicione autores, livros e quotes via frontend ou endpoints REST.
- Busque livros localmente ou via API externa.
- Filtre livros por tags ou título.
- Gere quotes aleatórias a qualquer momento.

### Menu Exemplo (CLI ou testes)

1. Adicionar Livro
2. Listar Livros
3. Buscar Livro (Local / API)
4. Filtrar Livros por Tags
5. Adicionar Autor
6. Listar Autores
7. Adicionar Quotes
8. Listar Quotes
9. Gerar Quote Aleatório

---

# 📈 Roadmap & Funcionalidades Futuras

- Autenticação de usuários e roles (admin vs usuário)
- Sistema de popularidade/votação para quotes e livros
- Busca avançada de livros (filtros multi-tag)

---

# 📜 Licença

Este projeto está licenciado sob a **MIT License**.

