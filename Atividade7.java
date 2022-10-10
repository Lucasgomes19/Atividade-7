import java.util.Scanner;

public class Atividade7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a medida de um dos lados do quadrado: ");
        int lado = sc.nextInt();

        int area = lado * lado;

        int dobro = area * 2;

        System.out.println("O dobro da área do quadrado cujo o lado tem o valor '" + lado + "' é igual à: " + dobro);

        sc.close();

    }
    
}