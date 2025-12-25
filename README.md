1 - Descrição do Projeto (versão profissional)

Sistema de Gestão Técnica para Bibliotecas, desenvolvido como aplicação web, com o objetivo de gerenciar o cadastro de livros, alunos e funcionários, bem como o controle de empréstimos.
O sistema permite acompanhar livros disponíveis e emprestados, registrar histórico de empréstimos e disponibilizar informações detalhadas das obras, incluindo sinopse e imagem de capa, simulando um ambiente real de biblioteca acadêmica ou institucional.
Esse texto você pode usar direto no PDF, no GitHub e no LinkedIn.

2️ - Escopo Funcional (o que o sistema faz)
Autenticação
Login de funcionários
Controle de acesso ao sistema

Gestão de Livros
Cadastro de livros:
Título
Autor
ISBN
Ano de publicação
Categoria
Sinopse
Imagem da capa
Edição e exclusão de livros
Listagem de livros disponíveis e emprestados

Gestão de Alunos
Cadastro de alunos
Consulta e edição
Associação com empréstimos

Gestão de Funcionários
Cadastro de funcionários
Controle de acesso ao sistema

Empréstimos
Registro de empréstimos de livros
Associação:
Livro
Aluno
Funcionário responsável
Data de empréstimo
Data prevista de devolução
Status:
  Emprestado
  Devolvido
  Atrasado

Dashboard
Total de livros cadastrados
Livros emprestados
Livros disponíveis
Empréstimos em atraso

3️ Entidades principais do sistema
Livro
Aluno
Funcionário
Empréstimo

4️ Stack Tecnológica
Backend: Java, Spring Boot
Frontend: HTML, CSS, Bootstrap, JavaScript
Banco de dados: Postgree
Upload de imagens: pasta local ou base64
Versionamento: Git + GitHub
