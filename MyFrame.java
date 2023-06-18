import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;

public class MyFrame extends JFrame {

    SimpleDateFormat timeFormat;
    JLabel timeLabel;
    String time;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Digital Clock in JAVA");
        this.setLayout(new FlowLayout());
        this.setSize(350,500);

        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        timeLabel = new JLabel();
        this.add(timeLabel);
        this.setVisible(true);
    }
}
