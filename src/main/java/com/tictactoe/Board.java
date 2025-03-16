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
                if (columnIndex > 0) {
                    System.out.print(" | ");
                }
                if (this.position[rowIndex][columnIndex] == '\0') {
                    System.out.print(" ");
                } else {
                    System.out.print(this.position[rowIndex][columnIndex]);
                }
            }
            System.out.println();
            if (rowIndex < this.position.length - 1) {
                System.out.println("---------");
            }
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
            if (this.position[row][column] != '\0') {
                System.out.print("\n\n\n");
                System.err.println("La posición seleccionada ya está ocupada. Por favor, selecciona otra posición.");
            } else {
                this.position[row][column] = value;
                System.out
                        .println("Has insertado el valor: " + value + " en la fila: " + row + " y columna: " + column);
            }
        } else {
            System.out.print("\n\n\n");
            System.err.println("Posición inválida. Fila: " + row + ", Columna: " + column + ". "
                    + "Por favor, ingresa una fila y columna válidas. El máximo número de fila es: "
                    + (this.row - 1) + " y el máximo número de columna es: " + (this.column - 1) + ". "
                    + "El mínimo de ambos es 0.");
        }
    }

    /**
     * Verifica si el jugador ha ganado.
     *
     * @param idPlayer Identificador del jugador.
     * @return true si el jugador ha ganado, false en caso contrario.
     */
    public boolean checkVictory(char idPlayer) {
        // Verificar filas
        for (int rowIndex = 0; rowIndex < this.position.length; rowIndex++) {
            if (this.position[rowIndex][0] == idPlayer && this.position[rowIndex][1] == idPlayer
                    && this.position[rowIndex][2] == idPlayer) {
                return true;
            }
        }

        // Verificar columnas
        for (int columnIndex = 0; columnIndex < this.column; columnIndex++) {
            if (this.position[0][columnIndex] == idPlayer && this.position[1][columnIndex] == idPlayer
                    && this.position[2][columnIndex] == idPlayer) {
                return true;
            }
        }

        // Verificar diagonal principal
        if (this.position[0][0] == idPlayer && this.position[1][1] == idPlayer && this.position[2][2] == idPlayer) {
            return true;
        }

        // Verificar diagonal secundaria
        if (this.position[0][2] == idPlayer && this.position[1][1] == idPlayer && this.position[2][0] == idPlayer) {
            return true;
        }

        return false;
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

    /**
     * Verifica si el tablero está lleno.
     *
     * @return true si el tablero está lleno, false en caso contrario.
     */
    public boolean fullBoard() {
        for (int rowIndex = 0; rowIndex < this.position.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < this.position[rowIndex].length; columnIndex++) {
                if (this.position[rowIndex][columnIndex] == '\0') {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Verifica si los dos jugadores tienen el mismo identificador.
     *
     * @param idPlayer1 Identificador del primer jugador.
     * @param idPlayer2 Identificador del segundo jugador.
     * @return true si los identificadores son iguales, false en caso contrario.
     */
    public boolean isPlayerEqual(char idPlayer1, char idPlayer2) {
        return idPlayer1 == idPlayer2;
    }

    /**
     * Verifica si una posición tiene un valor.
     *
     * @param row    Fila a verificar.
     * @param column Columna a verificar.
     * @return true si la posición tiene un valor, false en caso contrario.
     */
    public boolean hasValue(int row, int column) {
        return this.position[row][column] != '\0';
    }

    // Getters and Setters
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public char[][] getPosition() {
        return position;
    }

    public void setPosition(char[][] position) {
        this.position = position;
    }
}
