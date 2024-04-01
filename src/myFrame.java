import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class myFrame extends JFrame implements ActionListener {
	JButton loginButton;
	
	myFrame(){
		ImageIcon loginIcon = new ImageIcon("loginPagee.png");
		ImageIcon icon = new ImageIcon("parkingSystemLogo.png");
		
		JLabel loginPage = new JLabel();
		loginPage.setIcon(loginIcon);
		loginPage.setBounds(0, 0, 900, 600);
		
		loginButton = new JButton();
		loginButton.addActionListener(this);
		loginButton.setBounds(190, 500, 120, 50);
		loginButton.setText("CLICK HERE");
		loginButton.setFont(new Font("Comic Sans", Font.BOLD, 12));
		loginButton.setBackground(new Color(255, 189, 89));

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Vehicle Parking System");
		this.setSize(516, 600);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(null);
		this.setIconImage(icon.getImage());
		this.add(loginButton);
		this.add(loginPage);
	}
	
class mainPage{
	JFrame frame = new JFrame();
	mainPage(){
		ImageIcon icon = new ImageIcon("parkingSystemLogo.png");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Vehicle Parking System");
		frame.setIconImage(icon.getImage());
		frame.setSize(900, 600);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
	}
}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == loginButton) {
			this.dispose();
			new loadingScreen();
		}
	}
}
