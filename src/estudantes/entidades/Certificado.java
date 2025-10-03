//Mariana
package estudantes.entidades;

import professor.entidades.CodigoCurso;

public class Certificado extends Registro {
    private String descricao;

    public Certificado(String descricao, String estudante, long matricula, long autenticacao, String criador,
            CodigoCurso codigoCurso, int paginas) {
        super(estudante, matricula, autenticacao, criador, codigoCurso, paginas);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}