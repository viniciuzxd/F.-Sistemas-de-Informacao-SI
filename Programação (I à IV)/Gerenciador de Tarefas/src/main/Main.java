package main;

import model.*;
import repository.*;
import service.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciando tudo
        UsuarioService usuarioService = new UsuarioService(new UsuarioRepository());
        ProjetoService projetoService = new ProjetoService(new ProjetoRepository());
        TarefaService tarefaService = new TarefaService(new TarefaRepository());
        TarefaSimplesService tsService = new TarefaSimplesService(new TarefaSimplesRepository());
        TarefaComPrazoService tpService = new TarefaComPrazoService(new TarefaComPrazoRepository());

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n--- MENU ---");
            System.out.println("1- Usuario | 2- Projeto | 3- Tarefa | 4- Tarefa Simples | 5- Tarefa c/ Prazo | 0- Sair");
            System.out.print("Escolha a entidade para o CRUD: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 0) break;

            System.out.print("1-Criar | 2-Listar | 3-Deletar : ");
            int acao = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Digite o ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            if (acao == 1) {
                System.out.print("Digite o Nome/Titulo/Descricao: ");
                String texto = scanner.nextLine();

                switch (opcao) {
                    case 1: usuarioService.salvar(new Usuario(id, texto)); break;
                    case 2: projetoService.salvar(new Projeto(id, texto)); break;
                    case 3: tarefaService.salvar(new Tarefa(id, texto)); break;
                    case 4:
                        System.out.print("Anotacao extra: ");
                        tsService.salvar(new TarefaSimples(id, texto, scanner.nextLine()));
                        break;
                    case 5:
                        System.out.print("Prazo (Ex: 27/05): ");
                        tpService.salvar(new TarefaComPrazo(id, texto, scanner.nextLine()));
                        break;
                }
                System.out.println("Criado com sucesso!");
            }
            else if (acao == 2) {
                switch (opcao) {
                    case 1: for(Usuario u : usuarioService.listar()) System.out.println(u.getId() + " - " + u.getNome()); break;
                    case 2: for(Projeto p : projetoService.listar()) System.out.println(p.getId() + " - " + p.getTitulo()); break;
                    case 3: for(Tarefa t : tarefaService.listar()) System.out.println(t.getId() + " - " + t.getDescricao()); break;
                    case 4: for(TarefaSimples ts : tsService.listar()) System.out.println(ts.getId() + " - " + ts.getDescricao() + " (" + ts.getAnotacao() + ")"); break;
                    case 5: for(TarefaComPrazo tp : tpService.listar()) System.out.println(tp.getId() + " - " + tp.getDescricao() + " (Prazo: " + tp.getPrazo() + ")"); break;
                }
            }
            else if (acao == 3) {
                switch (opcao) {
                    case 1: usuarioService.deletar(id); break;
                    case 2: projetoService.deletar(id); break;
                    case 3: tarefaService.deletar(id); break;
                    case 4: tsService.deletar(id); break;
                    case 5: tpService.deletar(id); break;
                }
                System.out.println("Deletado!");
            }
        }
        scanner.close();
    }
}