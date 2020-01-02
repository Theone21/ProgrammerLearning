package com.jlj;

public class MiGong {

    private static int endRow = 6;
    private static int endCol = 6;

    public static void main(String... args){
        int[][] migong = new int[8][8];
        for(int i = 0; i < 8; i++){
            migong[0][i] = 1;
            migong[i][0] = 1;
            migong[i][7] = 1;
            migong[7][i] = 1;
        }

        migong[3][1] = 1;
        migong[3][2] = 1;
        migong[2][2] = 1;
//        migong[1][2] = 1;             // 将路堵死了，出不去！
        printMiGong(migong);
        System.out.println("---------------------------------------------");
        goHome(migong,1, 1);
        printMiGong(migong);
    }

    private static void goHome(int[][] migong, int row, int col){
        if(row == endRow && col == endCol) {
            migong[endRow][endCol] = 2;
            return;
        }
        migong[row][col] = 2;
        if (row < 6 && migong[row+1][col] == 0 && migong[endRow][endCol] != 2){
            goHome(migong, row+1, col);
        }
        if(col < 6 && migong[row][col+1] == 0 && migong[endRow][endCol] != 2){
            goHome(migong, row, col+1);
        }
    }

    private static void printMiGong(int[][] migong){
        for(int i = 0; i < migong.length; i++){
            for(int j = 0; j < migong[i].length; j++){
                System.out.print(migong[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
