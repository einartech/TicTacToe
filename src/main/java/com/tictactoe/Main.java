package com.tictactoe;

public class Main {

  public static void main(String[] args) {

    // Título completo "TICTACTOE" con estilo ASCII mejorado y bordes cuadrados
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

    // Inicializar el tablero y los jugadores
    Board board = new Board(3, 3);
    Player player1 = new Player('X');
    Player player2 = new Player('O');

    // Imprimir el tablero inicial
    System.out.print("\n\n\n");
    board.printBoard();
    System.out.print("\n\n\n");
    int turn = 0;
    boolean tryAgain = false;// defini una variable (tryAgain) para que el jugador pueda intentarlo de nuevo
                             // digitando las coordenadas

    // Ciclo de turnos del juego
    while (turn < 9) {
      if (tryAgain) {
        System.out.println("Turno actual: " + turn);// para que mostrar el turno actual? no se muestra el
      }
                                                                  // turno actual cuando es un reintento
      Player currentPlayer = (turn % 2 == 0) ? player1 : player2;
      int[] coordinate = currentPlayer.play(tryAgain);// va el valor tryAgain para que no se muestre el mensaje :
                                                      // intentalo de nuevo
      tryAgain = board.hasValue(coordinate[0], coordinate[1]);// asigna el valor que Verifica si tiene un valor en la
                                                              // posicion
      if (!tryAgain) {// if para validar si es un reintento

        // codigo como estaba para asignar el valor en el tablero
        board.editBoard(coordinate[0], coordinate[1], currentPlayer.getId());
        System.out.print("\n\n\n");
        board.printBoard();
        System.out.print("\n\n\n");

        turn++;
      }
    }

    // Cerrar los escáneres de los jugadores
    player1.closeScanner();
    player2.closeScanner();

    // Mensaje de despedida
    System.out.println("Gracias por jugar al Tic Tac Toe!");
  }
}