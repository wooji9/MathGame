package mathGame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import mainFrame.MainButtonListener;
import mainFrame.MainFrame;

public class TopPanel extends MathPadButtonListener{

	 Panel pTop = new Panel();
	   
	 Panel pTop2 = new Panel();
	   
	   
	 JLabel label = new JLabel("Math Game");
	   
	 Font fontMain = new Font(Font.SANS_SERIF, Font.BOLD, 27);
	 Font fontMath = new Font("SANS_SERIF", Font.BOLD, 20);
	 Font fontLevel = new Font("SANS_SERIF", Font.BOLD, 30);
	 Font fontPoint = new Font("SANS_SERIF", Font.BOLD, 25);
	 
	 Button topMain = new Button("Main");
	 
	 Label lLevel = new Label();
	 Label lPoint = new Label();
	 
	 public TopPanel() {
	   
		 pTop.setSize(600, 90);
		 pTop.setLocation(0, 10);
		 pTop.setBackground(Color.DARK_GRAY);
	      
	      
		 topMain.setBounds(470, 42, 100, 50);
		 topMain.setFont(fontMain);

	     pTop2.setSize(580, 60);
	     pTop2.setLocation(10, 105);
	     pTop2.setBackground(Color.DARK_GRAY);
	      
	     Label lMath = new Label("Math Quiz");
	    
	     // Color color = new Color("WHITE", );
	      
	     
	     lMath.setFont(fontMath);
	     lMath.setBounds(10, 49, 100, 30);
	     lMath.setForeground(Color.darkGray);
	     
	     
	     
	     							
	    
	      
	     // lb.setBackground(Color.LIGHT_GRAY);
	     
	     lLevel.setText("Level " + u.getLevel());
	     lLevel.setFont(fontLevel);
	     lLevel.setBounds(35, 120, 110, 37);
	     lLevel.setForeground(Color.blue);

	     f.add(lLevel);
	     
	     f.add(lMath);
	     
	     lPoint.setText("Point : " + u.getPoint());
	     lPoint.setFont(fontPoint);
	     lPoint.setBounds(450, 120, 115, 37);
	     
	     f.add(lPoint);
	     
	      
	     f.add(topMain);
	      
	     f.add(pTop);
	      
	     f.add(pTop2);

	     enter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				lLevel.setText("Level " + u.getLevel());
				
			}
			
		});
	    
	     enter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				lPoint.setText("Point : " + u.getPoint());
				
			}
		});
	     
	     topMain.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//메인으로
				
				u.setEndLevel(u.getLevel());
				u.setEndPoint(u.getPoint());
				
				System.out.println(u.getEndPoint());
				
				f.dispose();
				
				MainFrame main = new MainFrame();
				
				
			}
		});

	 }

	

}








