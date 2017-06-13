package configs;

public class Configuration {
	
	public static String testsite="http://trademe.co.za";
	//trademeHomePage
	public static final String username=".//*[@id='page_email']";
	public static final String password=".//*[@id='page_password']";
	public static final String signin=".//*[@id='LoginPageButton']";
	public static final String jobs=".//*[@id='SearchTabs1_JobsAnchor']/a";
	//twitLandingPage
	public static final String profile="//*[@id='page-container']/div[1]/div[1]/div[1]/a/div/div/b";
	public static final String tweets="//*[@id='page-container']/div[1]/div[1]/div[2]/ul/li[1]/a";
	public static final String following="//*[@id='page-container']/div[1]/div[1]/div[2]/ul/li[2]/a";
	public static final String followers="//*[@id='page-container']/div[1]/div[1]/div[2]/ul/li[3]/a";


	//twitMyProfile
	public static final String editbutton="//*[@id='page-container']/div[2]/div[4]/div[1]/a";

	//twitEditProfile
	public static final String inlineediticon="//*[@id='page-container']/div[2]/div[1]/a/i[1]";
	public static final String uploadPhoto="//*[@id='photo-choose-existing']/div/div/input[3]";
	public static final String cancel="//*[@id='profile_image_upload_dialog']/div[2]/div/div[3]/button[1]";
	public static final String cancelmenu="//*[@id='choose-photo']/ul/li[5]";
	
	

}
