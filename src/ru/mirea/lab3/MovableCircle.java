package ru.mirea.lab3;

public class MovableCircle implements Movable {

    private int radius;
    private MovablePoint center;

    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }


    public void moveUp() {
        System.out.println("Move up");
    }
    public void moveDown() {
        System.out.println("Move down");
    }

    public void moveLeft() {
        System.out.println("Move left");
    }

    public void moveRight() {
        System.out.println("Move right");
    }

    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
