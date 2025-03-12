package com.tictactoe;

public class Main {

  public static void main(String[] args) {
    // Mensaje de bienvenida
    System.out.println("Bienvenide al juego de Tic Tac Toe, te gustaria jugar?");

    // Inicializar el tablero y los jugadores
    Board board = new Board(3, 3);
    Player player1 = new Player('X');
    Player player2 = new Player('O');

    // Imprimir el tablero inicial
    System.out.print("\n\n\n");
    board.printBoard();

    int turn = 0;

    // Ciclo de turnos del juego
    while (turn < 9) {
      System.out.println("Turno actual: " + turn);
      Player currentPlayer = (turn % 2 == 0) ? player1 : player2;
      int[] coordinate = currentPlayer.play();
      board.editBoard(coordinate[0], coordinate[1], currentPlayer.getId());
      System.out.print("\n\n\n");
      board.printBoard();
      System.out.print("\n\n\n");

      turn++;
    }

    // Cerrar los escáneres de los jugadores
    player1.closeScanner();
    player2.closeScanner();

    // Mensaje de despedida
    System.out.println("Gracias por jugar al Tic Tac Toe!");
  }
}