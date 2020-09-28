package login;

import java.io.File;

public class PointLevel {

	public PointLevel() {
		// TODO Auto-generated constructor stub
		
		String path = "C:\\Test\\MathGame";

		File dir1 = new File(path);
		if(!dir1.exists()) {
			dir1.mkdirs();//게임폴더 생성	
		}
		
		
		
		
		
	}
}
