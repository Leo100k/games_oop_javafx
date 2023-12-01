package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BishopBlackTest {

    @Test
    void whenPositionOk() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        bishopBlack.position();
        assertThat(bishopBlack.position()).isEqualTo(Cell.C8);
    }

    @Test
    void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] expSteps = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertArrayEquals(expSteps, bishopBlack.way(Cell.G5));
    }

    @Test
    void whenDiagonalIsTrue() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.isDiagonal(Cell.C1, Cell.G5)).isTrue();
    }

    @Test
    void whenCopyPositionOk() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Figure bishopBlack1 = bishopBlack.copy(Cell.G5);
        assertThat(bishopBlack1.position()).isEqualTo(Cell.G5);
    }

}