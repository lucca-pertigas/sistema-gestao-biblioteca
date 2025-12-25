1 - Descrição do Projeto (versão profissional)

Sistema de Gestão Técnica para Bibliotecas, desenvolvido como uma aplicação web, com o objetivo de gerenciar o cadastro de livros, alunos e funcionários, bem como o controle de empréstimos e devoluções.

O sistema permite acompanhar livros disponíveis e emprestados, manter o histórico de empréstimos e disponibilizar informações detalhadas das obras, incluindo sinopse e imagem da capa, simulando um ambiente real de biblioteca acadêmica ou institucional.

2️ - Escopo Funcional (o que o sistema faz)
Autenticação:
  Login de alunos e funcionários
  
  Controle de acesso ao sistema de acordo com o perfil do usuário

Gestão de Livros:
Cadastro de livros contendo:

  Título
  
  Autor
  
  ISBN
  
  Ano de publicação
  
  Categoria
  
  Sinopse
  
  Imagem da capa

Edição e exclusão de livros

Listagem de livros disponíveis e emprestados

Gestão de Alunos:
Cadastro de alunos

Consulta e edição de dados

Associação de alunos aos empréstimos realizados

Gestão de Funcionários
Cadastro de funcionários

Controle de permissões e acesso ao sistema

Empréstimos
Registro de empréstimos de livros

Associação entre:

  Livro
  
  Aluno
  
  Funcionário responsável

Registro de:

  Data do empréstimo
  
  Data prevista de devolução
  
  Data de devolução

Controle de status:

  Emprestado
  
  Devolvido
  
  Atrasado

Dashboard:
Total de livros cadastrados

Quantidade de livros emprestados

Quantidade de livros disponíveis

Empréstimos em atraso

3️ - Entidades principais do sistema
Livro

Aluno

Funcionário

Empréstimo

4️  - Stack Tecnológica
Backend: Java + Spring Boot

Frontend: HTML, CSS, Bootstrap, JavaScript

Banco de Dados: PostgreSQL

Upload de Imagens: Armazenamento em pasta local ou Base64

Versionamento: Git + GitHub
