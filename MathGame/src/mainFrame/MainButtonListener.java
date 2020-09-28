package mainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import login.User;
import mathGame.MathQuiz;
import mathGame.MathQuizeMain;

public class MainButtonListener extends MainFrame{

	User u = new User();
	public MainButtonListener() {
		
		math.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				MathQuiz mq = new MathQuiz();
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
