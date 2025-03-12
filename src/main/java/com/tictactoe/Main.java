package com.tictactoe;

// import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    System.out.println("Bienvenide al juego de Tic Tac Toe, te gustaria jugar?");
    // System.out.println("Selecciona una fila y una columna (separadas por un espacio):");
    // Scanner scanner = new Scanner(System.in);
    // String response = scanner.nextLine();

    // System.out.println("RESPONSE:");
    // String[] parts = response.split(" ");
    // int fila = Integer.parseInt(parts[0]);
    // int columna = Integer.parseInt(parts[1]);

    // System.out.println("Fila: " + fila);
    // System.out.println("Columna: " + columna);

    Board board = new Board(3, 3);
    Player player1 = new Player('X');
    Player player2 = new Player('O');
    System.out.print("\n\n\n");
    board.printBoard();//4 imprime el tablero
    
    int initialPlayer = 0;
    while (initialPlayer <= 9) {
      
      initialPlayer = initialPlayer+1;
    }

    int[] coordinate = player1.play();
    board.editBoard(coordinate[0], coordinate[1], player1.id);
    System.out.print("\n\n\n");                             
    board.printBoard();


    int[] coordinateTwo = player2.play();
    board.editBoard(coordinateTwo[0], coordinateTwo[1], player2.id);
    System.out.print("\n\n\n");                             
    board.printBoard();

    // scanner.close();
    player1.closeScanner();
  }

  // Crear clase player para gestion de turnitos
} // para no repetir esto 9 veces debo investigar como hacer el bucle 