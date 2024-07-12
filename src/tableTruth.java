public class tableTruth {

    public static void main(String[] args) {

        // TABLE TRUTH
        // Operation && (AND)
        // true  && true  = true
        // true  && false = false
        // false && true  = false
        // false && false = salse

        // Operador || (OR)
        // Operation && (AND)
        // true  || true  = true
        // true  || false = true
        // false || true  = true
        // false || false = false

        boolean fimDeSemana = true;
        boolean fazendoSol  = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        System.out.println(vamosAPraia);

        String mensagem1 = fimDeSemana ? "É um fim de semana" : "Não é um fim de semana";
        String mensagem2 = fazendoSol ? "Está fazendo sol" : "Não está fazendo sol";

        System.out.println(mensagem1);
        System.out.println(mensagem2);

    }
}
