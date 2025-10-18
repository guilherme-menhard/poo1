package estudantes.entidades;

import professor.entidades.CodigoCurso;
import java.util.Arrays;

/**
 * @author Guilherme Menhard
 */

public class Circular extends Deliberacao {

    private String[] destinatarios;

    public Circular(String texto, CodigoCurso codigoCurso, int paginas, String criador, String[] destinatarios) {
        super(texto, criador, codigoCurso, paginas);
        this.destinatarios = destinatarios;
    }

    public String[] getDestinatarios() {
        return destinatarios;
    }

    public void setDestinatarios(String[] destinatarios) {
        this.destinatarios = destinatarios;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Circular circular = (Circular) obj;
        return Arrays.equals(destinatarios, circular.destinatarios);
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + Arrays.hashCode(destinatarios);
        return result;
    }
}
