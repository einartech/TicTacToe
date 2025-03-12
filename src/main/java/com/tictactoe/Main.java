package com.tictactoe;

public class Main {
  public static void main(String[] args) {

    System.out.println("Bienvenide al juego de Tic Tac Toe, te gustaria jugar?");
    Board board = new Board(3, 3);
    Player player1 = new Player('X');
    Player player2 = new Player('O');
    System.out.print("\n\n\n");
    board.printBoard();

    // ! Revisar este bucle :)
    int initialPlayer = 0;
    while (initialPlayer <= 9) {

      initialPlayer = initialPlayer + 1;
    }

    // ? Investigar como ponerlo

    int[] coordinate = player1.play();
    board.editBoard(coordinate[0], coordinate[1], player1.id);
    System.out.print("\n\n\n");
    board.printBoard();

    int[] coordinateTwo = player2.play();
    board.editBoard(coordinateTwo[0], coordinateTwo[1], player2.id);
    System.out.print("\n\n\n");
    board.printBoard();

    player1.closeScanner();
  }

}