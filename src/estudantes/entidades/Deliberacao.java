package estudantes.entidades;

import professor.entidades.CodigoCurso;

/**
 * @author Guilherme Menhard
 */

public class Deliberacao extends DocumentoAdministrativo {

    private String texto;

    public Deliberacao(String texto, String criador, CodigoCurso codigoCurso, int paginas) {
        super(criador, codigoCurso, paginas);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Deliberacao deliberacao = (Deliberacao) obj;
        return texto.equals(deliberacao.texto);

    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + (texto != null ? texto.hashCode() : 0);
        return result;
    }

}
