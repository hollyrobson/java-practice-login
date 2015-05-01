package login;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI {

	public LoginGUI() {
		
	}
	
	public void createLoginGUI() {
		JFrame loginFrame = new JFrame( "Login Screen" );
		loginFrame.setSize( 300, 150 );
		loginFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		JPanel loginPanel = new JPanel();
		loginFrame.add( loginPanel );
		layoutComponents( loginPanel );
		
		loginFrame.setVisible( true );
	}
	
	private static void layoutComponents( JPanel panel ) {
		panel.setLayout( null );
		
		JLabel usernameLabel = new JLabel( "Username" );
		usernameLabel.setBounds(10, 10, 80, 25);
		panel.add( usernameLabel );
		
		JLabel passwordLabel = new JLabel( "Password" );
		passwordLabel.setBounds(10, 45, 80, 25);
		panel.add( passwordLabel );
		
		JTextField usernameText = new JTextField( 20 );
		usernameText.setBounds( 100, 10, 160, 25);
		panel.add( usernameText );
		
		JTextField passwordText = new JTextField( 20 );
		passwordText.setBounds( 100, 45, 160, 25);
		panel.add( passwordText );
		
		JButton loginButton = new JButton( "Login" );
		loginButton.setBounds(10, 80, 120, 25);
		panel.add( loginButton );
		
		JButton closeButton = new JButton( "Close" );
		closeButton.setBounds(140, 80, 120, 25);
		panel.add( closeButton );
		
		ActionListener loginButtonListener = new ActionListener() {
			@override
			public void actionPerformed( ActionEvent e ) {
				JOptionPane.showMessageDialog( ( Component )e.getSource(), "Login Button has been pressed!" );
			}
		};
		loginButton.addActionListener( loginButtonListener );
		
		ActionListener closeButtonListener = new ActionListener() {
			@override
			public void actionPerformed( ActionEvent e ) {
				JOptionPane.showMessageDialog( ( Component )e.getSource(), "Close Button has been pressed!" );
			}
		};
		closeButton.addActionListener( closeButtonListener );
	}

}
