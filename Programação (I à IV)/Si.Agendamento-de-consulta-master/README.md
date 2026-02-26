# Sistema de Agendamento de Consultas

Este projeto é um sistema de agendamento de consultas médicas e odontológicas, desenvolvido em Java. Ele permite que os usuários agendem consultas, notifiquem chegadas e gerenciem informações de pacientes.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- `App`: Contém a classe principal `App.java` que executa o sistema.
- `Entidades`: Contém as classes de entidades como `Consulta`, `ConsultaMedica`, `ConsultaOdontologica` e `Paciente`.
- `Repositorios`: Contém as classes de repositórios como `RconsultaMedica` e `RconsultaOdontologica`.
- `Servicos`: Contém as classes de serviços como `ServicoConsultaMedica`, `ServicoConsultaOdontologica` e `ServicoNotificacao`.

## Funcionalidades

### Menu Principal

O menu principal oferece as seguintes opções:

1. **Consulta Odontológica**: Permite agendar uma consulta odontológica.
2. **Consulta Médica**: Permite agendar uma consulta médica.
3. **Notificar**: Permite notificar a chegada de um paciente ou profissional.
4. **Sair**: Encerra o sistema.

### Tratamento de Exceções

O sistema possui tratamento de exceções para garantir que erros sejam capturados e mensagens apropriadas sejam exibidas ao usuário.

## Exemplo de Uso

Ao executar o sistema, você verá o menu principal. Siga as instruções na tela para agendar consultas ou notificar chegadas.

## Estrutura de Classes

### App

A classe principal que contém o método `main` e gerencia o fluxo do sistema.

### Entidades

- **Consulta**: Classe base para consultas.
- **ConsultaMedica**: Extende `Consulta` e adiciona atributos específicos para consultas médicas.
- **ConsultaOdontologica**: Extende `Consulta` e adiciona atributos específicos para consultas odontológicas.
- **Paciente**: Representa um paciente com informações básicas.

### Repositorios

- **RconsultaMedica**: Repositório para gerenciar consultas médicas.
- **RconsultaOdontologica**: Repositório para gerenciar consultas odontológicas.

### Servicos

- **ServicoConsultaMedica**: Serviço para operações relacionadas a consultas médicas.
- **ServicoConsultaOdontologica**: Serviço para operações relacionadas a consultas odontológicas.
- **ServicoNotificacao**: Serviço para notificações de chegadas.
