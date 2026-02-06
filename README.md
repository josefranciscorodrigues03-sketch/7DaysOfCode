## 🎬 Gerador de Página de Filmes

Este projeto foi desenvolvido como parte do desafio **7 Days of Code – Java**, promovido pela **Alura**.  
O objetivo do desafio é praticar consumo de APIs, manipulação de JSON e geração de conteúdo dinâmico utilizando Java.

## 📌 Sobre o projeto

A aplicação consome dados de filmes a partir de uma API externa, processa essas informações em Java e gera automaticamente uma página HTML exibindo os títulos e pôsteres dos filmes.

A **única alteração em relação ao projeto original do desafio** foi a **API utilizada**.  
Em vez da API proposta inicialmente no desafio, foi utilizada a **API do TMDB (The Movie Database)**, que oferece uma base mais completa e imagens oficiais dos filmes.

## 🔧 Tecnologias utilizadas

- Java  
- API TMDB (The Movie Database)  
- HTML5  
- CSS3  

## 📂 Estrutura do projeto

- **Main.java**  
  Classe principal responsável por consumir a API do TMDB, tratar os dados retornados e iniciar a geração do HTML.

- **Filme.java**  
  Classe modelo que representa um filme, contendo informações como título e URL da imagem.

- **HTMLGenerator.java**  
  Responsável por gerar o arquivo HTML final a partir da lista de filmes obtida da API.

- **index.html**  
  Arquivo HTML gerado automaticamente pelo programa, exibindo os filmes e seus respectivos pôsteres.

- **Style.css**  
  Arquivo responsável pela estilização da página, definindo cores, layout e tipografia.

## 🖼️ Resultado final

O projeto gera uma página web simples e estilizada que apresenta:
- Título dos filmes
- Pôster oficial de cada filme obtido via TMDB

## 🚀 Como executar o projeto

1. Configure sua **API Key do TMDB** no código Java.
2. Execute a classe `Main.java`.
3. O arquivo `index.html` será gerado automaticamente.
4. Abra o arquivo `index.html` em um navegador para visualizar o resultado.

## 📚 Créditos

Projeto desenvolvido durante o **7 Days of Code – Alura**  
Criado por **Jose Francisco**

LinkedIn: https://www.linkedin.com/in/jose-francisco-8966763a2/

