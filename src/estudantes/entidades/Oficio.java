package estudantes.entidades;

import professor.entidades.CodigoCurso;


/**
 * @author Guilherme Menhard
 */

public class Oficio extends Deliberacao {

    private String destinatario;

    public Oficio(String texto, CodigoCurso codigoCurso, int paginas, String criador, String destinatario) {
        super(texto, criador, codigoCurso, paginas);
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public boolean equalsOficio(Oficio oficio) {
        if (this.destinatario.equals(oficio.getDestinatario()) && this.equalsDeliberacao(oficio)) {
            return true;
        }
        return false;
    }

    public int hashCodeOficio() {
        int result = 17;
        result = 31 * result + (getDestinatario() != null ? getDestinatario().hashCode() : 0);
        result = 31 * result + hashCodeDeliberacao();
        return result;
    }
}
