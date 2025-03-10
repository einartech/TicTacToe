package com.tictactoe;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    System.out.println("Bienvenide al juego de Tic Tac Toe, te gustaria jugar?");
    System.out.println("Selecciona una fila y una columna (separadas por un espacio):");
    Scanner scanner = new Scanner(System.in);
    String response = scanner.nextLine();

    System.out.println("RESPONSE:");
    String[] parts = response.split(" ");
    int fila = Integer.parseInt(parts[0]);
    int columna = Integer.parseInt(parts[1]);

    System.out.println("Fila: " + fila);
    System.out.println("Columna: " + columna);

    Board board = new Board(3, 3);
    System.out.print("\n\n\n");
    board.printBoard();

    board.editBoard(fila, columna, 'X');
    System.out.print("\n\n\n");
    board.printBoard();

    scanner.close();
  }

  //Crear clase player para gestion de turnitos
}