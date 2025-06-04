CREATE DATABASE IF NOT EXISTS sistema_escolar;
USE sistema_escolar;

CREATE TABLE login (
    id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(100) UNIQUE NOT NULL,
    senha VARCHAR(255) NOT NULL,
    tipo_usuario ENUM('aluno', 'professor') NOT NULL,
    primeiro_acesso BOOLEAN DEFAULT TRUE
);

CREATE TABLE aluno (
    id INT AUTO_INCREMENT PRIMARY KEY,
    login_id INT NOT NULL,
    nome VARCHAR(100) NOT NULL,
    matricula VARCHAR(20) UNIQUE NOT NULL,
    curso VARCHAR(100),
    FOREIGN KEY (login_id) REFERENCES login(id) ON DELETE CASCADE
);

CREATE TABLE professor (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    disciplina VARCHAR(100),
    FOREIGN KEY (login_id) REFERENCES login(id) ON DELETE CASCADE
);
CREATE TABLE recuperar_senha (
    id INT AUTO_INCREMENT PRIMARY KEY,
    login_id INT NOT NULL,
    criado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (login_id) REFERENCES login(id) ON DELETE CASCADE
);

