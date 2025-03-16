package com.tictactoe;

import java.util.Scanner;

public class Player {
    private char id;
    private Scanner scanner;

    /**
     * Constructor para inicializar un jugador con un identificador.
     *
     * @param id Identificador del jugador (por ejemplo, 'X' o 'O').
     */
    public Player(char id) {
        this.id = id;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Solicita al jugador que ingrese una fila y una columna para su jugada.
     *
     * @param playerTryAgain Indica si el jugador debe intentar de nuevo.
     * @return Un arreglo de enteros donde el primer elemento es la fila y el
     *         segundo es la columna.
     */
    public int[] play(boolean playerTryAgain) {
        int row = -1;
        int column = -1;
        boolean validInput = false;

        while (!validInput) {
            if (!playerTryAgain) {
                System.out.println("Turno : " + this.id);
            }
            System.out.print(playerTryAgain ? "Intenta de nuevo: " : "Selecciona una posición para tu ficha: ");
            String response = this.scanner.nextLine();

            String[] parts = response.split(" ");
            if (parts.length == 2) {
                try {
                    row = Integer.parseInt(parts[0]);
                    column = Integer.parseInt(parts[1]);
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor, ingresa números válidos.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, ingresa dos números separados por un espacio.");
            }
        }

        return new int[] { row, column };
    }

    /**
     * Cierra el escáner utilizado para leer la entrada del jugador.
     */
    public void closeScanner() {
        this.scanner.close();
    }

    // Getters and Setters
    public char getId() {
        return id;
    }

    public void setId(char id) {
        this.id = id;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
