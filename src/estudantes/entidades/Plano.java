/**
 * @author Mariana Chuquel
 */
package estudantes.entidades;

import java.util.Arrays;

import professor.entidades.CodigoCurso;

public class Plano extends DocumentoAcademico {
    private String responsavel;
    private String[] planejamento;

    public Plano(String responsavel, CodigoCurso codigoCurso, int paginas, long autenticacao, String criador,
            String[] planejamento) {
        super(autenticacao, criador, codigoCurso, paginas);
        this.responsavel = responsavel;
        this.planejamento = planejamento;

    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String[] getPlanejamento() {
        return planejamento;
    }

    public void setPlanejamento(String[] planejamento) {
        this.planejamento = planejamento;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Plano plano = (Plano) obj;
        return responsavel.equals(plano.responsavel) && Arrays.equals(planejamento, plano.planejamento);

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (responsavel != null ? responsavel.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(planejamento);
        return result;

    }

}
