package Servicos;

import Interfaces.IservicoNotificacao;
public class ServicoNotificacao implements IservicoNotificacao {
    public void notificarChegadaDoDermatologista() {
        System.out.println("Dermatologista chegou.");
    }

    public void notificarChegadaDoCardiologista() {
        System.out.println("Cardiologista chegou.");
    }

    public void notificarChegadaDoGinecologista() {
        System.out.println("Ginecologista chegou.");
    }

    public void notificarChegadaDoDentista() {
        System.out.println("Dentista chegou.");
    }

    public void notificarChegadaDoPaciente() {
        System.out.println("Paciente chegou.");
    }

}
