package model;

import DrawComponents.DrawUtils;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Spark {

    private int temperature;
    private Color color;
    private int x, y, x0, y0;
    private final Color RED_FIRE_COLOR = new Color(248, 2, 2,50);
    private final Color INTERMEDIATE_FIRE_COLOR = new Color(241, 52, 11,50);
    private final Color ORANGE_FIRE_COLOR = new Color(238, 70, 10,50);
    private final Color YELLOW_FIRE_COLOR = new Color(255, 145, 2,50);
    private final Color BLACK_FIRE_COLOR = new Color(0, 0, 0);

    public Spark(int temperature, int x, int y) {
        this.temperature = temperature;
        x0 = x;
        y0 = y;
        this.x = x;
        this.y = y;
        updateColor();
    }

    public void draw(Graphics2D g){
        DrawUtils.drawSpark(g, color, x, y);
    }

    public void updateColor() {
        if(temperature >= 400 && temperature <= 600){
            color = RED_FIRE_COLOR;
        }
        if(temperature > 600 && temperature <= 800){
            color = INTERMEDIATE_FIRE_COLOR;
        }
        if(temperature > 800 && temperature <= 1000){
            color = ORANGE_FIRE_COLOR;
        }
        if(temperature > 1000 && temperature <= 1200){
            color = YELLOW_FIRE_COLOR;
        }
        if(temperature < 400){
            color = BLACK_FIRE_COLOR;
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        updateColor();
    }

    public int getTemperature() {
        return temperature;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX0() {
        return x0;
    }

    public int getY0() {
        return y0;
    }
}
