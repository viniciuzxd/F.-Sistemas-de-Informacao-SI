# 📋 Gerenciador de Tarefas - Programação 1

Projeto prático desenvolvido para a disciplina de **Programação 1**, do **2º período** do curso de Ciência da Computação / Sistemas de Informação.

👨‍🏫 **Professor:** Ricardo Correia  
📅 **Data de Apresentação:** 2 de jun. de 2024

---

## 🎯 Tema do Projeto
**Gerenciador de Tarefas:** Um sistema em Java via terminal (Console) para criar e gerenciar um cronograma de tarefas e projetos. O sistema permite o cadastro, listagem e exclusão (CRUD) das entidades, armazenando os dados em memória.

## 🛠️ Requisitos Técnicos Exigidos
O projeto foi desenvolvido seguindo estritamente as regras de negócio e exigências da avaliação:

- [x] **5 Entidades** (`Usuario`, `Projeto`, `Tarefa`, `TarefaSimples`, `TarefaComPrazo`)
- [x] **2 Heranças** (`TarefaSimples` e `TarefaComPrazo` herdam de `Tarefa`)
- [x] **5 Serviços** (Classes responsáveis pela regra de negócio)
- [x] **5 Repositórios** (Classes responsáveis pelo armazenamento em listas)
- [x] **5 Interfaces de Serviços**
- [x] **5 Interfaces de Repositórios**
- [x] **3 Sobrecargas de Métodos** (Implementadas na classe `TarefaService` no método `buscar`)
- [x] **Mínimo de 3 classes com Sobrecarga de Construtores** (`Usuario`, `Projeto`, `Tarefa`)
- [x] **Menu Interativo** com `Scanner` contemplando os CRUDs de cada entidade
- [x] **Boas Práticas de Programação** (Separação clara de responsabilidades entre as camadas Model, Repository e Service)

## 📁 Estrutura do Projeto (Padrão MVC Simplificado)
O sistema foi dividido em pacotes para manter a organização e aplicar boas práticas de orientação a objetos:

* `model/` -> Contém as classes de dados e as heranças.
* `repository/` -> Contém as interfaces e as lógicas de armazenamento em memória (`ArrayList`).
* `service/` -> Contém as interfaces e as regras de negócio/sobrecargas.
* `main/` -> Contém a classe `Principal.java` com o menu interativo.

## 🚀 Como Executar

1. Certifique-se de ter o **Java (JDK)** instalado na sua máquina.
2. Faça o clone deste repositório:
   ```bash
   git clone [https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git](https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git)