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
// resolução exe6 IfElse

//    System.out.println("Informe a altura");
//    double altura = sc.nextDouble();
//    System.out.println("Informe o sexo: 1- Feminino; 2-Masculino;");
//    int sexo = sc.nextInt();
//    double pesoIdeal;
//    if (sexo == 1) {// Feminino
//        pesoIdeal = 62.1 * altura - 44.7;
//    } else { // Masculino
//        pesoIdeal = 72.7 * altura - 58;
//    }
//    System.out.println("Seu peso idel é " + pesoIdeal + " Kg");
// Identificar a Faixa Etário do Aluno:
// Idade I - 16 a 25 anos
// Idade II - 25 a 35 anos
// Idade III – 36 a 45 anos
// Idade IV – 46 a 55 anos
// Idade V – 56 a 65 anos
// Idade VI – 66+


// Musculação Intensa    Difícil   II, III
// Luta                  Difícil   I, II, III, IV
// Pilates               Difícil   IV, V, VI

// Musculação Moderada   Moderada  I, II, III, IV
// Corrida               Moderada  II, III, IV, V
// Dança                 Moderada  Todas

// Musculação Leve       Leve      I, IV, V, VI
// Ioga                  Leve      Todas

// criar um syso para pessoas com menos de 16 anos

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
     
    double imc = peso/(Altura*Altura);
   // I
      if (imc<20 && sexo==1 && idade>5 && idade>16 && idade<25) {
      System.out.println(" Seu imc é igual a " + peso/(Altura*Altura) + " está abaixo do peso e deve praticar atividades diciceis como: Luta.  Ganhe entre " + (62.1* Altura - 44.7) + " Kg para estar no seu peso ideal" );
   // I  
      }if (imc<20 && sexo==2 && idade>5 && idade>16 && idade<25) {
      System.out.println(" Seu imc é igual a " + peso/(Altura*Altura) + " está abaixo do peso e deve praticar atividades dificeis como: Luta.  Ganhe entre " + (72.7* Altura - 58) + " Kg para estar no seu peso ideal");
   // II
      }if (imc<20 && sexo==2 && idade>25 && idade<35) {
      System.out.println(" Seu imc é igual a " + peso/(Altura*Altura) + " está abaixo do peso e deve praticar atividades dificeis como: Luta,Musculação Intensa.  Ganhe entre " + (72.7* Altura - 58) + " Kg para estar no seu peso ideal");
   // II
      }if (imc<20 && sexo==1 && idade>25 && idade<35) {
      System.out.println(" Seu imc é igual a " + peso/(Altura*Altura) + " está abaixo do peso e deve praticar atividades dificeis como: Luta,Musculação Intensa.  Ganhe entre " + (62.1* Altura - 44.7) + " Kg para estar no seu peso ideal");
   // III
      }if (imc<20 && sexo==2 && idade>35 && idade<45) {
      System.out.println(" Seu imc é igual a " + peso/(Altura*Altura) + " está abaixo do peso e deve praticar atividades dificeis como: Luta,Musculação Intensa.  Ganhe entre " + (72.7* Altura - 58) + " Kg para estar no seu peso ideal");
   // III
      }if (imc<20 && sexo==1 && idade>35 && idade<45) {
      System.out.println(" Seu imc é igual a " + peso/(Altura*Altura) + " está abaixo do peso e deve praticar atividades dificeis como: Luta,Musculação Intensa.  Ganhe entre " + (62.1* Altura - 44.7) + " Kg para estar no seu peso ideal");
   // IV
      }if (imc<20 && sexo==2 && idade>45 && idade<55) {
      System.out.println(" Seu imc é igual a " + peso/(Altura*Altura) + " está abaixo do peso e deve praticar atividades dificeis como: Luta.  Ganhe entre " + (72.7* Altura - 58) + " Kg para estar no seu peso ideal");
   // IV
      }if (imc<20 && sexo==1 && idade>45 && idade<55) {
      System.out.println(" Seu imc é igual a " + peso/(Altura*Altura) + " está abaixo do peso e deve praticar atividades dificeis como: Luta,Pilates.  Ganhe entre " + (62.1* Altura - 44.7) + " Kg para estar no seu peso ideal");
   // V
      }if (imc<20 && sexo==2 && idade>55 && idade<65) {
      System.out.println(" Seu imc é igual a " + peso/(Altura*Altura) + " está abaixo do peso e deve praticar atividades dificeis.  Ganhe entre " + (72.7* Altura - 58) + " Kg para estar no seu peso ideal");
   // V
      }if (imc<20 && sexo==1 && idade>55 && idade<65) {
      System.out.println(" Seu imc é igual a " + peso/(Altura*Altura) + " está abaixo do peso e deve praticar atividades dificeis como:Pilates.  Ganhe entre " + (62.1* Altura - 44.7) + " Kg para estar no seu peso ideal");
   // VI
      }if (imc<20 && sexo==2 && idade>66) {
      System.out.println(" Seu imc é igual a " + peso/(Altura*Altura) + " está abaixo do peso e deve praticar atividades dificeis como: Pilates.  Ganhe entre " + (72.7* Altura - 58) + " Kg para estar no seu peso ideal");
   // VI
      }if (imc<20 && sexo==1 && idade>66) {
      System.out.println(" Seu imc é igual a " + peso/(Altura*Altura) + " está abaixo do peso e deve praticar atividades dificeis como: Pilates.  Ganhe entre " + (62.1* Altura - 44.7) + " Kg para estar no seu peso ideal");


   // I
      }if (imc>20 && imc<27 && sexo==1 && idade>5 && idade>16 && idade<25){
      System.out.println(" Seu imc é igual"  + peso/(Altura*Altura) +  " seu peso normal então pratique atividades moderadas como: Musculação Moderada,Dança" ); 
    // I
      }if (imc>20 && imc<27 && sexo==2 && idade>5 && idade>16 && idade<25){
      System.out.println(" Seu imc é igual"  + peso/(Altura*Altura) +  " seu peso normal então pratique atividades moderadas como: Musculação Moderada,Dança" ); 
   // II   
      }if (imc>20 && imc<27 && sexo==1 && idade>25 && idade<35){
      System.out.println(" Seu imc é igual"  + peso/(Altura*Altura) +  " seu peso normal então pratique atividades moderadas como: Musculação Moderada,Dança,Corrida" );
   // II 
      }if (imc>20 && imc<27 && sexo==2 && idade>25 && idade<35) {
      System.out.println(" Seu imc é igual"  + peso/(Altura*Altura) +  " seu peso normal então pratique atividades moderadas como: Musculação,Dança,Corrida " );
   // III
      }if (imc>20 && imc<27 && sexo==1 && idade>35 && idade<45){
      System.out.println(" Seu imc é igual"  + peso/(Altura*Altura) +  " seu peso normal então pratique atividades moderadas como: Musculação Moderada,Corrida,Dança" ); 
   // III
      }if (imc>20 && imc<27 && sexo==2 && idade>35 && idade<45){
      System.out.println(" Seu imc é igual"  + peso/(Altura*Altura) +  " seu peso normal então pratique atividades moderadas como: Musculação Moderada,Corrida,Dança" ); 
   // IV
      }if (imc>20 && imc<27 && sexo==1 && idade>45 && idade<55){
      System.out.println(" Seu imc é igual"  + peso/(Altura*Altura) +  " seu peso normal então pratique atividades moderadas como: Musculação Moderada,Corrida,Dança" ); 
   // IV
      }if (imc>20 && imc<27 && sexo==2 && idade>45 && idade<55){
      System.out.println(" Seu imc é igual"  + peso/(Altura*Altura) +  " seu peso normal então pratique atividades moderadas como: Musculação Moderada,Corrida,Dança" ); 
   // V
      }if (imc>20 && imc<27 && sexo==1 && idade>55 && idade<65){
      System.out.println(" Seu imc é igual"  + peso/(Altura*Altura) +  " seu peso normal então pratique atividades moderadas como: Corrida,Dança" ); 
   // V
      }if (imc>20 && imc<27 && sexo==2 && idade>55 && idade<65){
      System.out.println(" Seu imc é igual"  + peso/(Altura*Altura) +  " seu peso normal então pratique atividades moderadas como: Corrida,Dança" ); 
    // VI
      }if (imc>20 && imc<27 && sexo==1 && idade>66){
      System.out.println(" Seu imc é igual"  + peso/(Altura*Altura) +  " seu peso normal então pratique atividades moderadas como: Dança" ); 
   // VI
      }if (imc>20 && imc<27 && sexo==2 && idade>66){
      System.out.println(" Seu imc é igual"  + peso/(Altura*Altura) +  " seu peso normal então pratique atividades moderadas como: Dança" ); 



   // I
      }if (imc>27 && sexo==1 &&  idade>5 && idade>16 && idade<25) {
      System.out.println( " Seu imc está igual " + peso/(Altura*Altura) + " prátique atividades Leves como: Musculação Leve,Yoga " + (62.1* Altura - 44.7) + " Kg este é o valor que você precisaria perder para estar no peso ideal." );
   // I   
      }if (imc>27 && sexo==2 && idade>5 && idade>16 && idade<25) {
      System.out.println( " Seu imc está igual " + peso/(Altura*Altura) + " prátique atividades Leves como: Musculação Leve,Yoga " + (72.7* Altura - 58) + " Kg este é o valor que você precisaria perder para estar no peso ideal." );
   // II   
      }if (imc>27 && sexo==1 && idade>25 && idade<35) {
      System.out.println( " Seu imc está igual " + peso/(Altura*Altura) + " prátique atividades Leves como: Yoga " + (62.1* Altura - 44.7) + " Kg este é o valor que você precisaria perder para estar no peso ideal." );
   // II  
      }if (imc>27 && sexo==2 && idade>25 && idade<35) {
      System.out.println( " Seu imc está igual " + peso/(Altura*Altura) + " prátique atividades Leves como: Yoga " + (72.7* Altura - 58) + " Kg este é o valor que você precisaria perder para estar no peso ideal." );
   // III
      }if (imc>27 && sexo==1 && idade>35 && idade<45) {
      System.out.println( " Seu imc está igual " + peso/(Altura*Altura) + " prátique atividades Leves como: Yoga " + (62.1* Altura - 44.7) + " Kg este é o valor que você precisaria perder para estar no peso ideal." );
   // III 
      }if (imc>27 && sexo==2 && idade>35 && idade<45) {
      System.out.println( " Seu imc está igual " + peso/(Altura*Altura) + " prátique atividades Leves como: Yoga "  + (72.7* Altura - 58) + " Kg este é o valor que você precisaria perder para estar no peso ideal." );
   // IV
      }if (imc>27 && sexo==1 && idade>45 && idade<55) {
      System.out.println( " Seu imc está igual " + peso/(Altura*Altura) + " prátique atividades Leves como: Musculação leve,Yoga " + (62.1* Altura - 44.7) + " Kg este é o valor que você precisaria perder para estar no peso ideal." );
   // IV
      }if (imc>27 && sexo==2 && idade>45 && idade<55) {
      System.out.println( " Seu imc está igual " + peso/(Altura*Altura) + " prátique atividades Leves como: Musculação Leve,Yoga " + (72.7* Altura - 58) + " Kg este é o valor que você precisaria perder para estar no peso ideal." );   
   // V 
      }if (imc>27 && sexo==1 && idade>55 && idade<65) {
      System.out.println( " Seu imc está igual " + peso/(Altura*Altura) + " prátique atividades Leves como: Musculação Leve,Yoga " + (62.1* Altura - 44.7) + " Kg este é o valor que você precisaria perder para estar no peso ideal." );
   // V
      }if (imc>27 && sexo==2 && idade>55 && idade<65) {
      System.out.println( " Seu imc está igual " + peso/(Altura*Altura) + " prátique atividades Leves como: Musculação Leve,Yoga " + (72.7* Altura - 58) + " Kg este é o valor que você precisaria perder para estar no peso ideal." );
   // VI
      }if (imc>27 && sexo==1 && idade>66 ) {
      System.out.println( " Seu imc está igual " + peso/(Altura*Altura) + " prátique atividades Leves como: Musculação Leve,Yoga " + (62.1* Altura - 44.7) + " Kg este é o valor que você precisaria perder para estar no peso ideal." );
   // VI
      }if (imc>27 && sexo==2 && idade>66) {
      System.out.println( " Seu imc está igual " + peso/(Altura*Altura) + " prátique atividades Leves como: Musculação Leve,Yoga  " + (72.7* Altura - 58) + " Kg este é o valor que você precisaria perder para estar no peso ideal." );
   }
      }
   }  
 
