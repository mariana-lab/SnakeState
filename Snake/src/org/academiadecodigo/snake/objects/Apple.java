package org.academiadecodigo.snake.objects;

import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.snake.grid.Grid;

public class Apple implements Drawable {

    private final Grid grid;
    private int col;
    private int row;
    private Ellipse ellipse;

    public Apple(Grid grid){
        this.grid = grid;
        setColRow();
        this.ellipse= new Ellipse(Grid.getX(col), Grid.getY(row),Grid.getCellSize(),Grid.getCellSize());

    }

    private void setColRow() {
        col = Math.round((float) Math.random() * grid.getCols());
        row = Math.round((float) Math.random() * grid.getRows());
    }

    @Override
    public void draw() {
        this.ellipse.delete();
        this.ellipse= new Ellipse(Grid.getX(col), Grid.getY(row),Grid.getCellSize(),Grid.getCellSize());
        this.ellipse.draw();

    }

    @Override
    public void delete() {
        this.ellipse.delete();
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
