/**
 * @author Mariana Chuquel
 */
package estudantes.entidades;

import professor.entidades.CodigoCurso;

public class DocumentoAcademico extends Documento {
    private long autenticacao;

    public DocumentoAcademico(long autenticacao, String criador, CodigoCurso codigoCurso, int paginas) {
        super(criador, codigoCurso, paginas);
        this.autenticacao = autenticacao;

    }

    public long getAutenticacao() {
        return this.autenticacao;
    }

    public void setAutenticacao(long autenticacao) {
        this.autenticacao = autenticacao;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DocumentoAcademico doc = (DocumentoAcademico) obj;
        return autenticacao == doc.autenticacao;

    }

    @Override
    public int hashCode() {
        int result = Long.hashCode(autenticacao);
        return result;
    }
}
