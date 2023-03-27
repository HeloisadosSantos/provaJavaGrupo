import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class Exercicio {

    Scanner sc = new Scanner(System.in);
    
//     A Academia de Ginástica Cavaleiros Jedis contratou vocês(grupo) para desenvolver um software
// para cálculo de atividades de seus alunos. Você deve desenvolver um software que possibilite a Inclusão
// das Informações do Aluno: Nome, Idade, Sexo, Altura(m), Peso(kg).
// - Calcular o Peso Ideal do Aluno. A partir do Sexo, da Altura e do Peso, Indicar Quantos Kg o aluno
// Precisa Perder ou Ganhar Para chegar no Peso Ideal.
// - Calcular o IMC do Aluno, que Indica se o Aluno deve desenvolver um Treino para ganho de Massa
// ou Perda de Peso:

//  IMC<20 – Abaixo do Peso
// IMC>20 e <27 – Peso Normal
// IMC>27 – Acima do Peso

    public void Exercicio1() {

     System.out.println("Digite seu nome ");
     String nome = sc.nextLine();
     
     System.out.println("Digite a sua idade");
     int idade = sc.nextInt();

     System.out.println("Digite seu sexo 1 para Feminino 2 Masculino");
     int sexo = sc.nextInt();

     System.out.println("Digite primeiro o seu peso e depois a sua altura");
     int peso = sc.nextInt();
     double Altura = sc.nextDouble();
     
     double imc =peso/Altura*Altura;

     if (imc<20 && sexo==1) {
        System.out.println(" Seu imc é igual a " + peso/Altura*Altura + "está abaixo do peso e deve praticar atividades");
     } if (imc>20 && imc<27) {
        System.out.println("Você está com o seu peso normal ");
     }if (imc>27) {
        System.out.println(" Seu imc está igual"+ peso/Altura*Altura + "prátique atividades Leves");
     }
     
 }
}   