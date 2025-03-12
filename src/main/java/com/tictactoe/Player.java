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
        System.out.println("Turno : " + this.id);
        System.out.println("Selecciona una fila y una columna (separadas por un espacio):");
        String response = this.scanner.nextLine();

        String[] parts = response.split(" ");
        int row = Integer.parseInt(parts[0]);
        int column = Integer.parseInt(parts[1]);


        int[] play = {row, column};
        
        return play; 
    }

    public void closeScanner() {
        this.scanner.close();
    }
}
