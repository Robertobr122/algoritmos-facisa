# Library Management System - University Project

This project was developed as part of the **Analysis and Algorithm Techniques (ATAL)** course at our university. Together with my groupmates, we worked on creating a **Library Management System**, which initially used **linked lists** and later evolved to work with **binary trees** for better data structuring.

## Project Overview

The main goal of the system is to manage a collection of books in a library. The system allows the user to:
- Add books to the collection
- Search for books by title or author
- Remove books from the collection
- Display the current list of books

### Key Features:

1. **Book Management**:
   - Each book has a title, author, and year of publication. 
   - Books are stored in a binary search tree (BST), where each node represents a book. 
   - The tree is organized based on the title of the book, allowing for efficient search, addition, and removal operations.

2. **Binary Search Tree (BST) Implementation**:
   - The `ArvoreBinaria` class implements the core functionality of a binary search tree, managing the addition, removal, and search operations.
   - This allows for optimized book management, especially when dealing with large collections of books.

3. **Efficient Searching**:
   - The binary tree structure allows for efficient searching, which is faster compared to a linear data structure like a list.

4. **User Interaction**:
   - The system interacts with users via a console interface, where they can input commands to add, remove, search for, or display books.

---

# Sistema de Gerenciamento de Biblioteca - Projeto Universitário

Este projeto foi desenvolvido como parte da disciplina de **Análise e Técnicas de Algoritmos (ATAL)** na nossa universidade. Juntamente com meus colegas de grupo, trabalhamos na criação de um **Sistema de Gerenciamento de Biblioteca**, que inicialmente utilizava **listas encadeadas** e depois evoluiu para trabalhar com **árvores binárias** para melhor estruturação dos dados.

## Visão Geral do Projeto

O objetivo principal do sistema é gerenciar uma coleção de livros em uma biblioteca. O sistema permite ao usuário:
- Adicionar livros à coleção
- Pesquisar livros por título ou autor
- Remover livros da coleção
- Exibir a lista atual de livros

### Principais Funcionalidades:

1. **Gerenciamento de Livros**:
   - Cada livro possui um título, autor e ano de publicação.
   - Os livros são armazenados em uma árvore binária de busca (BST), onde cada nó representa um livro.
   - A árvore é organizada com base no título do livro, permitindo operações eficientes de busca, adição e remoção.

2. **Implementação de Árvore Binária de Busca (BST)**:
   - A classe `ArvoreBinaria` implementa a funcionalidade central de uma árvore binária de busca, gerenciando as operações de adição, remoção e busca.
   - Isso permite um gerenciamento otimizado de livros, especialmente ao lidar com grandes coleções.

3. **Busca Eficiente**:
   - A estrutura de árvore binária permite buscas eficientes, mais rápidas do que em uma estrutura de dados linear como uma lista.

4. **Interação com o Usuário**:
   - O sistema interage com os usuários via uma interface de console, onde eles podem inserir comandos para adicionar, remover, buscar ou exibir livros.
