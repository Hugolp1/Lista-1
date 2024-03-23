import java.util.Scanner;
public class Ex14 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor do primeiro termo (a1): ");
        int a1 = leitor.nextInt();
        
        System.out.print("Digite o valor do número do termo (n): ");
        int n = leitor.nextInt();
        
        System.out.print("Digite o valor da razão (r): ");
        int r = leitor.nextInt();
        
        int an = a1 + (n - 1) * r;
        
        System.out.println("O " + n + "-ésimo termo da progressão aritmética é: " + an);
    }
}
