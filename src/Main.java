import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.setProperty("sun.java2d.uiScale", "1.0");
        System.setProperty("sun.java2d.dpiaware", "false");

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2D WORLD");


        CarGame carGame = new CarGame();
        window.add(carGame);

        window.pack();


        window.setLocationRelativeTo(null);
        window.setVisible(true);

        carGame.startGameThread();

    }
}
