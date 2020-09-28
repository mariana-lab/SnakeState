package org.academiadecodigo.snake;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.snake.grid.Grid;
import org.academiadecodigo.snake.keyboard.KeyboardManager;
import org.academiadecodigo.snake.keyboard.SnakeKeyboardHandler;
import org.academiadecodigo.snake.objects.Drawable;
import org.academiadecodigo.snake.objects.Score;
import org.academiadecodigo.snake.objects.snake.Snake;

public class Game {

    private Grid grid;
    private Snake snake;
    private Score score;
    private Drawable[] drawables;
    private KeyboardHandler snakeHandler;
    private KeyboardManager manager;
    private int x;


    public Game() {

        this.grid = new Grid(10, 10);
        this.snake = new Snake(grid);

        this.snakeHandler = new SnakeKeyboardHandler(this.snake);
        this.manager = new KeyboardManager(snakeHandler);

    }


    public void init() {

    }

    public void start() throws InterruptedException {

        while (true) {

            Thread.sleep(300);


            this.snake.pollDirection();
            this.snake.move();

            checkCollision();

            System.out.println("SNAKE " + this.snake.getCol() + " " + this.snake.getRow());

            this.snake.draw();

        }

    }

    private void checkCollision() {
        if (this.snake.hasCollided()) {

        }


    }

}
