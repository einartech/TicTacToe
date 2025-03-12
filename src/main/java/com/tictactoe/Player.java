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
     * @return Un arreglo de enteros donde el primer elemento es la fila y el
     *         segundo es la columna.
     */
    public int[] play() {
        int row = -1;
        int column = -1;
        boolean validInput = false;

        while (!validInput) {
            System.out.println("Turno : " + this.id);
            System.out.println("Selecciona una fila y una columna (separadas por un espacio):");
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
     * Devuelve el identificador del jugador.
     *
     * @return El identificador del jugador.
     */
    public char getId() {
        return this.id;
    }

    /**
     * Cierra el escáner utilizado para leer la entrada del jugador.
     */
    public void closeScanner() {
        this.scanner.close();
    }
}
