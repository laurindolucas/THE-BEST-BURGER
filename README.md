# THE BEST BURGER

O The Best Burger é um protótipo (MVP) de uma plataforma de avaliação de hambúrgueres desenvolvido como um projeto de estudo para consolidar conceitos de Programação Orientada a Objetos (POO) utilizando a linguagem Java.

## Motivação e Contexto

Este projeto nasceu de uma ideia prática surgida em uma conversa com uma amiga, com o objetivo de visitar diversas hamburguerias em Recife e documentar as experiências para encontrar o melhor hambúrguer da cidade.

Diferente de soluções geradas automaticamente, este código foi desenvolvido manualmente ("mão no código") para fins de prática e estudo pessoal, sem o uso de ferramentas de geração automática de código para sua lógica central, focando no aprendizado real da sintaxe e estrutura da linguagem Java.

## Funcionalidades

O sistema opera via console e oferece as seguintes opções:

- Login de Usuário: Cadastro simples com nome e email para identificação das avaliações.
- Cadastro de Avaliação: Registro do nome do hambúrguer, estabelecimento, nota (0 a 10) e uma descrição detalhada.
- Visualização de Avaliações: Listagem completa de todos os registros inseridos no sistema.
- Ranking Geral: Exibição dos hambúrgueres ordenados pela nota, da maior para a menor.

## Conceitos de POO Praticados

Durante o desenvolvimento manual deste MVP, foram aplicados os seguintes pilares:

- Classes e Atributos: Modelagem das entidades User, Burger e Avaliacao.
- Encapsulamento: Uso de modificadores de acesso privados e métodos getters/setters para proteção dos dados.
- Manipulação de Listas: Uso de ArrayList para armazenamento dinâmico de objetos em memória.
- Ordenação Personalizada: Implementação de lógica de comparação para gerar o ranking de notas.

## Estrutura do Repositório

- `src/Main.java`: Ponto de entrada que gerencia a interface de texto e o fluxo do usuário.
- `src/SistemaBurger`.java: Classe responsável pela lógica de negócio, armazenamento e ordenação.
- `src/User.java`: Modelo para armazenamento de informações do usuário.
- `src/Burger.java`: Modelo para os dados técnicos do produto e local.
- `src/Avaliacao.java`: Classe que relaciona o usuário ao hambúrguer e armazena o veredito.

## Tecnologias

- Linguagem: Java.
- Ambiente: JDK 24 e IntelliJ IDEA.
