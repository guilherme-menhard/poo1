/**
 * @author Mariana Chuquel
 */
package estudantes.entidades;

import professor.entidades.CodigoCurso;

public class Atestado extends Registro {
    private String descricao;
    private String categoria;

    public Atestado(String descricao, CodigoCurso codigoCurso, int paginas, long matricula, String categoria,
            long autenticacao, String estudante,
            String criador) {
        super(estudante, matricula, autenticacao, criador, codigoCurso, paginas);
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Atestado atestado = (Atestado) obj;
        return descricao.equals(atestado.descricao) && categoria.equals(atestado.categoria);

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (descricao != null ? descricao.hashCode() : 0);
        result = 31 * result + (categoria != null ? categoria.hashCode() : 0);
        return result;

    }

}
