package estudantes.entidades;

import professor.entidades.CodigoCurso;

/**
 * @author Guilherme Menhard
 */

public class Norma extends DocumentoAdministrativo {
    private int numero;
    private boolean valido;
    private String texto;

    public Norma(String texto, CodigoCurso codigoCurso, int numero, int paginas, boolean valido, String criador) {
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

    public String geTexto() {
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Norma norma = (Norma) obj;
        return numero == norma.numero && texto.equals(norma.texto) && valido == norma.valido;
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(numero);
        result = 31 * result + (valido ? 1 : 0);
        result = 31 * result + (texto != null ? texto.hashCode() : 0);
        return result;
    }
}
