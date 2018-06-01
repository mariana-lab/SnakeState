package org.academiadecodigo.snake.objects;

import org.academiadecodigo.snake.grid.Position;

public interface Collidable {
    boolean hasCollided(Collidable collidable);

    int getCol();
    int getRow();



}
