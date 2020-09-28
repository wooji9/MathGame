package mini;

import java.awt.*;

import java.awt.event.*;
import java.util.*;
import javax.swing.*;

import mainFrame.MainFrame;

public class MiniMain extends Frame implements Runnable{

	static int judge;
	static int nowArrow;

	String[] arrow;
	Panel arrows;
	JLabel[] icon;
	int point;
	GameThread gt = null;
	
	//������ ���� ����Ʈ
	public MiniMain(int point) {
		this.point =point;

		judge =0;
		nowArrow=0;

		this.setBounds(700, 100, 600, 800);
		this.setLayout(null);
		System.out.println("A");
		this.makeArrow();
		System.out.println("B");
		this.showArrow();
		System.out.println("C");
		ImageIcon b = new ImageIcon("POINT_GAME.png");
		JLabel back = new JLabel(b);
		back.setBounds(0, 25,600, 800);
		add(back);
		this.setVisible(true);
		System.out.println("D");
		try {
			Thread.sleep(100);
			//System.out.println("sleep");
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("E");
		gt = new GameThread();
		Thread t = new Thread( gt );
		t.start();


		System.out.println("F");
		//////////////////////////////////////////////////
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// �Է¹޴� ȭ��ǥ�� ���� ���� ��Ʈ���� ulrds����
				System.out.println(e.getKeyCode());
				String k = new String();
				switch(e.getKeyCode()) {
				case KeyEvent.VK_UP : k="U";
				break;
				case KeyEvent.VK_LEFT : k="L";
				break;		
				case KeyEvent.VK_DOWN : k="D";
				break;
				case KeyEvent.VK_RIGHT : k="R";
				break;
				case KeyEvent.VK_SPACE : k="S";
				break;
				default : k="X";
				break;
				}//switch
				System.out.println("K:"+k);
				if(k.equals(arrow[nowArrow])){ 
					//System.out.println(nowArrow+"��° icon : "+icon[nowArrow]);
					//arrows��� �ǳڿ��� icon[nowArrow]��� ���̺��� ������
					System.out.println(nowArrow+"��° remove");
					arrows.remove(icon[nowArrow]);
					arrows.invalidate();
					arrows.repaint();

					judge++;
				}else {
					judge=-1;
				}

				//System.out.println("b : "+ b);
				//System.out.println(nowArrow+"����"+(nowArrow+1));
				nowArrow++;

			}

		});
		////////////////////////////////////////////////////
		System.out.println("G");
		//������ ������
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

		System.out.println("H");	
		
//		while(true) {
//			try {
//				Thread.sleep(10);
//				System.out.println("�����,,");
//			} catch (InterruptedException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//
//			if(gt.getStat()==1) {
//				JOptionPane.showMessageDialog(this, "Ʋ�Ƚ��ϴ�\n����Ʈ ȹ�����");
//				this.dispose();
//				break;
//			}else if(gt.getStat()==2) {
//				JOptionPane.showMessageDialog(this, "�ɸ��ð� : " + gt.getDur() + "\n1����Ʈ ȹ��");
//				this.dispose();
//				this.point++;
//				break;
//			}else if(gt.getStat()==3) {
//				JOptionPane.showMessageDialog(this, "�ɸ��ð� : " + gt.getDur() + "\n����Ʈ ȹ�����");
//				this.dispose();
//				break;
//			}
//		}

		
	}


	//ȭ��ǥ 6�� ���� ���� + �������� �����̽���
	public void makeArrow() {
		Random rd = new Random();
		arrow = new String[7];

		for(int i=0;i<arrow.length-1;i++) {
			int newArrow = rd.nextInt(4);
			switch(newArrow) {
			case 0 : arrow[i]="U";
			break;
			case 1 : arrow[i]="L";
			break;
			case 2 : arrow[i]="R";
			break;
			case 3 : arrow[i]="D";
			}
		}
		//�������� �����̽���
		arrow[arrow.length-1]="S";
	}

	//���������� ȭ��ǥ�� ȭ�鿡 ����
	public void showArrow() {

		arrows = new Panel();
		//arrows.setLayout(null);
		arrows.setBounds(55, 400,480,100);
		ImageIcon img;
		icon = new JLabel[arrow.length];

		for(int i=0;i<arrow.length;i++) {
			switch (arrow[i]) {
			case "U": img = new ImageIcon("U.png");
			break;

			case "L": img = new ImageIcon("L.png");
			break;

			case "R": img = new ImageIcon("R.png");
			break;

			case "D": img = new ImageIcon("D.png");
			break;

			default: img = new ImageIcon("S.png");
			break;
			}

			icon[i] = new JLabel(img);	//icon[i]�� �̹���(���̺�)���� ����	
			System.out.println("hi:"+arrow[i]);
			arrows.add(icon[i]);
			arrows.invalidate();
			arrows.repaint();
		}	
		add(arrows);
		arrows.invalidate();
		arrows.repaint();
	}


	public int getPoint() {
		return this.point;
	}


	
	
	@Override
	public void run() {
		while(true) {
		try {
			Thread.sleep(10);
			System.out.println("�����,,");
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		if(gt.getStat()==1) {
			JOptionPane.showMessageDialog(this, "Ʋ�Ƚ��ϴ�\n����Ʈ ȹ�����");
			this.dispose();
			break;
		}else if(gt.getStat()==2) {
			JOptionPane.showMessageDialog(this, "�ɸ��ð� : " + gt.getDur() + "\n1����Ʈ ȹ��");
			this.dispose();
			this.point++;
			break;
		}else if(gt.getStat()==3) {
			JOptionPane.showMessageDialog(this, "�ɸ��ð� : " + gt.getDur() + "\n����Ʈ ȹ�����");
			this.dispose();
			break;
		}
	}
		MainFrame main = new MainFrame();
		
	}

}

