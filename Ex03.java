import java.util.Scanner;

public class Ex03 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double a = leitor.nextDouble();
        System.out.println("Digite outro numero: ");
        double b = leitor.nextDouble();
        
        if(a > b){
            System.out.println(a + " e maior que " + b);
        }else if (a == b) {
            System.out.println("Sequencia de numeros informados e invalida");
        }else{
            System.out.println(b + " e maior que " + a);
        }   
    }
}
