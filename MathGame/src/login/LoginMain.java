package login;

import mainFrame.MainFrame;

public class LoginMain {
		LoginView loginView;
		MainFrame mainFrame;
	public static void main(String[] args) {
		//메인클래스 실행
		LoginMain main = new LoginMain();
		main.loginView = new LoginView();//로그인창 보이기
		main.loginView.setMain(main); //로그인창에 메인 클래스 보내기
		
	}
	
	//테스트 프레임 창
	public void showFrameTest() {
		loginView.dispose();//로그인창 닫기
		this.mainFrame = new MainFrame();//테스트 프레임 오픈
		
	}
	
	
	
}
