package ooplab.interfacedemo;

interface Resizable {
    void resizeWidth(int width);

    void resizeHeight(int height);
}

class Rectangle1 implements Resizable {
    private int width;
    private int height;

    public Rectangle1(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void resizeWidth(int width) {
        this.width = width;
    }

    public void resizeHeight(int height) {
        this.height = height;
    }

    public void printSize() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}
class M5 {
    public static void main(String[] args) {
        Rectangle1 rectangle = new Rectangle1(100, 150);

        rectangle.printSize();

        rectangle.resizeWidth(150);
        rectangle.resizeHeight(200);

        rectangle.printSize();
    }
}