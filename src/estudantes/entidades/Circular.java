package estudantes.entidades;

import professor.entidades.CodigoCurso;
import java.util.Arrays;

/**
 * @author Guilherme Menhard
 */

public class Circular extends Norma {

    private String[] destinatarios;

    public Circular(String[] destinatarios, int numero, boolean valido, String texto, String criador, CodigoCurso codigoCurso, int paginas) {
        super(numero, valido, texto, criador, codigoCurso, paginas);
        this.destinatarios = destinatarios;
    }

    public String[] getDestinatarios() {
        return destinatarios;
    }

    public void setDestinatarios(String[] destinatarios) {
        this.destinatarios = destinatarios;
    }

    public boolean equalsCircular(Circular circular) {
        if (Arrays.equals(this.getDestinatarios(), circular.getDestinatarios()) && this.equalsNorma(circular)) {
            return true;
        }
        return false;
    }

    public int hashCodeCircular() {
        int result = 17; 
        result = 31 * result + Arrays.hashCode(getDestinatarios());
        result = 31 * result + hashCodeNorma();
        return result;
    }
}
