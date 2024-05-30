public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(int primeiroNumero, int segundoNumero) {
        super("O segundo parâmetro deve ser maior que o primeiro");
        
        
    }
}