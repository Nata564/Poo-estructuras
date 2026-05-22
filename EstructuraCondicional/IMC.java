package condicionales;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double peso, altura, imc;

        System.out.print("Ingrese peso: ");
        peso = sc.nextDouble();

        System.out.print("Ingrese altura: ");
        altura = sc.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("IMC: " + imc);

        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }

        sc.close();
    }
}