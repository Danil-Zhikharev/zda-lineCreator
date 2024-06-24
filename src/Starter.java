public class Starter {

    public static void main(String[] args) {
        // точки для первой линии
        Point p1 = new Point(1, 7);
        Point p2 = new Point(23, 8);

        // точки для второй линии
        Point p3 = new Point(5, 10);
        Point p4 = new Point(27, 11);

        // сохраняем исходные точки для третьей линии
        Point p5 = new Point(p1.x, p1.y);
        Point p6 = new Point(p4.x, p4.y);

        // Создаем экземпляр класса, реализующего LineCreator через лямбда-выражение
        Utils.LineCreator lineCreator = (start, end) -> new Line(start, end);

        // вывод линий
        System.out.println(Utils.newLine(p1, p2, lineCreator));
        System.out.println(Utils.newLine(p3, p4, lineCreator));
        System.out.println(Utils.newLine(p1, p4, lineCreator));

        // вывод линии 4-мя параметрами на входе
        System.out.println(Utils.newLine(5, 6, 7, 8, lineCreator));

        // Обновление координат точек первой линии
        Line newFirstLinePoints = new Line(p1, p2);
        newFirstLinePoints.updateStart(2, 2);
        newFirstLinePoints.updateEnd(12, 12);

        // вывод линий после обновления 1-й и 2-й линий
        System.out.println(newFirstLinePoints);
        System.out.println(Utils.newLine(p3, p4, lineCreator));
        System.out.println(Utils.newLine(p5, p6, lineCreator));
    }
}
