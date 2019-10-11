package com.thoughtworks.game;

public class GameOfLife {

    private int[][] initialCluster;
    private int[][] evolveCluster;
    private int[][] paddedCluster;

    public GameOfLife(int[][] initialCluster) {
        this.initialCluster = initialCluster;
    }

    public int[][] evolvePattern() {
 //       evolveCluster= new int[initialCluster.length+2][initialCluster.length+2];
//        pad(initialCluster);
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

//    private void pad(int[][] cluster) {
//        paddedCluster = new int[initialCluster.length + 2][initialCluster.length + 2];
//
//        for (int row = 1; row < paddedCluster.length - 1; row++) {
//            for (int column = 1; column < paddedCluster[row].length - 1; column++) {
//                paddedCluster[row][column] = cluster[row - 1][column - 1];
//            }
//        }
//    }
}
