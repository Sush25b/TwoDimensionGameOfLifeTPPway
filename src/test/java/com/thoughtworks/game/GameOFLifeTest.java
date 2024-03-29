package com.thoughtworks.game;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameOFLifeTest {
    @Test
    public void givenClusterWithAllDead_whenEvolve_thenReturnClusterOFAllDead() {    //0 alive     //null //all hard code
        int[][] initialCluster = {{0, 0}, {0, 0}};
        GameOfLife gameOfLife = new GameOfLife(initialCluster);

        int[][] evolvedCluster = {{0, 0}, {0, 0}};

        assertArrayEquals(evolvedCluster, gameOfLife.evolvePattern());
    }

    @Test
    public void givenClusterWithTwoAlive_whenEvolve_thenReturnClusterOFAllDead() {    //2 alive     //hard code
        int[][] initialCluster = {{0, 0}, {1, 1}};
        GameOfLife gameOfLife = new GameOfLife(initialCluster);

        int[][] evolvedCluster = {{0, 0}, {0, 0}};

        assertArrayEquals(evolvedCluster, gameOfLife.evolvePattern());
    }

    @Test
    public void givenClusterWithThreeAlive_whenEvolve_thenReturnClusterOFAllAlive() {   //3 alive   //if condition //hard code
        int[][] initialCluster = {{0, 1}, {1, 1}};
        GameOfLife gameOfLife = new GameOfLife(initialCluster);

        int[][] evolvedCluster = {{1, 1}, {1, 1}};

        assertArrayEquals(evolvedCluster, gameOfLife.evolvePattern());
    }

    @Test
    public void givenClusterWithAllAlive_whenEvolve_thenReturnClusterOFAllAlive() {   //4 alive    //hard code
        int[][] initialCluster = {{1, 1}, {1, 1}};
        GameOfLife gameOfLife = new GameOfLife(initialCluster);

        int[][] evolvedCluster = {{1, 1}, {1, 1}};

        assertArrayEquals(evolvedCluster, gameOfLife.evolvePattern());
    }

//    @Test
//    public void givenClusterWithAllAlive_whenEvolve_thenReturnClusterOFAllDead() {   //3*3    //write code for result
//        int[][] initialCluster = {{1, 1}, {1, 1}, {1, 1}};
//        GameOfLife gameOfLife = new GameOfLife(initialCluster);
//
//        int[][] evolvedCluster = {{1, 1}, {0, 0}, {1, 1}};
//
//        assertArrayEquals(evolvedCluster, gameOfLife.evolvePattern());
//    }
}
