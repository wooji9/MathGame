package login;

import mainFrame.MainFrame;

public class LoginMain {
		LoginView loginView;
		MainFrame mainFrame;
	public static void main(String[] args) {
		//����Ŭ���� ����
		LoginMain main = new LoginMain();
		main.loginView = new LoginView();//�α���â ���̱�
		main.loginView.setMain(main); //�α���â�� ���� Ŭ���� ������
		
	}
	
	//�׽�Ʈ ������ â
	public void showFrameTest() {
		loginView.dispose();//�α���â �ݱ�
		this.mainFrame = new MainFrame();//�׽�Ʈ ������ ����
		
	}
	
	
	
}
