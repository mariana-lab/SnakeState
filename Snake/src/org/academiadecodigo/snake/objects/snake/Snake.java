package org.academiadecodigo.snake.objects.snake;

import org.academiadecodigo.snake.grid.Position;
import org.academiadecodigo.snake.objects.Collidable;
import org.academiadecodigo.snake.objects.GameObject;

public class Snake extends GameObject {

    @Override
    public void draw() {

    }

    @Override
    public void delete() {

    }

    @Override
    public boolean hasCollided(Collidable collidable) {
        return false;
    }

    @Override
    public int getCol() {
        return 0;
    }

    @Override
    public int getRow() {
        return 0;
    }
}
