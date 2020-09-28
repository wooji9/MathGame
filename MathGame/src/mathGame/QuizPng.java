package mathGame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import mainFrame.MainFrame;

public class QuizPng extends TopPanel{

	
	ImageIcon img1 = new ImageIcon("Q1.png");
	ImageIcon img2 = new ImageIcon("Q2.png");
	ImageIcon img3 = new ImageIcon("Q3.png");
	ImageIcon img4 = new ImageIcon("Q4.png");
	ImageIcon img5 = new ImageIcon("Q5.png");
	JLabel jlPng = new JLabel(img1);
	

	public QuizPng() {
		// TODO Auto-generated constructor stub
		
		//클릭시 사진 바뀌게 혹은 다음레벨되면 사진 바뀌게
		
		//a.setSize(580, 400);
				//a.setLocation(10, 200);
		
		//jlPng.setBounds(10, 30, 236, 214);
		jlPng.setSize(580, 430);
		jlPng.setLocation(10, 175);
		jlPng.setBackground(Color.BLUE);
		f.add(jlPng);
		
		enter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(u.getLevel() == 1) {
					jlPng.setIcon(img1);
					
				} else if( u.getLevel() == 2) {
					jlPng.setIcon(img2);
					
				} else if ( u.getLevel() == 3 ) {
					jlPng.setIcon(img3);
					
				} else if ( u.getLevel() == 4 ) {
					jlPng.setIcon(img4);
					
				} else if ( u.getLevel() == 5 ) {
					jlPng.setIcon(img5);
					
				} else {
					jlPng.setIcon(null);
				}
				
				if( u.getLevel() == 1) {
					answer = "37";
					System.out.println();
					
				} else if (u.getLevel() == 2) {
					answer = "0";
					System.out.println();
					
				} else if (u.getLevel() == 3) {
					answer = "5";
					System.out.println();
					
				} else if (u.getLevel() == 4) {
					answer = "6";
					System.out.println();
					
				} else if (u.getLevel() == 5) {
					answer = "62";
					System.out.println();
					
					
				} else {
					
					EndGame end = new EndGame();
					end.endGame();
					end.main.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							
							u.setEndLevel(u.getLevel());
							u.setEndPoint(u.getPoint());
							
							f.dispose();
							MainFrame main = new MainFrame();
							
						}
					});
					System.out.println("오류");
					
				}

				
			}
		});
		
		
		
	}
	
	
	
}
