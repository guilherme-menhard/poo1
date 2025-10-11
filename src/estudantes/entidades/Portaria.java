package estudantes.entidades;

import professor.entidades.CodigoCurso;

/**
 * @author Guilherme Menhard
 */

public class Portaria extends Norma {

    private int anoInicio;

    public Portaria(String texto, CodigoCurso codigoCurso, int anoInicio, int numero, boolean valido, String criador,
            int paginas) {
        super(texto, codigoCurso, numero, paginas, valido, criador);
        this.anoInicio = anoInicio;
    }

    public int getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }

    public boolean equalsPortaria(Portaria portaria) {
        if (this.getAnoInicio() == portaria.getAnoInicio() && this.equalsNorma(portaria)) {
            return true;
        }
        return false;
    }

    public int hashCodePortaria() {
        int result = 17;
        result = 31 * result + getAnoInicio();
        result = 31 * result + hashCodeNorma();
        return result;
    }
}
