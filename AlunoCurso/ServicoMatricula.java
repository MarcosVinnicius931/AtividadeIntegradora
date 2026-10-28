
import java.util.ArrayList;
import java.util.List;

public class ServicoMatricula {

    private List<ObservadorMatricula> observadores = new ArrayList<>();

    public void inscrever(ObservadorMatricula observador) {
        observadores.add(observador);
    }

    public void matricular(String aluno) {
        System.out.println("Matrícula realizada: " + aluno);

        String mensagem = "Matrícula realizada para " + aluno;

        for (ObservadorMatricula observador : observadores) {
            observador.atualizar(mensagem);
        }
    }
}
