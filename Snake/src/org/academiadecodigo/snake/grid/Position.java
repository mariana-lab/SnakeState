package org.academiadecodigo.snake.grid;


import org.academiadecodigo.snake.objects.snake.Direction;

public class Position {
    private int row;
    private int col;


    public Position(int col, int row) {

        this.col = col;
        this.row = row;

    }



    public void setPosition(int col, int row) {
        this.col = col;
        this.row = row;
    }


    public boolean compare(Position pos){
        return(this.col == pos.getCol()&& this.row == pos.getRow() );
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
