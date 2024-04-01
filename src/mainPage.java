import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class mainPage implements ActionListener{
	
	mainPage(){
// -------------------------------------------------------- MY FRAME ---------------------------------------------------
		JFrame frame = new JFrame();
		
		ImageIcon loginIcon = new ImageIcon("mainPage.png");
		ImageIcon icon = new ImageIcon("parkingSystemLogo.png");
		
		JLabel loginPage = new JLabel();
		loginPage.setIcon(loginIcon);
		loginPage.setBounds(0, 0, 900, 600);
		
		JTextField userT = new JTextField();
		userT.setBounds(235, 53, 120, 25);
		JLabel userL = new JLabel();
		userL.setText("Name: ");
		userL.setFont(new Font("Comic Sans", Font.BOLD, 15));
		userL.setBounds(180, 40, 70, 50);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Vehicle Parking System");
		frame.setSize(900, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setIconImage(icon.getImage());
		
		frame.add(userL);
		frame.add(loginPage);
		frame.add(userT);
		
		//----------------------------------------------------------------------------------------------------------------
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
