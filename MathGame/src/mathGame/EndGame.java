package mathGame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;

public class EndGame {

	Frame fEnd = new Frame();
	Button main = new Button("Main");
	
	public void endGame() {
		
		
		fEnd.setSize(400, 200);
		fEnd.setLocation(800, 400);
		fEnd.setBackground(Color.PINK);
		fEnd.setResizable(false);
		fEnd.setLayout(null);
		
		Font fontjl = new Font(Font.SANS_SERIF, Font.BOLD, 17);
		
		//JLable 수정
		JLabel jl = new JLabel("축하합니다 모든 스테이지를 완료 하셨습니다!!");
		jl.setLayout(null);
		jl.setSize(400, 100);
		jl.setLocation(23, 10);
		jl.setFont(fontjl);
		
		fEnd.add(jl);
		

		
		main.setSize(150, 50);
		main.setLocation(222, 130);
		fEnd.add(main);
		
		
		main.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//main으로 가기
		
				fEnd.dispose();
				
			}
		});
		
		
		fEnd.setVisible(true);
		
		/*	
		fEnd.addWindowListener( new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				fEnd.dispose();	
			};

		} );
		*/
	
		
	}
}
