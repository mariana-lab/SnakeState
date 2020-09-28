package org.academiadecodigo.snake.objects.snake;

import org.academiadecodigo.simplegraphics.graphics.Shape;
import org.academiadecodigo.snake.grid.Position;
import org.academiadecodigo.snake.objects.Collidable;
import org.academiadecodigo.snake.objects.Drawable;

public interface SnakeBodyPart extends Drawable , Collidable{


    void move(Position pos);

    void move(int nextPosX, int nextPosY);

    Position getPos();

    Shape getShape();

    Direction getDirection();

    void setDirection( Direction direction);
}
