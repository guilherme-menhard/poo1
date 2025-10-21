package estudantes.entidades;

import professor.entidades.CodigoCurso;
import java.util.Arrays;

/**
 * @author Guilherme Menhard
 */

public class Edital extends Norma {

    private String[] responsaveis;

    public Edital(String texto, CodigoCurso codigoCurso, int numero, int paginas, boolean valido, String criador,
            String[] responsaveis) {
        super(texto, codigoCurso, numero, paginas, valido, criador);
        this.responsaveis = responsaveis;
    }

    public String[] getResponsaveis() {
        return responsaveis;
    }

    public void setResponsaveis(String[] responsaveis) {
        this.responsaveis = responsaveis;
    }

    @Override

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Edital edital = (Edital) obj;
        return Arrays.equals(responsaveis, edital.responsaveis);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Arrays.hashCode(responsaveis);
        return result;
    }
}