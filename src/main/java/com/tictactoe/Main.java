package com.tictactoe;

public class Main {
  public static void main(String[] args) {
    Board board = new Board(3, 3); // Crear un tablero de 3x3

    System.out.print("\n\n\n");
    board.PrintBoard(); // Se imprime tablero de inicio de juego, vacio

    board.EditBoard(0, 1, 'X'); // Turno 1: X
    System.out.print("\n\n\n");

    board.PrintBoard(); // Imprimir el tablero + turno 1
    board.EditBoard(1, 1, 'O'); // Turno 2: O
    System.out.print("\n\n\n");
    board.PrintBoard(); // Imprimir el tablero + turno 1 y 2

  }
}