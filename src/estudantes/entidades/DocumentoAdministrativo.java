package estudantes.entidades;

import professor.entidades.CodigoCurso;

/**
 * @author Guilherme Menhard
 */

public class DocumentoAdministrativo extends Documento {

    public DocumentoAdministrativo(String criador, CodigoCurso codigoCurso, int paginas) {
        super(criador, codigoCurso, paginas);
    }
    
    public boolean equalsDocumentoAdministrativo(DocumentoAdministrativo doc) {
        if (this.getCriador().equals(doc.getCriador()) && this.getCodigoCurso() == doc.getCodigoCurso() && this.getPaginas() == doc.getPaginas()) {
            return true;
        }
        return false;
    }

    public int hashCodeDocumentoAdministrativo() {
        int result = 17; //Copilot indicou que 17 é um bom número primo inicial.
        result = 31 * result + (getCriador() != null ? getCriador().hashCode() : 0);
        result = 31 * result + (getCodigoCurso() != null ? getCodigoCurso().hashCode() : 0);
        result = 31 * result + getPaginas();
        return result;
    }
    
}
