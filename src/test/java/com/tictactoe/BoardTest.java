package com.tictactoe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    /**
     * Verifica que un jugador gana al completar una fila.
     * Este test coloca tres 'X' en la primera fila y verifica que el método
     * checkVictory devuelva true.
     */
    @Test
    public void testCheckVictoryRow() {
        Board board = new Board(3, 3);
        board.editBoard(0, 0, 'X');
        board.editBoard(0, 1, 'X');
        board.editBoard(0, 2, 'X');
        assertTrue(board.checkVictory('X'), "El jugador 'X' debería ganar al completar una fila.");
    }

    /**
     * Verifica que un jugador gana al completar una columna.
     * Este test coloca tres 'O' en la primera columna y verifica que el método
     * checkVictory devuelva true.
     */
    @Test
    public void testCheckVictoryColumn() {
        Board board = new Board(3, 3);
        board.editBoard(0, 0, 'O');
        board.editBoard(1, 0, 'O');
        board.editBoard(2, 0, 'O');
        assertTrue(board.checkVictory('O'), "El jugador 'O' debería ganar al completar una columna.");
    }

    /**
     * Verifica que un jugador gana al completar la diagonal principal.
     * Este test coloca tres 'X' en la diagonal principal y verifica que el método
     * checkVictory devuelva true.
     */
    @Test
    public void testCheckVictoryDiagonalPrincipal() {
        Board board = new Board(3, 3);
        board.editBoard(0, 0, 'X');
        board.editBoard(1, 1, 'X');
        board.editBoard(2, 2, 'X');
        assertTrue(board.checkVictory('X'), "El jugador 'X' debería ganar al completar la diagonal principal.");
    }

    /**
     * Verifica que un jugador gana al completar la diagonal secundaria.
     * Este test coloca tres 'O' en la diagonal secundaria y verifica que el método
     * checkVictory devuelva true.
     */
    @Test
    public void testCheckVictoryDiagonalSecundaria() {
        Board board = new Board(3, 3);
        board.editBoard(0, 2, 'O');
        board.editBoard(1, 1, 'O');
        board.editBoard(2, 0, 'O');
        assertTrue(board.checkVictory('O'), "El jugador 'O' debería ganar al completar la diagonal secundaria.");
    }

    /**
     * Verifica que no hay un ganador cuando el tablero está lleno pero no hay tres
     * en línea.
     * Este test llena el tablero sin que ningún jugador complete tres en línea y
     * verifica que el método checkVictory devuelva false para ambos jugadores.
     */
    @Test
    public void testNoVictory() {
        Board board = new Board(3, 3);
        board.editBoard(0, 0, 'X');
        board.editBoard(0, 1, 'O');
        board.editBoard(0, 2, 'X');
        board.editBoard(1, 0, 'O');
        board.editBoard(1, 1, 'X');
        board.editBoard(1, 2, 'O');
        board.editBoard(2, 0, 'O');
        board.editBoard(2, 1, 'X');
        board.editBoard(2, 2, 'O');
        assertFalse(board.checkVictory('X'),
                "No debería haber un ganador cuando el tablero está lleno pero no hay tres en línea para 'X'.");
        assertFalse(board.checkVictory('O'),
                "No debería haber un ganador cuando el tablero está lleno pero no hay tres en línea para 'O'.");
    }
}
