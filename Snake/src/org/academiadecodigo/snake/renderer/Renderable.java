package org.academiadecodigo.snake.renderer;

import org.academiadecodigo.snake.objects.Drawable;

public interface Renderable {

    void draw(Drawable[] drawables);

    void clear();

}
