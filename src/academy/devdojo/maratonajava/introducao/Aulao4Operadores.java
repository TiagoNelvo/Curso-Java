package academy.devdojo.maratonajava.introducao;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Aulao4Operadores {
    public static void main(String[] args) {
        // + - * /
        int num01 = 10;
        int num02 = 20;
        double resultado = num01 / (double)num02;
        System.out.println(resultado);


        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // Operadores relacionais
        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMaiorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezMaiorQueVinte "+isDezIgualVinte);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);

        //Operadores Lógicos
        // && (And) || (or)  !

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >=30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

    }
}
