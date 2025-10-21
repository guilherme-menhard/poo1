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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Portaria porta = (Portaria) obj;
        return anoInicio == porta.anoInicio;
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(anoInicio);
        return result;
    }
}
