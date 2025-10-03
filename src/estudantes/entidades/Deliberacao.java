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

    public boolean equalsDeliberacao(Deliberacao delib) {
        if (this.getTexto().equals(delib.getTexto()) && this.equalsDocumentoAdministrativo(delib)) {
            return true;
        }
        return false;
    }

    public int hashCodeDeliberacao() {
        int result = 17; 
        result = 31 * result + (getTexto() != null ? getTexto().hashCode() : 0);
        result = 31 * result + hashCodeDocumentoAdministrativo();
        return result;
    }

}
