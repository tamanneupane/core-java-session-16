package learninterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Worker implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("action performed");
    }
}
