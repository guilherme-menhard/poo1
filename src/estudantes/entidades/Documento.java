package estudantes.entidades;

import professor.entidades.CodigoCurso;

/**
 * Classe que representa um documento genérico.
 * <br>
 * <br>
 * <strong>Seu trabalho começa aqui...</strong>
 * 
 * @author Guilherme Menhard
 */

public abstract class Documento {
    private String criador;
    private CodigoCurso codigoCurso;
    private int paginas;

    public Documento(String criador, CodigoCurso codigoCurso, int paginas) {
        this.criador = criador;
        this.codigoCurso = codigoCurso;
        this.paginas = paginas;
    }

    public String getCriador() {
        return criador;
    }

    public CodigoCurso getCodigoCurso() {
        return codigoCurso;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setCriador(String criador) {
        this.criador = criador;
    }

    public void setCodigoCurso(CodigoCurso codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Documento doc = (Documento) obj;
        return criador.equals(doc.criador) && paginas == doc.paginas && codigoCurso == doc.codigoCurso;

    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(paginas);
        result = 31 * result + (criador != null ? criador.hashCode() : 0);
        result = 31 * result + (codigoCurso != null ? codigoCurso.hashCode() : 0);
        return result;
    }
}
