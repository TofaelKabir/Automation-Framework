package pagesTest;

import org.testng.annotations.Test;
import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	
	@Test
	public void click_logo_test() {
		homePage.click_logo();
	}
	
	@Test
	public void click_login_button_test() throws InterruptedException {
		homePage.click_login_button();
	}
	
	
}
