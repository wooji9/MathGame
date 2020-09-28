package mathGame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;

public class Hint extends QuizPng{

	Frame fhint = new Frame();

	public Hint() {
		fhint.setSize(400, 200);
		fhint.setLocation(800, 400);
		fhint.setBackground(Color.PINK);
		
		Font fontHint = new Font(Font.SANS_SERIF, Font.BOLD, 30);
		fhint.setResizable(false);
		fhint.setLayout(null);
		
		
		hint.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				fhint.removeAll();
				
				
				
					Button btnOk = new Button("Ok");
					btnOk.setSize(130, 45);
					btnOk.setLocation(250, 143);
					fhint.add(btnOk);
				
				if(u.getPoint() > 0) {
					
					u.setPoint(u.getPoint() - 3);
					lPoint.setText("Point : " + u.getPoint());
	
					if(u.getLevel() == 1) {
						
						JLabel jl = new JLabel("1단계 힌트");
						jl.setFont(fontHint);
						jl.setLayout(null);
						jl.setSize(400, 100);
						jl.setLocation(23, 10);
						
						JLabel hint1 = new JLabel(" + 11");
						hint1.setFont(fontHint);
						hint1.setLayout(null);
						hint1.setSize(400, 100);
						hint1.setLocation(150, 70);
	
						
						fhint.add(jl);
						fhint.add(hint1);
						
					} else if(u.getLevel() == 2) {
						
						JLabel jl = new JLabel("2단계 힌트");
						jl.setFont(fontHint);
						jl.setLayout(null);
						jl.setSize(400, 100);
						jl.setLocation(23, 10);
						
						JLabel hint2 = new JLabel("꼭짓점의 갯수");
						hint2.setFont(fontHint);
						hint2.setLayout(null);
						hint2.setSize(400, 100);
						hint2.setLocation(100, 70);
						
						fhint.add(jl);
						fhint.add(hint2);
						
					} else if(u.getLevel() == 3) {
						
						JLabel jl = new JLabel("3단계 힌트");
						jl.setFont(fontHint);
						jl.setLayout(null);
						jl.setSize(400, 100);
						jl.setLocation(23, 10);
						
						JLabel hint3 = new JLabel("A = 2X, B = 五");
						hint3.setFont(fontHint);
						hint3.setLayout(null);
						hint3.setSize(400, 100);
						hint3.setLocation(100, 70);
						
						fhint.add(jl);
						fhint.add(hint3);
						
					} else if(u.getLevel() == 4) {
						
						JLabel jl = new JLabel("4단계 힌트");
						jl.setFont(fontHint);
						jl.setLayout(null);
						jl.setSize(400, 100);
						jl.setLocation(23, 10);
						
						JLabel hint4 = new JLabel("Left / Rigth = ?");
						hint4.setFont(fontHint);
						hint4.setLayout(null);
						hint4.setSize(400, 100);
						hint4.setLocation(100, 70);
						
						fhint.add(jl);
						fhint.add(hint4);
						
					} else if(u.getLevel() == 5) {
						
						JLabel jl = new JLabel("5단계 힌트");
						jl.setFont(fontHint);
						jl.setLayout(null);
						jl.setSize(400, 100);
						jl.setLocation(23, 10);
						
						JLabel hint5 = new JLabel("R + L = M.L , R - L = M.R");
						hint5.setFont(fontHint);
						hint5.setLayout(null);
						hint5.setSize(400, 100);
						hint5.setLocation(30, 70);
						
						fhint.add(jl);
						fhint.add(hint5);
						
					}
				
				} else {
					
					JLabel pointLess= new JLabel("포인트가 부족합니다");
					pointLess.setFont(fontHint);
					pointLess.setLayout(null);
					pointLess.setSize(400, 100);
					pointLess.setLocation(23, 10);
					
					JLabel needpoint = new JLabel("3포인트 필요");
					needpoint.setFont(fontHint);
					needpoint.setLayout(null);
					needpoint.setSize(400, 100);
					needpoint.setLocation(30, 70);
					
					fhint.add(pointLess);
					fhint.add(needpoint);
					
				}
				
				btnOk.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						fhint.dispose();
					}
				});
				
				
				
				fhint.setVisible(true);
				
				fhint.addWindowListener( new WindowAdapter() {

					@Override
					public void windowClosing(WindowEvent e) {
						fhint.dispose();	
					};

				} );
				
			}
		});
		
	}
	
	
}
