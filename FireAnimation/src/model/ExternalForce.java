package model;

import math.Vector2;

public class ExternalForce {
    private Vector2 position;
    private double value;
    
    public ExternalForce(Vector2 position) {
        this.position = position;
        value = 0;
    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Vector2 getForceAt(Vector2 p) {
        if (Math.abs(value) < 1e-12)
            return new Vector2(0, 0);
        return position.add(p.mul(-1)).normolized().mul(value);
    }
}
