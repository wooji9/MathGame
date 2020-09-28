package mainFrame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import login.User;
import mathGame.MathQuiz;
import mini.MiniMain;

public class MainFrame {
	
	Frame fMain = new Frame("MainMenu");
	Button math = new Button("MathGame");
	Button mini = new Button("miniGame");
	Button exit = new Button("EXIT");
	Font fontMain = new Font(Font.SANS_SERIF, Font.BOLD, 50);
	Font fontGame = new Font(Font.SANS_SERIF, Font.BOLD, 100);
	Panel pMain = new Panel();
	User u = new User();
	
	public MainFrame() {
		
		fMain.setBounds(700, 100, 600, 800);
	    fMain.setResizable(false);
	    fMain.setBackground(Color.WHITE);
	    fMain.setLayout(null);
	    
	    
	
	
	    fMain.add(pMain);
	      
	    math.setSize(300, 100);
	    math.setLocation(150, 330);
	    math.setFont(fontMain);
	   
	    mini.setSize(300, 100);
	    mini.setLocation(150, 460);
	    mini.setFont(fontMain);
	      
	    exit.setSize(300, 100);
	    exit.setLocation(150, 590);
	    exit.setFont(fontMain);
	      
	    fMain.add(math);
	    fMain.add(mini);
	    fMain.add(exit);
	    
	    ImageIcon mainImg = new ImageIcon("MAIN.png");
		JLabel main = new JLabel(mainImg);
		main.setSize(600,800);
		main.setLocation(0,0);
		fMain.add(main);
		
	    fMain.setVisible(true);
	
		fMain.addWindowListener( new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};

		} );
	
		math.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				MathQuiz mq = new MathQuiz();
				fMain.dispose();
			}
			
		});
		
		mini.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				MiniMain m = new MiniMain(u.getPoint());
	            Thread t = new Thread(m);
	            t.start();
	            //mm.start();
	            u.setPoint(m.getPoint());
	            fMain.dispose();
				
			}
		});
		
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				ExitOnTop eot = new ExitOnTop();
				
			}
			
		});
	
	}
}
