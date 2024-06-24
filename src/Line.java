public class Line {
    // поля начала и конца линии
    private Point start;
    private Point end;

    // конструктор: сохраняем новые точки, чтобы исходные не менять
    public Line(Point start, Point end) {
        this.start = new Point(start.x, start.y);
        this.end = new Point(end.x, end.y);
    }

    // методы для обновления исходных значений
    public void updateStart(int x, int y) {
        start.update(x, y);
    }

    public void updateEnd(int x, int y) {
        end.update(x, y);
    }

    @Override
    public String toString() {
        return "Линия от " + start + " до " + end + " с расстоянием " + Utils.calculateDistance(start, end);
    }
}
