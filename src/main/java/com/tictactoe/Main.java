package com.tictactoe;

public class Main {

  public static void main(String[] args) {

    System.out.print("\n\n\n");

    System.out.println("#################################################################################");
    System.out.println("#                                                                               #");
    System.out.println("#  TTTTT  III   CCCCC  TTTTT   AAAAAAA  CCCCC  TTTTT    OOOOO   EEEEE           #");
    System.out.println("#    T     I    C        T     A     A  C        T     O     O  E               #");
    System.out.println("#    T     I    C        T     AAAAAAA  C        T     O     O  EEEE            #");
    System.out.println("#    T     I    C        T     A     A  C        T     O     O  E               #");
    System.out.println("#    T    III   CCCCC    T     A     A  CCCCC    T      OOOOO   EEEEE           #");
    System.out.println("#                                                                               #");
    System.out.println("#                                                                               #");
    System.out.println("#                                                   BY: MILENA & EINAR          #");
    System.out.println("#                                                                               #");
    System.out.println("#                                                                               #");
    System.out.println("#                                                                               #");
    System.out.println("#                                                                               #");
    System.out.println("#################################################################################");
    System.out.println("#                                                                               #");
    System.out.println("# INSTRUCCIONES DEL JUEGO                                                       #");
    System.out.println("#                                                                               #");
    System.out.println("#    1.-Selecciona una posición para tu ficha.                                  #");
    System.out.println("#    2.-Fila y columna deben ser números entre 0 y 2.                           #");
    System.out.println("#    3.-Escribe los dos números separados por un espacio.                       #");
    System.out.println("#    4.-Ejemplo válido: 1 2 (colocará tu ficha en fila 1, columna 2).           #");
    System.out.println("#                                                                               #");
    System.out.println("#                                                                               #");
    System.out.println("#################################################################################");

    System.out.print("\n\n\n");

    Board board = new Board(3, 3);
    Player player1 = new Player('X');
    Player player2 = new Player('O');

    System.out.print("\n\n\n");
    board.printBoard();
    System.out.print("\n\n\n");
    int turn = 0;
    boolean tryAgain = false;

    while (turn < 9) {
      if (tryAgain) {
        System.out.println("Turno actual: " + turn);
      }
      Player currentPlayer = (turn % 2 == 0) ? player1 : player2;
      int[] coordinate = currentPlayer.play(tryAgain);

      if (coordinate[0] < 0 || coordinate[0] >= board.getRow() || coordinate[1] < 0
          || coordinate[1] >= board.getColumn()) {
        System.out.println("Posición inválida. Por favor, ingresa una fila y columna válidas.");
        tryAgain = true;
        continue;
      }

      tryAgain = board.hasValue(coordinate[0], coordinate[1]);
      if (!tryAgain) {
        board.editBoard(coordinate[0], coordinate[1], currentPlayer.getId());
        System.out.print("\n\n\n");
        board.printBoard();
        System.out.print("\n\n\n");

        boolean victory = board.checkVictory(currentPlayer.getId());
        if (victory) {
          System.out.println("El jugador " + currentPlayer.getId() + " ha ganado!");
          break;
        }

        turn++;
      }
    }

    if (turn == 9 && !board.checkVictory(player1.getId()) && !board.checkVictory(player2.getId())) {
      System.out.println("El juego ha terminado en empate!");
    }

    player1.closeScanner();
    player2.closeScanner();

    System.out.println("Gracias por jugar al Tic Tac Toe!");
  }
}