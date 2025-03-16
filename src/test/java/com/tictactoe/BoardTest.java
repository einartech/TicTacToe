package com.tictactoe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    /**
     * Verifica que un jugador gana al completar una fila.
     */
    @Test
    public void testCheckVictoryRow() {
        Board board = new Board(3, 3);
        board.editBoard(0, 0, 'X');
        board.editBoard(0, 1, 'X');
        board.editBoard(0, 2, 'X');
        assertTrue(board.checkVictory('X'));
    }

    /**
     * Verifica que un jugador gana al completar una columna.
     */
    @Test
    public void testCheckVictoryColumn() {
        Board board = new Board(3, 3);
        board.editBoard(0, 0, 'O');
        board.editBoard(1, 0, 'O');
        board.editBoard(2, 0, 'O');
        assertTrue(board.checkVictory('O'));
    }

    /**
     * Verifica que un jugador gana al completar la diagonal principal.
     */
    @Test
    public void testCheckVictoryDiagonalPrincipal() {
        Board board = new Board(3, 3);
        board.editBoard(0, 0, 'X');
        board.editBoard(1, 1, 'X');
        board.editBoard(2, 2, 'X');
        assertTrue(board.checkVictory('X'));
    }

    /**
     * Verifica que un jugador gana al completar la diagonal secundaria.
     */
    @Test
    public void testCheckVictoryDiagonalSecundaria() {
        Board board = new Board(3, 3);
        board.editBoard(0, 2, 'O');
        board.editBoard(1, 1, 'O');
        board.editBoard(2, 0, 'O');
        assertTrue(board.checkVictory('O'));
    }

    /**
     * Verifica que no hay un ganador cuando el tablero está lleno pero no hay tres
     * en línea.
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
        assertFalse(board.checkVictory('X'));
        assertFalse(board.checkVictory('O'));
    }
}
