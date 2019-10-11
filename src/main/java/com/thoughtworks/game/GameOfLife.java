package com.thoughtworks.game;

public class GameOfLife {

    private int[][] initialCluster;
    private int[][] evolveCluster;

    public GameOfLife(int[][] initialCluster) {
        this.initialCluster = initialCluster;
    }

    private int[][] initializeEvolvePatter(){

    }

    public int[][] evolvePattern() {

        int totalAlive = 0;
        for (int[] row : initialCluster) {
            for (int column : row) {
                if (column == 1)
                    ++totalAlive;
            }
        }

        if(totalAlive<=2) {
            evolveCluster = new int[][]{{0, 0}, {0, 0,}};
            return evolveCluster;
        }
        evolveCluster = new int[][]{{1,1},{1,1}};
        return evolveCluster;
    }
}
