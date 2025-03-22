package pojava;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstFrame extends JFrame implements ActionListener {

	public FirstFrame() throws HeadlessException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setLayout(new BorderLayout());
	}
	public void actionPerformed(ActionEvent e) {}
	public static void main(String[] args) {
		FirstFrame frame = new FirstFrame();
		frame.setVisible(true);

	}
	
}
