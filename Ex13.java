import java.util.Scanner;
public class Ex13 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        double a = leitor.nextDouble();
        
        System.out.print("Digite o valor de B: ");
        double b = leitor.nextDouble();
        
        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = leitor.next().charAt(0);
        
        double resultado = 0;
        boolean operacaoValida = true;
        
        switch (operador) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("Divisão por zero não é permitida.");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operador não definido.");
                operacaoValida = false;
        }
        
        if (operacaoValida) {
            System.out.println("Resultado da operação: " + resultado);
        }
    }
}
