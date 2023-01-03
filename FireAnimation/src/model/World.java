package model;

import math.Vector2;
import utils.ScreenConverter;

import java.awt.*;
import java.util.Random;

public class World {
    Random rnd = new Random();
    private Fire fire;
    private ExternalForce externalForce;

    public World() {
        fire = new Fire();
        fire.generateFire(800, 600);
    }

    public void update(double dt) {
        fire.updateFire();
    }

    public void draw(Graphics2D g, ScreenConverter sc) {
        fire.draw(g);
    }

    public ExternalForce getExternalForce() {
        return externalForce;
    }

    public Fire getFire() {
        return fire;
    }
}

