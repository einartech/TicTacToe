package com.tictactoe;

public class Board {

    int row;
    int column;
    char[][] position;

    public Board(int row, int column) {
        this.row = row;
        this.column = column;
        this.position = new char[this.row][this.column];
    }

    public void printBoard() {
        for (int rowIndex = 0; rowIndex < this.position.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < this.position[rowIndex].length; columnIndex++) {
                if (this.position[rowIndex][columnIndex] == '\0') {
                    if (columnIndex == 0) {
                        System.out.print("\t_");
                    } else {
                        System.out.print(" _");
                    }
                } else {
                    if (columnIndex == 0) {
                        System.out.print("\t" + this.position[rowIndex][columnIndex]);
                    } else {
                        System.out.print(" " + this.position[rowIndex][columnIndex]);
                    }
                }
            }
            System.out.println();
        }

    }

    public void editBoard(int row, int column, char value) {
        if (row >= 0 && row < this.row && column >= 0 && column < this.column) {
            this.position[row][column] = value;
        } else {
            System.out.print("\n\n\n");
            System.err.println("Has insertado como numero de fila: " + row + " y columna: " + column + ".  "
                    + "Por favor, ingresa un número de fila y columna válidos. El máximo número de fila es: "
                    + this.row + " mientras que el máximo número de columna es: " + this.column
                    + " El minimo de ambos es 0.");
        }
    }
}
