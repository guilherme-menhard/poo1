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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Diploma diploma = (Diploma) obj;
        return habilitacao.equals(diploma.habilitacao);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (habilitacao != null ? habilitacao.hashCode() : 0);
        return result;
    }

}
