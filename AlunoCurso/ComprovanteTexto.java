
public class ComprovanteTexto implements Comprovante {

    @Override
    public String gerar(Aluno aluno, Curso curso, double valor) {
        return "Matrícula: " + aluno.getNome()
                + " / " + curso.getTitulo()
                + " / R$ " + valor;
    }
}
