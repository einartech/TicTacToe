package com.tictactoe;

public class Main {

  public static void main(String[] args) {
    System.out.println("Bienvenide al juego de Tic Tac Toe, te gustaria jugar?");
    Board board = new Board(3, 3);
    Player player1 = new Player('X');
    Player player2 = new Player('O');
    System.out.print("\n\n\n");
    board.printBoard();

    int turn = 0;

    while (turn < 9) {
      System.out.println("Has utilizado el siguiente turno del juego: " + turn);
      Player currentPlayer = (turn % 2 == 0) ? player1 : player2;
      int[] coordinate = currentPlayer.play();
      board.editBoard(coordinate[0], coordinate[1], currentPlayer.id);
      System.out.print("\n\n\n");
      board.printBoard();

      turn++;
    }

    player1.closeScanner();
    player2.closeScanner();
  }
}