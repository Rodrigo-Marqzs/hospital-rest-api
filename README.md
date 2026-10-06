# 🏥 Hospital API

API REST para gerenciamento hospitalar (pacientes, médicos e consultas), desenvolvida com **Java, Spring Boot, JPA/Hibernate e PostgreSQL**.

> 🚧 **Projeto em desenvolvimento.** Criado como projeto de estudo para praticar desenvolvimento backend, boas práticas de arquitetura em camadas e segurança de APIs. O progresso está registrado no histórico de commits, sessão por sessão.

## 🛠️ Tecnologias

- Java 17
- Spring Boot 4.0.7
- Spring Web MVC
- Spring Data JPA + Hibernate
- PostgreSQL
- Spring Security
- Maven

## 📌 Funcionalidades

**Já implementado**
- [x] Estrutura inicial do projeto com Spring Boot
- [x] Endpoint de verificação (`GET /health`)
- [x] Modelagem das classes `Paciente`, `Medico` e `Consulta`
- [x] `Paciente` mapeado como entidade JPA (`@Entity`, `@Id`, `@GeneratedValue`)

**Em desenvolvimento / planejado**
- [ ] Conexão com PostgreSQL e criação automática da tabela `paciente`
- [ ] Entidades `Medico` e `Consulta` com relacionamentos (`@ManyToOne`)
- [ ] Camada de acesso a dados (Repository)
- [ ] Camadas Service e Controller com CRUD completo de pacientes
- [ ] CRUD de médicos e agendamento de consultas, com regras de negócio
- [ ] Autenticação e autorização com Spring Security + JWT
- [ ] Documentação da API com Swagger/OpenAPI
- [ ] Testes automatizados

## 🧱 Modelo de domínio

```
Paciente 1 ──── N Consulta N ──── 1 Medico
```

| Entidade | Atributos principais |
|---|---|
| Paciente | id, nome, cpf, email |
| Medico | id, nome, especialidade, crm |
| Consulta | id, paciente, medico, motivo |

> O `id` é gerado pelo banco. CPF e CRM são tratados como campos de identificação do mundo real, e não como chave primária.

## ▶️ Como executar

**Pré-requisitos:** Java 17, Maven (ou o `mvnw` incluído) e PostgreSQL instalado.

1. Clone o repositório:
   ```bash
    git clone https://github.com/Rodrigo-Marqzs/hospital-rest-api.git
    cd hospital-rest-api
   ```
2. Crie o banco de dados no PostgreSQL:
   ```sql
   CREATE DATABASE hospital_db;
   ```
3. Defina a senha do banco como variável de ambiente (ela não fica no código):
   ```bash
   # Windows (PowerShell)
   $env:DB_PASSWORD="sua_senha"

   # Linux / macOS
   export DB_PASSWORD="sua_senha"
   ```
4. Execute a aplicação:
   ```bash
   ./mvnw spring-boot:run
   ```
5. Teste em `http://localhost:8080/health`.

## 🔐 Configuração e segurança

- A senha do banco é lida da variável de ambiente `DB_PASSWORD` e nunca é versionada.
- Os dados usados em testes são fictícios.
- Por tratar dados pessoais de saúde, o projeto considera a **LGPD** como requisito para as próximas etapas.

## 📂 Estrutura do projeto

```
src/main/java/com/rodrigo/hospitalapi
├── config        # Configurações (Spring Security)
├── controller    # Endpoints da API
└── model         # Entidades de domínio
```

## 📚 Aprendizados

Este projeto é construído em sessões curtas de estudo, e cada commit segue o padrão `Sessão N.X - Tema`. O objetivo é consolidar:

- Orientação a objetos e persistência com JPA/Hibernate
- Arquitetura em camadas (Controller, Service, Repository)
- Modelagem relacional e boas práticas de chave primária
- Segurança de APIs e proteção de dados sensíveis
- Versionamento com Git e GitHub

## 👤 Autor

**Rodrigo Marques**
[GitHub](https://github.com/Rodrigo-Marqzs)