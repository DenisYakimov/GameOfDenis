import java.awt.*;

public class Config {
    public static final int SIZE = 20; //  размер одной ячейки;
    public static  final  int WIDTH = 40; // ширина поля;
    public static  final int HEIGHT = 30; // длина поля;
    public static final int SLEEPMS = 500;

    public static Color getColor (Status status) {
        switch (status) {
            default:
            case NONE: return Color.BLACK;
            case BORN: return  Color.GRAY;
            case LIVE: return  Color.blue;
            case DIED: return Color.BLUE;
        }
    }
}
