package estudantes.entidades;

import professor.entidades.CodigoCurso;
import java.util.Arrays;

/**
 * @author Guilherme Menhard
 */


public class Edital extends Norma {
    
    private String[] responsaveis;

    public Edital(String[] responsaveis, int numero, boolean valido, String texto, String criador, CodigoCurso codigoCurso, int paginas) {
        super(numero, valido, texto, criador, codigoCurso, paginas);
        this.responsaveis = responsaveis;
    }

    public String[] getResponsaveis() {
        return responsaveis;
    }

    public void setResponsaveis(String[] responsaveis) {
        this.responsaveis = responsaveis;
    }

/* Início do Código gerado por IA 
 * Este foi o primeiro equals(); que usava Arrays, precisei de ajuda da IA para criar. Também pedi para ajudar no hashCode(), mas foi codado manualmente.
 * A IA também sugeriu fazer o equals() dessa forma:
 * 
 * public boolean equals(Object obj) {
 *     if (this == obj) return true;
 *     if (obj == null || getClass() != obj.getClass()) return false;
 *     Oficio oficio = (Oficio) obj;
 *     return Arrays.equals(destinatarios, oficio.destinatarios) && super.equals(oficio);
 * }
 * 
 * Porém, preferi manter o padrão que já estava sendo usado.
*/
    public boolean equalsEdital(Edital edital) {
        if (Arrays.equals(this.getResponsaveis(), edital.getResponsaveis()) && this.equalsNorma(edital)) {
            return true;
        }
        return false;
    }
/* Fim do Código gerado por IA 
*/

    public int hashCodeEdital() {
        int result = 17; 
        result = 31 * result + Arrays.hashCode(getResponsaveis());
        result = 31 * result + hashCodeNorma();
        return result;
    }
}