package App;

import java.util.Random;
import java.util.Scanner;
import Entidades.ConsultaMedica;
import Entidades.ConsultaOdontologica;
import Entidades.Paciente;
import Repositorios.RconsultaMedica;
import Repositorios.RconsultaOdontologica;
import Servicos.ServicoConsultaMedica;
import Servicos.ServicoConsultaOdontologica;
import Servicos.ServicoNotificacao;

public class App {
    public static void main(String[] args) {
        try {
            boolean sairMenu = false;
            Scanner sc = new Scanner(System.in);

            RconsultaMedica rconsultaMedica = new RconsultaMedica();
            RconsultaOdontologica rconsultaOdontologica = new RconsultaOdontologica();
            ServicoConsultaMedica servicoConsultaMedica = new ServicoConsultaMedica(rconsultaMedica);
            ServicoConsultaOdontologica servicoConsultaOdontologica = new ServicoConsultaOdontologica(rconsultaOdontologica);

            do {
                System.out.println("Menu: 1- Consulta Odontológica, 2- Consulta Médica, 3- Notificar, 4- Sair");
                int opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        try {
                            System.out.println("Nome do Paciente: ");
                            String nomeDoPaciente = sc.nextLine();
                            System.out.println("Cpf do Paciente: ");
                            String cpf = sc.nextLine();
                            System.out.println("Telefone do Paciente: ");
                            String telefone = sc.nextLine();
                            System.out.println("Endereço do Paciente: ");
                            String endereco = sc.nextLine();
                            int id = new Random().nextInt();
                            System.out.println("Data da Consulta: ");
                            String data = sc.nextLine();
                            System.out.println("Hora da Consulta: ");
                            String hora = sc.nextLine();
                            System.out.println("Nome do Dentista: ");
                            String dentista = sc.nextLine();

                            Paciente paciente = new Paciente(nomeDoPaciente, cpf, telefone, endereco);
                            System.out.println("Procedimento: 1- Limpeza, 2- Extração, 3- Restauração");
                            int tipoProcedimento = sc.nextInt();
                            boolean suporte = false;

                            do {
                                if (tipoProcedimento == 1) {
                                    ConsultaOdontologica consultaOdontologica = new ConsultaOdontologica(01, data, hora, paciente, "Limpeza", dentista);
                                    servicoConsultaOdontologica.adicionarConsultaOdontologica(consultaOdontologica);
                                    System.out.println("Procedimento de limpeza agendado.");
                                    suporte = true;
                                } else if (tipoProcedimento == 2) {
                                    ConsultaOdontologica consultaOdontologica = new ConsultaOdontologica(02, data, hora, paciente, "Extração", dentista);
                                    servicoConsultaOdontologica.adicionarConsultaOdontologica(consultaOdontologica);
                                    System.out.println("Procedimento de extração agendado.");
                                    suporte = true;
                                } else if (tipoProcedimento == 3) {
                                    ConsultaOdontologica consultaOdontologica = new ConsultaOdontologica(03, data, hora, paciente, "Restauração", dentista);
                                    servicoConsultaOdontologica.adicionarConsultaOdontologica(consultaOdontologica);
                                    System.out.println("Procedimento de restauração agendado.");
                                    suporte = true;
                                } else {
                                    System.out.println("Opção inválida.");
                                }
                            } while (!suporte);
                        } catch (Exception e) {
                            System.out.println("Erro ao agendar consulta odontológica: " + e.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            System.out.println("Nome do Paciente: ");
                            String nomeDoPacienteMedico = sc.nextLine();
                            System.out.println("Cpf do Paciente: ");
                            String cpfMedico = sc.nextLine();
                            System.out.println("Telefone do Paciente: ");
                            String telefoneMedico = sc.nextLine();
                            System.out.println("Endereço do Paciente: ");
                            String enderecoMedico = sc.nextLine();
                            int idMedico = new Random().nextInt();
                            System.out.println("Data da Consulta: ");
                            String dataMedico = sc.nextLine();
                            System.out.println("Hora da Consulta: ");
                            String horaMedico = sc.nextLine();
                            System.out.println("Nome do Médico: ");
                            String medico = sc.nextLine();

                            Paciente pacienteMedico = new Paciente(nomeDoPacienteMedico, cpfMedico, telefoneMedico, enderecoMedico);
                            System.out.println("Especialidade: 1- Cardiologista, 2- Dermatologista, 3- Ginecologista");
                            int tipoEspecialidade = sc.nextInt();
                            boolean suporteMedico = false;

                            do {
                                if (tipoEspecialidade == 1) {
                                    ConsultaMedica consultaMedica = new ConsultaMedica(01, dataMedico, horaMedico, pacienteMedico, "Cardiologista", medico);
                                    servicoConsultaMedica.adicionarConsultaMedica(consultaMedica);
                                    System.out.println("Consulta com Cardiologista agendada.");
                                    suporteMedico = true;
                                } else if (tipoEspecialidade == 2) {
                                    ConsultaMedica consultaMedica = new ConsultaMedica(02, dataMedico, horaMedico, pacienteMedico, "Dermatologista", medico);
                                    servicoConsultaMedica.adicionarConsultaMedica(consultaMedica);
                                    System.out.println("Consulta com Dermatologista agendada.");
                                    suporteMedico = true;
                                } else if (tipoEspecialidade == 3) {
                                    ConsultaMedica consultaMedica = new ConsultaMedica(03, dataMedico, horaMedico, pacienteMedico, "Ginecologista", medico);
                                    servicoConsultaMedica.adicionarConsultaMedica(consultaMedica);
                                    System.out.println("Consulta com Ginecologista agendada.");
                                    suporteMedico = true;
                                } else {
                                    System.out.println("Opção inválida.");
                                }
                            } while (!suporteMedico);
                        } catch (Exception e) {
                            System.out.println("Erro ao agendar consulta médica: " + e.getMessage());
                        }
                        break;
                    case 3:
                        boolean supNotificao = false;
                        do {
                            System.out.println("Notificar: 1- Consulta dermatologista, 2- Consulta cardiologista, 3- Consulta ginecologista, 4- Consulta dentista, 5- Paciente");
                            int notificacao = sc.nextInt();
                            ServicoNotificacao servicoNotificacao = new ServicoNotificacao();

                            if (notificacao == 1) {
                                servicoNotificacao.notificarChegadaDoDermatologista();
                                supNotificao = true;
                            } else if (notificacao == 2) {
                                servicoNotificacao.notificarChegadaDoCardiologista();
                                supNotificao = true;
                            } else if (notificacao == 3) {
                                servicoNotificacao.notificarChegadaDoGinecologista();
                                supNotificao = true;
                            } else if (notificacao == 4) {
                                servicoNotificacao.notificarChegadaDoDentista();
                                supNotificao = true;
                            } else if (notificacao == 5) {
                                servicoNotificacao.notificarChegadaDoPaciente();
                                supNotificao = true;
                            } else {
                                System.out.println("Opção inválida.");
                            }
                        } while (!supNotificao);

                        break;
                    case 4:
                        System.out.println("Encerrando...");
                        sairMenu = true;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } while (!sairMenu);

            sc.close();
        } catch (Exception e) {
            System.out.println("Erro no sistema: " + e.getMessage());
        }
    }
}