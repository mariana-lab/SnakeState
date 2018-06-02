package org.academiadecodigo.snake.field;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.snake.grid.Grid;
import org.academiadecodigo.snake.objects.Drawable;

public class Field implements Drawable {

    private Grid grid;
    private static final int CELL_SIZE = 10;
    private static final int PADDING = 10;
    private Rectangle canvas;


    public Field(Grid grid) {
        this.grid = grid;
        this.canvas = new Rectangle(PADDING, PADDING, this.getWidth(), this.getHeight());
    }

    public int getX(int col) {
        return col * CELL_SIZE + PADDING;
    }

    public int getY(int row) {
        return row * CELL_SIZE + PADDING;
    }

    public static int getCellSize() {
        return CELL_SIZE;
    }

    public static int getPadding() {
        return PADDING;
    }

    public int getWidth() {
        return this.grid.getCols() * CELL_SIZE + PADDING;
    }

    public int getHeight() {
        return this.grid.getRows() * CELL_SIZE + PADDING;
    }

    @Override
    public void draw() {

        this.canvas.draw();
    }

    @Override
    public void delete() {

        this.canvas.delete();

    }
}
