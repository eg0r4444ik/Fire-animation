package math;

public class Vector2 {
    private double x, y;

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Vector2 add(Vector2 other) {
        return new Vector2(x + other.x, y + other.y);
    }

    public Vector2 mul(double n) {
        return new Vector2((x * n), y * n);
    }

    public Vector2 normolized() {
        double len = length();
        if (len < 1e-12)
            return new Vector2(0, 0);
        return new Vector2(x / len, y / len);
    }

    public double length() {
        return Math.sqrt(x*x + y*y);
    }

    @Override
    public String toString() {
        return "Vector2{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

