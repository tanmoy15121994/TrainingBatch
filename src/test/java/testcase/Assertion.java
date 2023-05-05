package testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Assignment;

public class Assertion {

	String pname = "Name:Tanmoy Mondal";
	String pemail = "Email:tanmoy@gmail.com";
	String pcurrent = "Current Address :Simform Solution Iscon";
	String ppermanent = "Permananet Address :Simform Solution Bopal";

	Assignment assignment = new Assignment();

	@BeforeMethod
	public void browser() {
		assignment.launchBrowser();
	}

	@Test
	public void validateData() throws InterruptedException {
		assignment.form();

		Assert.assertEquals(assignment.getName(), pname);
		Assert.assertEquals(assignment.getEmail(), pemail);
		Assert.assertEquals(assignment.getCurrentAddress(), pcurrent);
		Assert.assertEquals(assignment.getPermanentAddress(), ppermanent);
	}

	@AfterMethod
	public void quitBrowser() {
		assignment.closeBrowser();
	}

}
