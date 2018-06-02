package org.academiadecodigo.snake.objects.snake;

public enum Direction {

    NORTH,
    WEST,
    EAST,
    SOUTH;

    public Direction isOpposite() {

        switch (this) {
            case NORTH:
                return SOUTH;
            case SOUTH:
                return NORTH;
            case EAST:
                return WEST;
            case WEST:
                return EAST;
        }

        return this;
    }
}
