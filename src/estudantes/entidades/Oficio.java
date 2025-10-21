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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Oficio ofc = (Oficio) obj;
        return destinatario.equals(ofc.destinatario);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (destinatario != null ? destinatario.hashCode() : 0);
        return result;
    }
}