package com.godlife.io.service.domain;

//==>회원정보를 모델링(추상화/캡슐화)한 Bean
public class User {
	
	//field
	
	private String userEmail;
	private String pwd;
	private String role;
	private String nick;
	private String regDate;
	private int categNo;
	private String profileImg;
	private String intro;
	private String phone;
	private int redCardCount;
	private String accountStatus;
	private int reportCount;
	private int totalPoint;
	
	
	///Constructor
	public User() {
	}


	///Method
	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getNick() {
		return nick;
	}


	public void setNick(String nick) {
		this.nick = nick;
	}


	public String getRegDate() {
		return regDate;
	}


	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}


	public int getCategNo() {
		return categNo;
	}


	public void setCategNo(int categNo) {
		this.categNo = categNo;
	}


	public String getProfileImg() {
		return profileImg;
	}


	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}


	public String getIntro() {
		return intro;
	}


	public void setIntro(String intro) {
		this.intro = intro;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public int getRedCardCount() {
		return redCardCount;
	}


	public void setRedCardCount(int redCardCount) {
		this.redCardCount = redCardCount;
	}


	public String getAccountStatus() {
		return accountStatus;
	}


	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}


	public int getReportCount() {
		return reportCount;
	}


	public void setReportCount(int reportCount) {
		this.reportCount = reportCount;
	}


	public int getTotalPoint() {
		return totalPoint;
	}


	public void setTotalPoint(int totalPoint) {
		this.totalPoint = totalPoint;
	}


	
	@Override
	public String toString() {
		return "User [userEmail=" + userEmail + ", pwd=" + pwd + ", role=" + role + ", nick=" + nick + ", regDate="
				+ regDate + ", categNo=" + categNo + ", profileImg=" + profileImg + ", intro=" + intro + ", phone="
				+ phone + ", redCardCount=" + redCardCount + ", accountStatus=" + accountStatus + ", reportCount="
				+ reportCount + ", totalPoint=" + totalPoint + "]";
	}
	


}

