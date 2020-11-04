package ru.mirea.lab3;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x1, y1, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
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

}
