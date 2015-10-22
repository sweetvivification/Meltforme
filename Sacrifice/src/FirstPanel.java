import javax.swing.JFrame;
import javax.swing.*;

public class FirstPanel extends JPanel {
@Override public void paintComponent(java.awt.Graphics g){
	g.fillRect(30, 50, 120, 150);
}
	public static void main(String[] args) {
		JFrame f = new JFrame("Rectangle!");
		f.add(new FirstPanel());
		f.setVisible(true);
	}
}
