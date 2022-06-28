package com.BikkedIT.UserManagementApp.binding;

public class UnlockAccForm {
	
	private String email;
	private String temPassword;
	private String newPassword;
	public UnlockAccForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTemPassword() {
		return temPassword;
	}
	public void setTemPassword(String temPassword) {
		this.temPassword = temPassword;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getConfPassword() {
		return ConfPassword;
	}
	public void setConfPassword(String confPassword) {
		ConfPassword = confPassword;
	}
	private String ConfPassword;
	

}
