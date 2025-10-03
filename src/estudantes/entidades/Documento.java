package estudantes.entidades;

import professor.entidades.CodigoCurso;

/**
 * Classe que representa um documento genérico.
 * <br><br>
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

    public boolean equalsDocumento(Documento documento) {
        if (this.criador.equals(documento.getCriador()) && this.codigoCurso == documento.getCodigoCurso() && this.paginas == documento.getPaginas()) {
            return true;
        }
        return false;
    }

/* Início do Código gerado por IA */
    public int hashCodeDocumento() {
        int hash = 17;
        hash = 31 * hash + (this.criador != null ? this.criador.hashCode() : 0);
        hash = 31 * hash + (this.codigoCurso != null ? this.codigoCurso.hashCode() : 0);
        hash = 31 * hash + this.paginas;
        return hash;
    }
/* Fim do Código gerado por IA */
}
