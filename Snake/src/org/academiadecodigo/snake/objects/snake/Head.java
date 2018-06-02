package org.academiadecodigo.snake.objects.snake;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Shape;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.snake.grid.Position;
import org.academiadecodigo.snake.objects.Collidable;
import org.academiadecodigo.snake.objects.GameObject;

public class Head implements SnakeBodyPart {
    private Shape shape;

    private Color color;

    private Picture pic;

    private Position pos;

    private Direction direction;

    public Head(Shape shape, Color color, Position pos) {
        this.shape = shape;
        this.color = color;
        this.pos = pos;
    }

    public Head(Picture pic, Position pos) {

        this.pic = pic;
        this.pos = pos;
    }

    public void move(Position pos) {
        this.pos.setPosition(pos.getCol(), pos.getRow());
    }

    public void move(int nextPosX, int nextPosY) {
        this.pos.setCol(this.pos.getCol() + nextPosX);
        this.pos.setRow(this.pos.getRow() + nextPosY);
    }

    public Position getPos() {
        return this.pos;
    }

    public Shape getShape() {
        return this.shape;
    }

    @Override
    public Direction getDirection() {
        return this.direction;
    }

    @Override
    public void setDirection(Direction direction){
        this.direction = direction;
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

    @Override
    public void draw() {
        this.shape.draw();
    }

    @Override
    public void delete() {

    }
}
