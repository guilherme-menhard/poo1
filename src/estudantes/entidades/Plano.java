//Mariana
package estudantes.entidades;

import professor.entidades.CodigoCurso;

public class Plano extends DocumentoAcademico {
    private String responsavel;
    private String[] planejamento;

    public Plano(String responsavel, String[] planejamento, long autenticacao, String criador, CodigoCurso codigoCurso,
            int paginas) {
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

}
