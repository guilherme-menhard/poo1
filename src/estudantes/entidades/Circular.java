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

    public boolean equalsCircular(Circular circular) {
        if (Arrays.equals(this.getDestinatarios(), circular.getDestinatarios()) && this.equalsDeliberacao(circular)) {
            return true;
        }
        return false;
    }

    public int hashCodeCircular() {
        int result = 17;
        result = 31 * result + Arrays.hashCode(getDestinatarios());
        result = 31 * result + hashCodeDeliberacao();
        return result;
    }
}
