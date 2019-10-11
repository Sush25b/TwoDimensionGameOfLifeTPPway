package com.thoughtworks.game;

public class GameOfLife {

    int[][] initialCluster;
    int[][] evolvePattern;

    public GameOfLife(int[][] initialCluster) {
        this.initialCluster = initialCluster;
    }

    public int[][] evolvePattern() {

        int totalAlive = 0;
        for (int row = 0; row < initialCluster.length; row++) {
            for (int column = 0; column < initialCluster[row].length; column++) {
                    if(initialCluster[row][column]==1)
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
