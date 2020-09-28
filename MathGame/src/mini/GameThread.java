package mini;

import javax.swing.JOptionPane;

public class GameThread implements Runnable{
	int stat=0;
	float dur =0f;

	@Override
	public void run() {
		// TODO Auto-generated method stub

		/* 3..2..1.. 
		     할 수 있을까..
		 */

		long start = System.currentTimeMillis();	//시간 재기 시작
		
		while(true) {

			try {
				Thread.sleep(10);
				System.out.println("스레드 도는중,,,");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(MiniMain.judge ==-1) {
				//중간에 틀렸을 때
				//종료하기
				this.stat=1;
				break;
			}

			if(MiniMain.judge==7){
				//끝까지 맞았을때
				//시간 잰거 출력하기
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
