package academy.devdojo.maratonajava.introducao;
/*
Prática

Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
     public static void main(String[] args) {
          String nome = "Kirito";
          String endereco = "Av João das Galileias";
          double salario = 5431.12;
          String dataRecebimentoSalario = "20/12/21";
          String relatorio = "Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de "+dataRecebimentoSalario+" na data ";

          System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + dataRecebimentoSalario + " na data ");
          //System.out.println(relatorio);



     }
}
