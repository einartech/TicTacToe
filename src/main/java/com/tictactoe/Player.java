package com.tictactoe;

import java.util.Scanner;

public class Player {
    char id;
    Scanner scanner;

    public Player(char id) {
        this.id = id;
        this.scanner = new Scanner(System.in);
    }

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

        int[] play = { row, column };
        return play;
    }

    public void closeScanner() {
        this.scanner.close();
    }
}
