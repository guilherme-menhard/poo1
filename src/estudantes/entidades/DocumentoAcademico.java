//Mariana
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

}
