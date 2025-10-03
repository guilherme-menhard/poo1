//Mariana
package estudantes.entidades;

import java.util.Arrays;
import professor.entidades.CodigoCurso;

public class Historico extends Registro {
    private double coeficiente;
    private String[] componentes;

    public Historico(double coeficiente, String[] componentes, String estudante, long matricula, long autenticacao,
            String criador, CodigoCurso codigoCurso,
            int paginas) {
        super(estudante, matricula, autenticacao, criador, codigoCurso, paginas);
        this.coeficiente = coeficiente;
        this.componentes = componentes;
    }

    public double getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(double coeficiente) {
        this.coeficiente = coeficiente;
    }

    public String[] getComponentes() {
        return componentes;
    }

    public void setComponentes(String[] componentes) {
        this.componentes = componentes;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Historico historico = (Historico) obj;
        return Double.compare(coeficiente, historico.coeficiente) == 0
                && Arrays.equals(componentes, historico.componentes);

    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(coeficiente);
        result = 31 * result + Arrays.hashCode(componentes);
        return result;
    }
}