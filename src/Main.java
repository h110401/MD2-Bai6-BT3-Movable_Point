public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point.toString());

        MovablePoint movable = new MovablePoint(1, 1);

        movable.setXY(2, 3);
        movable.setSpeed(1, 1);

        System.out.println(movable.toString());

        movable.move();

        System.out.println(movable.toString());

    }
}