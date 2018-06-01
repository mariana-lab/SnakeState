package org.academiadecodigo.snake.objects;

public enum AppleType {
    APPLE("", 0 ),
    AVOCADO("", 0 ),
    MUSHROOM("", 0 ),
    LISCIA("", 0 );

    private String picturePath;
    private int points;

    AppleType(String picturePath, int points){
        this.picturePath = picturePath;
        this.points = points;
    }
}
