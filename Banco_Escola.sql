-- Criação do banco de dados
DROP DATABASE IF EXISTS escola;
CREATE DATABASE escola;
USE escola;

-- Tabela de alunos
CREATE TABLE IF NOT EXISTS alunos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL UNIQUE
);

-- Tabela de notas
CREATE TABLE IF NOT EXISTS notas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    aluno VARCHAR(100) NOT NULL,
    disciplina VARCHAR(100) NOT NULL,
    nota DECIMAL(5,2) NOT NULL,
    FOREIGN KEY (aluno) REFERENCES alunos(nome) ON DELETE CASCADE
);

-- Tabela de trabalhos
CREATE TABLE IF NOT EXISTS trabalhos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    aluno VARCHAR(100) NOT NULL,
    trabalho VARCHAR(100) NOT NULL,
    data_entrega DATE NOT NULL,
    FOREIGN KEY (aluno) REFERENCES alunos(nome) ON DELETE CASCADE
);

-- Inserção de alunos
INSERT INTO alunos (nome) VALUES 
('João da Silva'),
('Maria Oliveira');

-- Inserção de notas
INSERT INTO notas (aluno, disciplina, nota) VALUES
('João da Silva', 'Matemática', 8.5),
('João da Silva', 'Português', 7.0),
('Maria Oliveira', 'História', 9.0);

-- Inserção de trabalhos
INSERT INTO trabalhos (aluno, trabalho, data_entrega) VALUES
('João da Silva', 'Trabalho de Matemática', '2025-06-10'),
('João da Silva', 'Redação', '2025-06-15'),
('Maria Oliveira', 'Pesquisa de História', '2025-06-20');