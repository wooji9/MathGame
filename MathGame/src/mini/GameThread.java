package mini;

import javax.swing.JOptionPane;

public class GameThread implements Runnable{
	int stat=0;
	float dur =0f;

	@Override
	public void run() {
		// TODO Auto-generated method stub

		/* 3..2..1.. 
		     �� �� ������..
		 */

		long start = System.currentTimeMillis();	//�ð� ��� ����
		
		while(true) {

			try {
				Thread.sleep(10);
				System.out.println("������ ������,,,");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(MiniMain.judge ==-1) {
				//�߰��� Ʋ���� ��
				//�����ϱ�
				this.stat=1;
				break;
			}

			if(MiniMain.judge==7){
				//������ �¾�����
				//�ð� ��� ����ϱ�
				long end = System.currentTimeMillis();
				dur = (end-start)/(float)1000;

				if(dur<=3) {

					this.stat=2;
				}else {

					this.stat=3;
				}
				break;
			}
		}
	}


	public int getStat() {
		return stat;
	}
	public float getDur() {
		return dur;
	}

}
