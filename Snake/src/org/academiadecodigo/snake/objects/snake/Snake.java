package org.academiadecodigo.snake.objects.snake;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Shape;
import org.academiadecodigo.snake.field.Field;
import org.academiadecodigo.snake.grid.Position;
import org.academiadecodigo.snake.objects.Collidable;
import org.academiadecodigo.snake.objects.Eatable;
import org.academiadecodigo.snake.objects.GameObject;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Snake extends GameObject {

    private List<SnakeBodyPart> snakeBody;
    private Direction headDirection;
    private Queue<Direction> directionQueue;
    private SnakeBodyPart head;

    public Snake(Shape shape, Color color, Position pos) {

        this.snakeBody = new LinkedList<>();
        this.headDirection = Direction.EAST;
        this.directionQueue = new PriorityQueue<>();

        this.head = new Head(shape, color, pos);
        this.head.setDirection(headDirection);
        this.snakeBody.add(head);

    }

    public void move() {
        //check direction of head and move it
        //move of every body to the next pos

        Direction dir = this.head.getDirection();

        for (SnakeBodyPart part : snakeBody) {
            if (!(part instanceof Head)) {
                part.setDirection(dir);
                this.moveToDirection(part);
            }
        }

        this.moveToDirection(head);

    }

    public void setHeadDirection(Direction direction) {

        this.headDirection = direction;
    }

    public void pollDirection() {

        if (!this.directionQueue.isEmpty()) {
            this.head.setDirection(this.directionQueue.poll());
        }

    }

    public void addToQueueDirection(Direction direction) {
        this.directionQueue.add(direction);
    }

    public void moveToDirection(SnakeBodyPart part) {

        switch (part.getDirection()) {
            case NORTH:
                part.move(0, -1);
                break;
            case WEST:
                part.move(-1, 0);
                break;
            case EAST:
                part.move(1, 0);
                break;
            case SOUTH:
                part.move(0, 1);
                break;
        }

    }

    public void consume(Eatable eatable){
        //adds the effect of an eatable
    }

    public void grow(){
        //the snake grows plus 1 size
    }

    @Override
    public void draw() {

        for (SnakeBodyPart part : snakeBody) {
            part.draw();
        }

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
