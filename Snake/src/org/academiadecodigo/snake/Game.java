package org.academiadecodigo.snake;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.snake.field.Field;
import org.academiadecodigo.snake.grid.Grid;
import org.academiadecodigo.snake.grid.Position;
import org.academiadecodigo.snake.keyboard.KeyboardManager;
import org.academiadecodigo.snake.keyboard.SnakeKeyboardHandler;
import org.academiadecodigo.snake.objects.Apple;
import org.academiadecodigo.snake.objects.Drawable;
import org.academiadecodigo.snake.objects.Score;
import org.academiadecodigo.snake.objects.snake.Snake;

public class Game {

    private Grid grid;
    private Snake snake;
    private Apple apple;
    private Score score;
    private Drawable[] drawables;
    private KeyboardHandler snakeHandler;
    private KeyboardManager manager;
    private int x;


    public Game() {

        this.grid = new Grid(20, 20);
        this.snake = new Snake(new Rectangle(Field.getPadding(), Field.getPadding(), Field.getCellSize(), Field.getCellSize()),
                Color.BLACK, grid, new Position(0, 0));

        this.snakeHandler = new SnakeKeyboardHandler(this.snake);
        this.manager = new KeyboardManager(snakeHandler);
        this.apple = new Apple(this.grid, this.snake);
    }

    public void init() {

    }

    public void start() throws InterruptedException {

        while (true) {

            Thread.sleep(150);


            this.snake.pollDirection();
            this.snake.move();

            checkCollision();

            if (checkHasEaten()) {
                System.out.println("comeu");
                this.apple.locate(this.grid, this.snake);
            }

            System.out.println("APPLE " + this.apple.getCol() + " " + this.apple .getRow());
            System.out.println("SNAKE " + this.snake.getCol() + " " + this.snake.getRow());

            this.apple.draw();
            this.snake.draw();

        }

    }

    private void checkCollision() {
        if (this.snake.hasCollided()) {

        }


    }

    private boolean checkHasEaten() {
        //criar eatable object
        //passar como argumento
        //chamar haseaten da snake

        return this.snake.hasEaten(this.apple);


    }
}
