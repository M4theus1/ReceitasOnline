# Sistema de Receitas Online

Este projeto é um sistema de receitas online, onde usuários podem compartilhar receitas, avaliar receitas existentes e deixar comentários. O sistema é organizado de forma modular com a implementação de repositórios, serviços e testes para garantir a organização e a manutenibilidade do código.

## Funcionalidades

- **Cadastro de Usuários**: Os usuários podem se registrar no sistema.
- **Gestão de Receitas**: Adicionar, listar, atualizar e remover receitas.
- **Comentários e Avaliações**: Os usuários podem comentar e avaliar as receitas.
- **Categorias**: Organização das receitas por categorias.
- **Sistema de Avaliações**: Cada receita pode ser avaliada pelos usuários.

## Estrutura do Projeto

O projeto segue uma arquitetura bem organizada, dividida em pacotes para as entidades, repositórios, serviços e testes.

### Pacotes Principais

- **entidades**: Contém as classes que representam os objetos principais do sistema, como `Usuario`, `Receita`, `Comentario`, `Categoria` e `Avaliacao`.
- **repositorios**: Contém as interfaces e implementações para manipulação dos dados de cada entidade.
- **servicos**: Contém as interfaces e implementações dos serviços que realizam a lógica de negócios.
- **test**: Contém os testes unitários para entidades, repositórios e serviços.
