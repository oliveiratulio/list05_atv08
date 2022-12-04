import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        String numero = sc.nextLine();
        System.out.println("A quantidade de dígitos informadas foi: " + numero.length());
        sc.close();
    }
}
