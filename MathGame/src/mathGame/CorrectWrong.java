package mathGame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class CorrectWrong {

	Frame fco = new Frame();
	Font fontCW = new Font(Font.SANS_SERIF, Font.BOLD, 45);
	Button nextLevel = new Button("Next Level");
	Button wrong = new Button("Wrong");
	
	
	
	
	public void Correct() {
		
		
		
		fco.setSize(400, 200);
		fco.setLocation(800, 400);
		fco.setLayout(null);
		
		
		Label laco = new Label("정     답");
		laco.setBackground(Color.CYAN);
		laco.setSize(163, 50);
		laco.setLocation(118, 50);
		laco.setFont(fontCW);
		
		fco.add(laco);
		
		nextLevel.setSize(200, 50);
		nextLevel.setLocation(97, 130);
		
		fco.add(nextLevel);
		
		nextLevel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				fco.dispose();
	
			}
		});
		
		
		/*
		nextLevel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int pnglevel = 1;
				pnglevel++;
				System.out.println(pnglevel);
			}
		});
		*/
		
		fco.setVisible(true);
		
		fco.addWindowListener( new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				fco.dispose();	
			};

		} );
		
	}
	
	
	public void Wrong() {
		
		Frame fwr = new Frame();
		fwr.setSize(400, 200);
		fwr.setLocation(800, 400);
		fwr.setLayout(null);
	
		Label lawr = new Label("오     답");
		lawr.setBackground(Color.CYAN);
		lawr.setSize(163, 50);
		lawr.setLocation(118, 50);
		lawr.setFont(fontCW);
		
		fwr.add(lawr);
		
		fwr.add(lawr);
		
		
		wrong.setSize(200, 50);
		wrong.setLocation(97, 130);
		
		fwr.add(wrong);
		
		fwr.add(nextLevel);
		
		wrong.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				fwr.dispose();
	
			}
		});
		
		
		fwr.setVisible(true);
		
		fwr.addWindowListener( new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				fwr.dispose();
			};

		} );

	}
	
	
}
