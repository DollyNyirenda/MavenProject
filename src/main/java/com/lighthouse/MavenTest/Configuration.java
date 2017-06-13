package com.lighthouse.MavenTest;

public class Configuration {
	
	public static String testsite="http://trademe.co.za";
	//trademeHomePage
	public final String username=".//*[@id='page_email']";
	public final String password=".//*[@id='page_password']";
	public final String login=".//*[@id='LoginPageButton']";
	public final String jobs=".//*[@id='SearchTabs1_JobsAnchor']/a";
	public final String motors=".//*[@id='SearchTabs1_MotorsAnchor']/a";
	public final String accountname = ".//*[@id='container']/div[1]/div[1]/div[2]/div/p";
	public final String name = "Sepisodolly!";
	
	//JobsPage
	public final String listAJob=".//*[@id='main-box-jobs']/div/div[1]/button";
	

	//twitMyProfile
	public static final String editbutton="//*[@id='page-container']/div[2]/div[4]/div[1]/a";

	//twitEditProfile
	public static final String inlineediticon="//*[@id='page-container']/div[2]/div[1]/a/i[1]";
	

}
