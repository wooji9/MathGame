package login;

public class User {
	private String id;
	private String pwd;
	int point = 3;
	int level = 1;
	int endPoint;
	int endLevel;
	
	public int getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(int endPoint) {
		this.endPoint = endPoint;
	}
	public int getEndLevel() {
		return endLevel;
	}
	public void setEndLevel(int endLevel) {
		this.endLevel = endLevel;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getPoint() {
		return point;
	}
	
	
	
}
