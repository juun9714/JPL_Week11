import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class GUI implements ActionListener{
	
	JTextField id_txt;
	JTextField pass_txt;
	JLabel id_label;
	JLabel pass_label;
	
	public GUI() {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		f.setSize(270,150);
		f.setTitle("Login");
		f.getContentPane().setLayout(null);
		
		
		id_label = new JLabel("ID");
		id_label.setBounds(10,10,80,25);
		f.getContentPane().add(id_label);
		
		pass_label = new JLabel("Password");
		pass_label.setBounds(10,40,80,25);
		f.getContentPane().add(pass_label);
		
		
		id_txt = new JTextField(20);
		id_txt.setBounds(100,10,160,25);
		f.getContentPane().add(id_txt);
		
		pass_txt = new JTextField(20);
		pass_txt.setBounds(100,40,160,25);
		f.getContentPane().add(pass_txt);
		
		JButton button = new JButton("Login");
		button.addActionListener(this);
		button.setBounds(10, 80, 250, 25);
		f.getContentPane().add(button);
		
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String id = id_txt.getText();
		String password = pass_txt.getText();
		
		if(id.equals("SKKU") && password.equals("12345678")) {
			JOptionPane.showMessageDialog(null, "Login Success");
		}else {
			JOptionPane.showMessageDialog(null, "Login Failed");
		}
	}
}
	
public class week11 {
	public static void main(String[] args) {
		GUI gui = new GUI();
	}
}
