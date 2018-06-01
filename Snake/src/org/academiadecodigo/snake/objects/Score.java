package org.academiadecodigo.snake.objects;

import org.academiadecodigo.snake.grid.Position;

public class Score extends GameObject implements Drawable {

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
