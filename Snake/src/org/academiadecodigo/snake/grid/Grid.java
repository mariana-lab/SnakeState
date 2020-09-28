package org.academiadecodigo.snake.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.snake.objects.Drawable;

public class Grid {

    private static final int CELL_SIZE = 40;
    private static final int PADDING = 10;

    private int cols;
    private int rows;

    private Drawable[][] grid;
    private Rectangle canvas;

    public Grid(int cols , int rows){

        this.cols = cols;
        this.rows = rows;
        grid = new Drawable[cols][rows];
        grid = createObjects();
        this.canvas = new Rectangle(PADDING, PADDING, this.getWidth(), this.getHeight());
        this.canvas.draw();
        

    }


    private Drawable[][] createObjects(){
        Drawable[][] newGrid = new Drawable[cols][rows];
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                newGrid[col][row] = new Cell(col,row);
            }
        }
        return newGrid;
    }
    
    public int getRows(){
        return this.rows;
    }

    public int getCols(){
        return this.cols;
    }

    public static int getX(int col) {
        return col * CELL_SIZE + PADDING;
    }

    public static int getY(int row) {
        return row * CELL_SIZE + PADDING;
    }

    public static int getCellSize() {
        return CELL_SIZE;
    }

    public static int getPadding() {
        return PADDING;
    }

    public int getWidth() {
        return cols * CELL_SIZE;
    }

    public int getHeight() {
        return rows * CELL_SIZE;
    }


    public void draw() {
        this.canvas.setColor(Color.WHITE);
        this.canvas.draw();
    }


    public void delete() {

        this.canvas.delete();

    }
}
