import java.util.Scanner;
public class Ex09 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double a = leitor.nextDouble();
        System.out.println("Digite outro numero: ");
        double b = leitor.nextDouble();

        if (a == b){
            System.out.println("Numeros iguais");
        } else {
            if(a > b) {
                System.out.println(a + " é maior que " + b);
            } else {
                System.out.println(b + " é maior que " + a);
            }    
        }
    }
}
