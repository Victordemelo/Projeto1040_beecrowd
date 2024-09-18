/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author victo
 */
import java.util.Scanner;

public class Projeto1040 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float n1, n2, n3, n4, ne, mediafinal, media;

        n1 = leitor.nextFloat();
        n2 = leitor.nextFloat();
        n3 = leitor.nextFloat();
        n4 = leitor.nextFloat();

        media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;

        if (media >= 7.0) {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno aprovado.");
        } else {
            if (media < 5.0) {
                System.out.printf("Media: %.1f%n", media);
                System.out.println("Aluno reprovado.");
            } else {
                if (media >= 5.0 && media <= 6.9) {
                    System.out.printf("Media: %.1f%n", media);
                    System.out.println("Aluno em exame.");
                    ne = leitor.nextFloat();
                    mediafinal = (ne + media) / 2;
                    System.out.printf("Nota do exame: %.1f%n", ne);
                    
                    if (mediafinal >= 5.0) {
                        System.out.println("Aluno aprovado.");
                        System.out.printf("Media final: %.1f%n", mediafinal);
                    } else {
                        System.out.println("Aluno reprovado.");
                        System.out.printf("Media final: %.1f%n", mediafinal);
                    }
                }
            }
        }
    }
}
