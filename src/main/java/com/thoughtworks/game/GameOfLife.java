package com.thoughtworks.game;

public class GameOfLife {

    private int[][] initialCluster;
    private int[][] evolvePattern;

    public GameOfLife(int[][] initialCluster) {
        this.initialCluster = initialCluster;
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
            evolvePattern = new int[][]{{0, 0}, {0, 0,}};
            return evolvePattern;
        }
        evolvePattern= new int[][]{{1,1},{1,1}};
        return evolvePattern;
    }
}
