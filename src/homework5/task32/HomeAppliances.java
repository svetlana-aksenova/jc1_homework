package homework5.task32;

public abstract class HomeAppliances {

    protected double width;

    protected double lenght;

    protected double height;

    public HomeAppliances() {

    }

    public HomeAppliances(double width, double lenght, double height) {
        this.width = width;
        this.lenght = lenght;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getLenght() {
        return lenght;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public abstract void plugIn();

    public abstract void unplug();


}
