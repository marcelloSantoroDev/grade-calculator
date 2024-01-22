package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * The type Student register.
 */
public class Calculator {
  /**
   * The type Student register.
   */
  public void calculate() {
    /* Instanciar Scanner */
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar:");
    String attQty = scanner.nextLine();
    int activitiesNum = Integer.parseInt(attQty);

    /* Criar arrays para armazenar dados do estudante */
    String[] activitiesArr = new String[activitiesNum];
    int[] activitiesweight = new int[activitiesNum];
    int[] activitiesGrade = new int[activitiesNum];

    /* Iniciar laço de repetição para próximas perguntas */
    for (int i = 1; i <= activitiesNum; i++) {
      /* Inicío com i = 1, então, para adicionar o dado na posição
      certa do array, devo colocar "array[i - 1]"; */
      System.out.println("Digite o nome da atividade " + i + ":");
      activitiesArr[i - 1] = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + i + ":");
      activitiesweight[i - 1] = Integer.parseInt(scanner.nextLine());
      System.out.println("Digite a nota obtida para " + activitiesArr[i - 1] + ":");
      activitiesGrade[i - 1] = Integer.parseInt(scanner.nextLine());
    }

    scanner.close();

    /* Chamando método para receber a soma dos pesos */
    int sumCheck = weightSum(activitiesweight);

    /* Requisito 3: a soma dos pesos deve ser 100 */
    if (sumCheck != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
      return;
    }

    /* Chamando método para receber o cálculo da nota */
    double grade = studentGrade(activitiesGrade, activitiesweight);
    if (grade >= 85.0) {
      System.out.println("Parabéns! Você alcançou " + grade + "%!"
          + " E temos o prazer de informar que você obteve aprovação!");
    } else {
      System.out.println("Lamentamos informar que, "
          + "com base na sua pontuação alcançada neste período, "
          + grade + "%" + ", você não atingiu a pontuação mínima necessária para sua aprovação.");
    }
  }


  /**
   * weight sum int.
   *
   * @param weight the weight
   * @return the int
   */
  public int weightSum(int[] weight) {
    /* Lógica para somar o peso das notas */
    int sum = 0;
    for (int j : weight) {
      sum += j;
    }
    return sum;
  }

  /**
   * Student grade double.
   *
   * @param grd    the grd
   * @param weight the weight
   * @return the double
   */
  public double studentGrade(int[] grd, int[] weight) {
    /* Cálculo para nota: (peso1*nota1)+(peso2*nota2) / (peso1 + peso2)

     eu terei que percorrer dois arrays: array de notas e array de pesos

     o indíce da nota no array corresponde ao índice do seu peso no seu respetivo array

     Sabendo a quantidade de atividades cadastradas,
     eu posso criar dois laços de repetição e acessar
     as posições corretas de cada array.
     Em um dos laços, eu vou fazer "(peso1*nota1)+(peso2*nota2)" --
     a multiplicação se dará no corpo do laço,
     e a soma será resultado de um incremento dentro da variável gradeAndweight.
     O segundo laço será para "(peso1 + peso2)" usando a mesma lógica do primeiro laço.

     Após os resultados terem sido armazenados nas suas respetivas variáveis,
     a divisão "(peso1*nota1)+(peso2*nota2) / (peso1 + peso2)"
     deverá ser retornada pelo método.

    *  */

    double gradeAndweight = 0.0;
    double totalweight = 0.0;

    for (int i = 0; i < grd.length; i++) {
      gradeAndweight += weight[i] * grd[i];
      totalweight += weight[i];
    }
    return gradeAndweight / totalweight;
  }

}

