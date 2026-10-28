
public class Main {

    public static void main(String[] args) {

        ServicoMatricula servico = new ServicoMatricula();

        servico.inscrever(new AvisoEmail());
        servico.inscrever(new Auditoria());

        servico.matricular("João");
    }
}
