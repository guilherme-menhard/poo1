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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Certificado certificado = (Certificado) obj;
        return descricao.equals(certificado.descricao);

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (descricao != null ? descricao.hashCode() : 0);
        return result;
    }
}