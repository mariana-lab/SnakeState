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

        this.grid = new Grid(100, 100);
        this.snake = new Snake(new Rectangle(Field.getPadding(), Field.getPadding(), Field.getCellSize(), Field.getCellSize()),
                Color.BLACK, new Position(0, 0));

        this.snakeHandler = new SnakeKeyboardHandler(this.snake);
        this.manager = new KeyboardManager(snakeHandler);
        this.x = 0;

    }

    public void init() {

    }

    public void start() throws InterruptedException {

        while (true) {

            if (x != 60)
                x++;
            this.snake.pollDirection();
            this.snake.move();
            this.snake.draw();

            Thread.sleep(100 - x);

        }

    }
}
