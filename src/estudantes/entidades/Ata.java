//Mariana
package estudantes.entidades;

import java.util.Arrays;

import professor.entidades.CodigoCurso;

public class Ata extends Documento {
    private int numero;
    private String texto;
    private String[] presentes;

    public Ata(int numero, String texto, String[] presentes, String criador, CodigoCurso codigoCurso, int paginas) {
        super(criador, codigoCurso, paginas);
        this.numero = numero;
        this.texto = texto;
        this.presentes = presentes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String[] getPresentes() {
        return presentes;
    }

    public void setPresentes(String[] presentes) {
        this.presentes = presentes;
    }
    //começo de código gerado por IA
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Ata ata = (Ata) obj;
        return numero == ata.numero
                && texto.equals(ata.texto)
                && Arrays.equals(presentes, ata.presentes);
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(numero);
        result = 31 * result + (texto != null ? texto.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(presentes);
        return result;
    }
    //fim do código gerado por IA

}
