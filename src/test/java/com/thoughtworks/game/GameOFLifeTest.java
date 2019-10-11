package com.thoughtworks.game;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameOFLifeTest {
    @Test
    public void givenClusterWithAllDead_whenEvolve_thenReturnClusterOFAllDead() {
        int[][] initialCluster = {{0, 0}, {0, 0}};
        GameOfLife gameOfLife = new GameOfLife(initialCluster);

        int[][] evolvedCluster = {{0, 0}, {0, 0}};

        assertArrayEquals(evolvedCluster, gameOfLife.evolvePattern());
    }

    @Test
    public void givenClusterWithTwoAlive_whenEvolve_thenReturnClusterOFAllDead() {
        int[][] initialCluster = {{0, 0}, {1, 1}};
        GameOfLife gameOfLife = new GameOfLife(initialCluster);

        int[][] evolvedCluster = {{0, 0}, {0, 0}};

        assertArrayEquals(evolvedCluster, gameOfLife.evolvePattern());
    }
}
