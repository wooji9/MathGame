package mathGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import login.User;

public class MathPadButtonListener extends MathPad{
	
	String myAnswer = "";
	String answer = "37";
	User u = new User();


	public MathPadButtonListener() {
		// TODO Auto-generated constructor stub
		
		
		
		for (int i = 0; i < btnkp.length; i++) {
			
			String num = "" + i;
			
			btnkp[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					tf.setText(tf.getText() + num);
					
				}
			});
			
		}
		
		
		
		undo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tf.setText("");
				
			}
		});
		
		tf.addTextListener(new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
				
				if( tf.getText().equals("") ) {
					enter.setEnabled(false);
				} else {
					enter.setEnabled(true);
				}
				
			}
			
		});
		
		enter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
				myAnswer = tf.getText();
				tf.setText("");
				
				System.out.println("my"+myAnswer);
				System.out.println("an"+answer);
				
				System.out.println("L"+u.getLevel());
				System.out.println("EL"+u.getEndLevel());
				
				CorrectWrong cw = new CorrectWrong();
				
				if ( myAnswer.equals(answer) ) {
					
					u.setLevel(u.getLevel()+1);
					u.setPoint(u.getPoint() + 1);
					
					
					System.out.println(u.getLevel());
					System.out.println("point " + u.getLevel());
					
					
					if( u.getLevel() < 6) {
						
						cw.Correct();
						
					}
					
					
				} else {
					
					System.out.println("level " + u.getLevel());
					System.out.println("point " + u.getPoint());
					
					cw.Wrong();
					
				}
				
			}
		});
		
		
		
	}
	
	
}
