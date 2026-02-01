package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DashboardPage;
import pages.DirectoryPage;
import pages.LoginPage;
import pages.MyinfoPage;
import pages.PIMPage;

public class OrangeHRMTest extends BaseTest {

	String user="orange";
	String pass="orangepassword123";
	@Test
	public void verifyTitle()
	{
		LoginPage login = new LoginPage(driver);
		Assert.assertEquals(login.getTitle(),"OrangeHRM");		
	}
	@Test
	public void loginTest()
	{
		LoginPage login=new LoginPage(driver);
		DashboardPage dashboard = new DashboardPage(driver);
		
		login.login(user, pass);
		Assert.assertTrue(dashboard.isDashboardDisplayed());
	}
	@Test
	public void addEmployeeTest() {
        LoginPage login = new LoginPage(driver);
        PIMPage pim = new PIMPage(driver);

        login.login(user, pass);
        pim.addEmployee("John", "Smith");
    }

    @Test
    public void editMyInfoTest() {
        LoginPage login = new LoginPage(driver);
        MyinfoPage myInfo = new MyinfoPage(driver);

        login.login(user, pass);
        myInfo.editPersonalInfo("Orange User");
    }

    @Test
    public void verifyDirectoryTest() {
        LoginPage login = new LoginPage(driver);
        DashboardPage dashboard = new DashboardPage(driver);
        DirectoryPage directory = new DirectoryPage(driver);

        login.login(user, pass);
        dashboard.clickDirectory();
        Assert.assertEquals(directory.getHeadingText(), "Search Directory");
        
    }   //  @Test
       /* public void applyLeaveTest() {
            LoginPage login = new LoginPage(driver);
            MyinfoPage page = new MyinfoPage(driver);
            login.login(user, pass);
            page.applyLeave();
            
            
        
*/
}

