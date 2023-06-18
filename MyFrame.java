import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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
        timeLabel.setFont(new Font("Arial",Font.PLAIN,50));
        timeLabel.setForeground(new Color(0x13E313));
        timeLabel.setBackground(Color.BLACK);
        timeLabel.setOpaque(true);
        this.add(timeLabel);
        this.setVisible(true);

        setTime();
    }

    public void setTime(){
        while (true){
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);
        }
    }
}
