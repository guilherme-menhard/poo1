//Mariana
package estudantes.entidades;

import professor.entidades.CodigoCurso;

public class Registro extends DocumentoAcademico {
    private String estudante;
    private long matricula;

    public Registro(String estudante, long matricula, long autenticacao, String criador, CodigoCurso codigoCurso,
            int paginas) {
        super(autenticacao, criador, codigoCurso, paginas);
        this.estudante = estudante;
        this.matricula = matricula;
    }

    public String getEstudante() {
        return estudante;
    }

    public void setEstudante(String estudante) {
        this.estudante = estudante;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Registro res = (Registro) obj;
        return estudante.equals(res.estudante) && matricula == res.matricula;
    }

    @Override
    public int hashCode() {
        int result = Long.hashCode(matricula);
        result = 31 * result + (estudante != null ? estudante.hashCode() : 0);
        return result;
    }

}
