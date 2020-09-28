package login;

import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends JFrame {

	private LoginMain main;

	private JButton btnLogin;
	private JButton btnInit;
	private JPasswordField passText;
	private JTextField userText;
	private boolean bLoginCheck;


	public LoginView() {

		String path = "C:\\Test\\MathGame";

		File dir1 = new File(path);
		if(!dir1.exists()) {
			dir1.mkdirs();//�������� ����	
		}
		
		ImageIcon loginImg = new ImageIcon("LOGIN2.png");
		JLabel log = new JLabel(loginImg);
		log.setSize(600,300);
		log.setLocation(0, 0);
		log.setBackground(Color.WHITE);
		add(log);
		
		/*
			Panel back = new Panel();
			back.setSize(600, 800);
			back.setLocation(0, 0);
			back.setBackground(Color.WHITE);
		*/
			
		

			//setting
			setTitle("Math Game Login");
			setSize(600, 800);
			setResizable(false);
			setLocation(700, 100);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			
			
			

			//panel
			JPanel panel = new JPanel();
			placeloginpanel(panel);

			//add
			add(panel);
			
			
			
			//visible
			setVisible(true);


		}

		private void placeloginpanel(JPanel panel) {
			
			
			
			panel.setLayout(null);
			JLabel userLabel = new JLabel("ID");
			userLabel.setBounds(190, 430, 80, 25);
			panel.add(userLabel);

			JLabel passLabel = new JLabel("PW");
			passLabel.setBounds(190, 480, 80, 25);
			panel.add(passLabel);

			userText = new JTextField(20);
			userText.setBounds(240, 430, 160, 25);
			panel.add(userText);

			passText = new JPasswordField(20);
			passText.setBounds(240, 480, 160, 25);
			panel.add(passText);

			passText.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					isLoginCheck();

				}
			});

			btnLogin = new JButton("�α���");
			btnLogin.setBounds(190, 530, 100, 25);
			panel.add(btnLogin);
			btnLogin.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					isLoginCheck();

				}
			});

			btnInit = new JButton("ȸ������");
			btnInit.setBounds(300, 530, 100, 25);
			panel.add(btnInit);
			btnInit.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent t) {

					//ȸ������ ����

					try {
						BufferedWriter bos = new BufferedWriter(new FileWriter("C:\\Test\\MathGame/userList.txt", true));
						bos.write(userText.getText()+"/");
						bos.write(passText.getText());
						bos.write("\n");
						JOptionPane.showMessageDialog(null, "ȸ������ �Ǿ����ϴ�!");
						bos.close();
					} catch (Exception ex) {
						ex.printStackTrace();
						JOptionPane.showMessageDialog(null, "ȸ�������� �ٸ��� �Է����ּ���.");
					}

				}
			});
			
			

		}

		public void isLoginCheck() {

			//�α��� ����

			FileReader fr = null;
			BufferedReader br = null;
			ArrayList<User> arr = new ArrayList<User>();

			try {

				fr = new FileReader("C:\\Test\\MathGame/userList.txt");
				br = new BufferedReader(fr);

				String sss = "";
				while( (sss = br.readLine()) != null ) {

					String[] res = sss.split("/");
					User u = new User();
					u.setId( res[0] );
					u.setPwd( res[1] );

					arr.add(u);

				}//while

				for(int i = 0; i < arr.size(); i++) {

					if(userText.getText().equals( arr.get(i).getId() )) {

						if( passText.getText().equals( arr.get(i).getPwd() ) ) {
							JOptionPane.showMessageDialog(null, "�α��� �Ǿ����ϴ�!");
							bLoginCheck = true;
						}

					}	
				}


			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


			// �α��� �����̶�� �Ŵ���â �ٿ��

			if(isLogin()){
				main.showFrameTest(); // ����â �޼ҵ带 �̿��� â����

			}else{
				JOptionPane.showMessageDialog(null, "ȸ�������� ���ų� �ٸ��ϴ�.");
			}

			
		}

		// LoginMain�� ����
		public void setMain(LoginMain main) {
			this.main = main;
		}


		public boolean isLogin() {     
			return bLoginCheck;
		}


	}
