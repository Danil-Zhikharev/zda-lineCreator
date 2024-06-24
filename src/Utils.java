public class Utils {

    @FunctionalInterface
    public interface LineCreator {
        Line createLine(Point p1, Point p2);
    }

    public static String newLine(Point p1, Point p2, LineCreator lineCreator) {
        return lineCreator.createLine(new Point(p1.x, p1.y), new Point(p2.x, p2.y)).toString();
    }

    public static String newLine(int x, int y, int x2, int y2, LineCreator lineCreator) {
        return lineCreator.createLine(new Point(x, y), new Point(x2, y2)).toString();
    }

    public static int calculateDistance(Point p1, Point p2) {
        return (int) Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }
}
