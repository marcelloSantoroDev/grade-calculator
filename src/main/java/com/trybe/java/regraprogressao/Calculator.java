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
    int[] activitiesWeigth = new int[activitiesNum];
    int[] activitiesGrade = new int[activitiesNum];

    /* Iniciar laço de repetição para próximas perguntas */
    for (int i = 1; i <= activitiesNum; i++) {
      /* Inicío com i = 1, então, para adicionar o dado na posição
      certa do array, devo colocar "array[i - 1]"; */
      System.out.println("Digite o nome da atividade " + i + ":");
      activitiesArr[i - 1] = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + i + ":");
      activitiesWeigth[i - 1] = Integer.parseInt(scanner.nextLine());
      System.out.println("Digite a nota obtida para " + activitiesArr[i - 1] + ":");
      activitiesGrade[i - 1] = Integer.parseInt(scanner.nextLine());
    }

    /* Chamando método para receber a soma dos pesos */
    int sumCheck = weigthSum(activitiesWeigth);

    /* Requisito 3: a soma dos pesos deve ser 100 */
    if(sumCheck != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    } else {
      System.out.println("Continue a implementar");
    }
  }

  public int weigthSum (int[] weigth) {
    /* Lógica para somar o peso das notas */
    int sum = 0;
    for (int j : weigth) {
      sum += j;
    }
    return sum;
  }

  public double studentGrade (int[] att, int[] weigth) {
    /* Cálculo para nota: (peso1*nota1)+(peso2*nota2) / (peso1 + peso2)

     eu terei que percorrer dois arrays: array de notas e array de pesos

     o indíce da nota no array corresponde ao índice do seu peso no seu respetivo array

     Sabendo a quantidade de atividades cadastradas, eu posso criar dois laços de repetição e acessar
     as posições corretas de cada array. Em um dos laços, eu vou fazer "(peso1*nota1)+(peso2*nota2)" --
     a multiplicação se dará no corpo do laço, e a soma será resultado de um incremento dentro da variável gradeAndWeigth.
     O segundo laço será para "(peso1 + peso2)" usando a mesma lógica do primeiro laço.

     Após os resultados terem sido armazenados nas suas respetivas variáveis, a divisão "(peso1*nota1)+(peso2*nota2) / (peso1 + peso2)"
     deverá ser retornada pelo método.

    *  */
    return 0.0;
  }

}

