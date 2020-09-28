package mainFrame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ExitOnTop {

	Frame fExit = new Frame();
	Button eCancle = new Button("Cancle");
	Button eExit = new Button("Exit");
	Label lExit = new Label("게임을 종료하시겠습니까 ?");
	Font fontExit = new Font(Font.SANS_SERIF, Font.BOLD, 27);
	
	public ExitOnTop() {

		fExit.setSize(400, 200);
		fExit.setLocation(800, 400);
		fExit.setBackground(Color.PINK);
		fExit.setResizable(false);
		fExit.setLayout(null);
		
		lExit.setSize(350, 100);
		lExit.setLocation(25, 30);
		lExit.setFont(fontExit);
		
		eCancle.setSize(150, 50);
		eCancle.setLocation(25, 130);
		eCancle.setFont(fontExit);
		
		eExit.setSize(150, 50);
		eExit.setLocation(222, 130);
		eExit.setFont(fontExit);
		
		fExit.add(lExit);
		fExit.add(eCancle);
		fExit.add(eExit);
		
		fExit.setVisible(true);
		
		eCancle.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				fExit.dispose();
				
			}
		});
		
		eExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//저장
				
				System.exit(0);
				
			}
		});
		
		fExit.addWindowListener( new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				fExit.dispose();	
			};

		} );
		
	}
}
