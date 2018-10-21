package org.academiadecodigo.snake.objects;

import org.academiadecodigo.simplegraphics.graphics.Ellipse;
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

        this.ellipse = new Ellipse(Grid.getX(0), Grid.getY(0), Grid.getCellSize(), Grid.getCellSize());
        this.draw();
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
                return;
            }
        }

        this.ellipse.translate(  (col  - pos.getCol()) * Grid.getCellSize(), (row - pos.getRow()) * Grid.getCellSize() );
        this.pos.setPosition(col, row);
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
