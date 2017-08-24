
package chap12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class tt implements ActionListener{
	JButton button;
	public static void main(String[] args) {
			tt t = new tt();
			t.go();
	}
	
	public void go(){
		JFrame frame = new JFrame();
		button = new JButton("adsfadf");
		frame.getContentPane().add(button);
			frame.setSize(300, 300);
			frame.setVisible(true);
			button.addActionListener(this);
			
			button.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				button.setText(e.getKeyChar()+"");
			}

			@Override
			public void keyPressed(KeyEvent e) {
				button.setText("key pressed");
			}

			@Override
			public void keyReleased(KeyEvent e) {
				button.setText("key released");
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		button.setText("I've been clicked!");
	}
	
 
}
