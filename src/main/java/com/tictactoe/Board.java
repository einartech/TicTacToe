package com.tictactoe;

public class Board {

    private int row;
    private int column;
    private char[][] position;

    /**
     * Constructor para inicializar el tablero con el número de filas y columnas
     * especificado.
     *
     * @param row    Número de filas del tablero.
     * @param column Número de columnas del tablero.
     */
    public Board(int row, int column) {
        this.row = row;
        this.column = column;
        this.position = new char[this.row][this.column];
    }

    /**
     * Imprime el estado actual del tablero en la consola.
     */
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

    /**
     * Edita el tablero en la posición especificada con el valor dado.
     *
     * @param row    Fila en la que se desea colocar el valor.
     * @param column Columna en la que se desea colocar el valor.
     * @param value  Valor que se desea colocar en la posición especificada.
     */
    public void editBoard(int row, int column, char value) {
        if (isValidPosition(row, column)) {
         
            if (this.position[row][column] == '\0'){//como el codigo esta comentado , estoy garantizando que se muestre el mensaje si está vacio
                this.position[row][column] = value;
                System.out
                        .println("Has insertado el valor: " + value + " en la fila: " + row + " y columna: " + column);
            }
        } else {
            // System.out.print("\n\n\n");
            System.err.println("Posición inválida. Fila: " + row + ", Columna: " + column + ". "
                    + "Por favor, ingresa una fila y columna válidas. El máximo número de fila es: "
                    + (this.row - 1) + " y el máximo número de columna es: " + (this.column - 1) + ". "
                    + "El mínimo de ambos es 0.");
        }
    }

    // Verificar si el jugador ha ganado teniendo en cuenta los sigtes casos:
    
    public  boolean checkVictory(char idPlayer) {
        // caso1 Verificar filas
        for (int rowIndex = 0; rowIndex < this.position.length; rowIndex++) {
            if (this.position[rowIndex][0] == idPlayer && this.position[rowIndex][1] == idPlayer && this.position[rowIndex][2] == idPlayer) {
                return true;
            }
        }
        
        // caso2 Verificar columnas
        for (int columnIndex = 0; columnIndex < this.column; columnIndex++) {
            if (this.position[0][columnIndex] == idPlayer && this.position[1][columnIndex] == idPlayer && this.position[2][columnIndex] == idPlayer) {
                return true;
            }
        }
        
        // caso3 Verificar diagonal principal ejemplo: \
        if (this.position[0][0] == idPlayer && this.position[1][1] == idPlayer && this.position[2][2] == idPlayer) {
            return true;
        }
        
        // caso4 Verificar diagonal secundaria ejemplo : /
        if (this.position[0][2] == idPlayer && this.position[1][1] == idPlayer && this.position[2][0] == idPlayer) {
            return true;
        }
        
        return false;  // Si no se cumple ningun caso 
    }

    // Verificar si el tablero está lleno para usarse en la función isPlayerEqual
    private boolean fullBoard() {
        for (int rowIndex = 0; rowIndex < this.position.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < this.position[rowIndex].length; columnIndex++) {
                if (this.position[rowIndex][columnIndex] == '\0') { 
                    return false;
                }
            }
        }
        return true;
    }

    // Verifica  si esta lleno el tablero y nos se encuentra ningun jugador con la victoria
    public  boolean isPlayerEqual(char idPlayer1, char idPlayer2) {
        return fullBoard() && !checkVictory(idPlayer1) && !checkVictory(idPlayer2);
    }


    /**
     * Verifica si la posición especificada es válida dentro del tablero.
     *
     * @param row    Fila a verificar.
     * @param column Columna a verificar.
     * @return true si la posición es válida, false en caso contrario.
     */
    private boolean isValidPosition(int row, int column) {
        return row >= 0 && row < this.row && column >= 0 && column < this.column;
    }

    //funcion para validar si la posicion ya tiene un valor
    public boolean hasValue(int row, int column) {
        if (!this.isValidPosition(row, column)) {//movi este codigo de la linea 55 para que muestre el mensaje de error
            // System.out.print("\n\n\n");
            System.err.println("Posición inválida. Fila: " + row + ", Columna: " + column + ". "
                    + "Por favor, ingresa una fila y columna válidas. El máximo número de fila es: "
                    + (this.row - 1) + " y el máximo número de columna es: " + (this.column - 1) + ". "
                    + "El mínimo de ambos es 0.");
            return true;
        }
        if (this.position[row][column] != '\0') {//movi este codigo de la linea 55 para que muestre el mensaje de error
            // System.out.print("\n\n\n");
            System.err.println("Ese sitio está ocupado");
            return true;
        }
        return false;
    }
}
