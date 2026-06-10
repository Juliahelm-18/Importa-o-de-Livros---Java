# 📚 Projeto de Importação de Livros

Sistema desenvolvido em Java para realizar a importação de dados de livros a partir de um arquivo CSV e armazená-los em um banco de dados SQLite utilizando JDBC.

## 🚀 Funcionalidades

* Importação de livros via arquivo CSV
* Armazenamento dos dados em banco SQLite
* Leitura e mapeamento dos registros para objetos Java
* Exibição da quantidade de registros importados
* Exibição da quantidade de atributos por registro
* Listagem dos livros ordenados por título
* Listagem dos livros ordenados por ano de publicação
* Menu interativo via console

## 🛠️ Tecnologias Utilizadas

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge\&logo=openjdk\&logoColor=white)
![SQLite](https://img.shields.io/badge/SQLite-07405E?style=for-the-badge\&logo=sqlite\&logoColor=white)

## 📂 Estrutura do Projeto

```text
src/
├── model/
│   └── Livro.java
├── dao/
│   └── LivroDAO.java
├── database/
│   └── Conexao.java
├── util/
│   └── LeitorCSV.java
├── service/
│   └── Importador.java
└── Main.java
```

## 📖 Tema Escolhido

O projeto utiliza um catálogo de livros de autores como:

* Raphael Montes
* Freida McFadden
* Stephen King

Os registros são armazenados com os seguintes atributos:

* ID
* Título
* Autor
* Ano de Publicação
* Gênero

## ▶️ Como Executar

1. Clone o repositório.
2. Abra o projeto em sua IDE Java.
3. Adicione o driver JDBC do SQLite.
4. Execute a classe `Main.java`.
5. Utilize o menu para importar e consultar os livros.

## 📋 Exemplo de Menu

```text
1 - Importar CSV
2 - Listar por Título
3 - Listar por Ano
0 - Sair
```



