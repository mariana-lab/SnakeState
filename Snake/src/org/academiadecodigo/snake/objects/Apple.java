package org.academiadecodigo.snake.objects;

import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.snake.field.Field;
import org.academiadecodigo.snake.grid.Grid;
import org.academiadecodigo.snake.grid.Position;
import org.academiadecodigo.snake.objects.snake.Head;
import org.academiadecodigo.snake.objects.snake.Snake;
import org.academiadecodigo.snake.objects.snake.SnakeBodyPart;

public class Apple extends GameObject implements Eatable {


    private Position pos;
    private AppleType appleType;

    private Ellipse ellipse;

    public Apple(Grid grid, Snake snake){

        this.pos = new Position(0,0);

        this.ellipse = new Ellipse(0, 0, Field.getCellSize(), Field.getCellSize());
        this.locate(grid, snake);

    }


    @Override
    public void draw() {

        this.ellipse.draw();

    }

    @Override
    public void delete() {

    }

    public void switchType() {

        int size = AppleType.values().length;
        this.appleType = AppleType.values()[(int) Math.round(Math.random() * size)];

    }

    public void locate(Grid grid, Snake snake) {
        int col = (int) Math.round(Math.random() * grid.getCols());
        int row = (int) Math.round(Math.random() * grid.getRows());

        for (SnakeBodyPart s : snake) {
            if (col == s.getCol() && row == s.getRow()) {
                locate(grid, snake);
            }
        }

        this.pos.setPosition(col, row);
        this.ellipse.translate(col * Field.getCellSize(), row * Field.getCellSize());
    }


    @Override
    public int getCol() {
        return this.pos.getCol();
    }

    @Override
    public int getRow() {
        return this.pos.getRow();
    }

    @Override
    public void eated() {

    }


}
