//Mariana
package estudantes.entidades;

import professor.entidades.CodigoCurso;

public class Diploma extends Certificado {
    private String habilitacao;

    public Diploma(String habilitacao, String descricao, String estudante, long matricula, long autenticacao,
            String criador,
            CodigoCurso codigoCurso, int paginas) {
        super(descricao, estudante, matricula, autenticacao, criador, codigoCurso, paginas);
        this.habilitacao = habilitacao;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

}
