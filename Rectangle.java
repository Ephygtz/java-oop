import javax.swing.*;

public class Rectangle {
    public static void main(String[] args) {
        String length, width;
        length = JOptionPane.showInputDialog("Legth");
        width = JOptionPane.showInputDialog("Width");
        double l, w, area;
        l = Double.parseDouble(length);
        w = Double.parseDouble(width);
        area = l * w;
        JOptionPane.showMessageDialog(null, "The are is " + area);
    }
}
