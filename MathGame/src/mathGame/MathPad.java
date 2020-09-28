package mathGame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MathPad{

	Frame f = new Frame("MathGame");
	
	Button[] btnkp = new Button[10];
	
	Panel pKP = new Panel();
	
	Panel p = new Panel();
	
	Font font = new Font(Font.SANS_SERIF, Font.BOLD, 20);
	TextField tf = new TextField(0);
	Button hint = new Button("Hint");
	Button enter = new Button("Enter");
	Button undo = new Button("X");

	
	public MathPad() {
	
		
		//키 10
		//힌트
		//입력
		//입력보이는창
		//지우기	
		
		f.setBounds(700, 100, 600, 800);
		f.setResizable(false);
		f.setBackground(Color.GRAY);
		f.setLayout(null);
		
		
		
		//pKP.setLayout(null);
		//pKP.setBounds(100, 500, 400, 300);
		pKP.setSize(580, 130);
		pKP.setLocation(10, 660);
		pKP.setBackground(Color.LIGHT_GRAY);
		
		for (int i = 0; i < btnkp.length; i++) {
			String snum = "" + i;
			
			btnkp[i] = new Button(snum);
			
			
			btnkp[i].setPreferredSize(new Dimension(110, 57));
			
			
			pKP.add(btnkp[i]);
			
		}
		
		f.add(pKP);
		
		
		p.setSize(580, 60);
		p.setLocation(10, 610);
		p.setBackground(Color.DARK_GRAY);
		
		
		tf.setPreferredSize( new Dimension(220, 35));
		tf.setFont(font);
		tf.setEditable(false);
		p.add(tf);
		
		hint.setPreferredSize( new Dimension(100, 35));
		hint.setFont(font);
		p.add(hint);
		
		enter.setPreferredSize( new Dimension(150, 35));
		enter.setFont(font);
		enter.setEnabled(false);
		p.add(enter);
		
		//문제 영역 크기
		//Label a = new Label();
		//a.setSize(580, 400);
		//a.setLocation(10, 200);
		//a.setBackground(Color.CYAN);
		//f.add(a);
		
		f.add(undo);
		
		f.add(p);

		
		
		
		
		undo.setSize(50, 34);
		undo.setLocation(230, 616);
		undo.setFont(font);
		
		
		f.addWindowListener( new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};

		} );
	
	}

}
