package estudantes.entidades;

import professor.entidades.CodigoCurso;
import java.util.Arrays;

/**
 * @author Guilherme Menhard
 */


public class Oficio extends Norma {
    
    private String[] destinatarios;

    public Oficio(String[] destinatarios, int numero, boolean valido, String texto, String criador, CodigoCurso codigoCurso, int paginas) {
        super(numero, valido, texto, criador, codigoCurso, paginas);
        this.destinatarios = destinatarios;
    }

    public String[] getDestinatarios() {
        return destinatarios;
    }

    public void setDestinatarios(String[] destinatarios) {
        this.destinatarios = destinatarios;
    }

    public boolean equalsOficio(Oficio oficio) {
        if (Arrays.equals(this.getDestinatarios(), oficio.getDestinatarios()) && this.equalsNorma(oficio)) {
            return true;
        }
        return false;
    }

    public int hashCodeOficio() {
        int result = 17; 
        result = 31 * result + Arrays.hashCode(getDestinatarios());
        result = 31 * result + hashCodeNorma();
        return result;
    }
}
