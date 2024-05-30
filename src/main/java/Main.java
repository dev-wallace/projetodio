import java.util.Scanner;
public class Main {
  public static void main(String[] args) {



      try {
        //chamando o método contendo a lógica de contagem
          contar();

      } catch (ParametrosInvalidosException e) {
          // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
          System.out.println(e.getMessage());
      }

    }
     static void contar() throws ParametrosInvalidosException {
       Scanner sc = new Scanner(System.in);
       System.out.println("Digite o primeiro numero");
         int primeiroNumero = sc.nextInt();
         System.out.println("Digite o segundo numero");
       int segundoNumero = sc.nextInt();
      //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
       if (segundoNumero <= primeiroNumero) {
         throw new ParametrosInvalidosException(primeiroNumero, segundoNumero);}
       
      int contagem = segundoNumero - primeiroNumero;
      for(int i = 0; i<=contagem; i++)
        System.out.println(i);
      //realizar o for para imprimir os números com base na variá
  }
}
