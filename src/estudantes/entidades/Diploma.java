/**
 * @author Mariana Chuquel
 */
package estudantes.entidades;

import professor.entidades.CodigoCurso;

public class Diploma extends Certificado {
    private String habilitacao;

    public Diploma(String descricao, CodigoCurso codigoCurso, int paginas, long matricula, String habilitacao,
            long autenticacao,
            String criador,
            String estudante) {
        super(descricao, codigoCurso, paginas, matricula, estudante, autenticacao, criador);
        this.habilitacao = habilitacao;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

}
