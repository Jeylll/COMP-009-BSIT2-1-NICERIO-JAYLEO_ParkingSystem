import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;

public class loadingScreen {
	JFrame frame = new JFrame();
	JProgressBar load = new JProgressBar();
	loadingScreen(){
		load.setValue(0);
		load.setBounds(43, 110, 300, 25);
		load.setStringPainted(true);
		
		ImageIcon loadIcon = new ImageIcon("loadingIconn.gif");
		JLabel label = new JLabel();
		label.setIcon(loadIcon);
		label.setBounds(117, -30, 200, 200);
		
		ImageIcon icon = new ImageIcon("parkingSystemLogo.png");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Vehicle Parking System");
		frame.setIconImage(icon.getImage());
		frame.setSize(400, 250);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(label);
		frame.add(load);
		
		//fill();
		new LoadWorker().execute();

	}
	
    private class LoadWorker extends SwingWorker<Void, Integer> {
        @Override
        protected Void doInBackground() throws Exception {
            for (int i = 0; i <= 100; i+=1) {
                Thread.sleep(20);
                publish(i);
            }
            return null;
        }

        @Override
        protected void process(List<Integer> chunks) {
            // Update the progress bar as chunks of progress are made
            for (Integer progress : chunks) {
                load.setValue(progress);
            }
        }

        @Override
        protected void done() {
            frame.dispose();
            new mainPage();
        }
    }

}