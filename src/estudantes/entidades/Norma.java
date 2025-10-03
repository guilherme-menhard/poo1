package estudantes.entidades;

import professor.entidades.CodigoCurso;

/**
 * @author Guilherme Menhard
 */

public class Norma extends DocumentoAdministrativo {
    private int numero;
    private boolean valido;
    private String texto;

    public Norma(int numero, boolean valido, String texto, String criador, CodigoCurso codigoCurso, int paginas) {
        super(criador, codigoCurso, paginas);
        this.numero = numero;
        this.valido = valido;
        this.texto = texto;
    }

    public int getNumero() {
        return numero;
    }

    public boolean getValido() {
        return valido;
    } 

    public String getTexto() {
        return texto;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean equalsNorma(Norma norma) {
        if (this.getNumero() == norma.getNumero() && this.getValido() == norma.getValido() && this.getTexto().equals(norma.getTexto()) && this.equalsDocumentoAdministrativo(norma)) {
            return true;
        }
        return false;
    }

    public int hashCodeNorma() {
        int result = 17; 
        result = 31 * result + getNumero();
        result = 31 * result + (getValido() ? 1 : 0);
        result = 31 * result + (getTexto() != null ? getTexto().hashCode() : 0);
        result = 31 * result + hashCodeDocumentoAdministrativo();
        return result;
    }
}
