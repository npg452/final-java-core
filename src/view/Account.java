package view;

public class Account {
	private String userName;
    private String password;
	public Account(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public Account() {
		super();
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
}
