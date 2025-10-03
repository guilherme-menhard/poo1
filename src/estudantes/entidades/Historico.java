//Mariana
package estudantes.entidades;

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

}
