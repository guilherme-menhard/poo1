package estudantes.entidades;

import professor.entidades.CodigoCurso;

/**
 * @author Guilherme Menhard
 */

public class DocumentoAdministrativo extends Documento {

    public DocumentoAdministrativo(String criador, CodigoCurso codigoCurso, int paginas) {
        super(criador, codigoCurso, paginas);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
    // Começo de código gerado por IA
        return super.equals(obj);

    }

    @Override
    public int hashCode() {

        return super.hashCode();
    }
    // Fim de código gerado por IA

}
