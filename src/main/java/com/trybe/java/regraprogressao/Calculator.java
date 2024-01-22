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
  }

}

