class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Метод для обновления координат
    public void update(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    @Override
    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}
