import java.util.Scanner;

public class Imc
{
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.printf("Digite o seu peso: ");
        double peso = leitor.nextDouble();

        System.out.printf("Digite sua altura: ");
        double altura = leitor.nextDouble();

        double imc = peso /(altura * altura);
        System.out.println("Seu IMC é: " + imc);

        if (imc < 18.5) 
            System.out.println("Abaixo do peso! ");

        else if(imc >= 18.6 && imc <= 24.9)
            System.out.println("Normal! ");

        else if(imc >= 25 && imc <= 29.9)
            System.out.println("Sobrepeso! ");

        else
            System.out.println("Obeso! ");
    }
}
