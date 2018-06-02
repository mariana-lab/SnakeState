package org.academiadecodigo.snake.keyboard;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.snake.objects.snake.Direction;
import org.academiadecodigo.snake.objects.snake.Snake;

public class SnakeKeyboardHandler implements KeyboardHandler {


    private Snake snake;

    public SnakeKeyboardHandler(Snake snake) {
        this.snake = snake;
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_UP:
                this.snake.addToQueueDirection(Direction.NORTH);

                break;
            case KeyboardEvent.KEY_RIGHT:
                this.snake.addToQueueDirection(Direction.EAST);

                break;
            case KeyboardEvent.KEY_LEFT:
                this.snake.addToQueueDirection(Direction.WEST);

                break;
            case KeyboardEvent.KEY_DOWN:
                this.snake.addToQueueDirection(Direction.SOUTH);

                break;

        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }


}
