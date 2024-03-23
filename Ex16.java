import java.util.Scanner;
public class Ex16 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        double n1 = leitor.nextDouble();
        System.out.println("Digite a nota 2: ");
        double n2 = leitor.nextDouble();
        System.out.println("Digite a nota 3: ");
        double n3 = leitor.nextDouble();
        
        double media =  (n1 + n2 + n3)/3;

        System.out.println("Media aritmetica: " + media);
    }
}
