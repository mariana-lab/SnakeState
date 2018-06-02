package org.academiadecodigo.snake.grid;

public class Grid {


    private int cols;
    private int rows;

    public Grid(int cols , int rows){

        this.cols = cols;
        this.rows = rows;

    }

    public int getRows(){
        return this.rows;
    }

    public int getCols(){
        return this.cols;
    }


}
