import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/profile.php#login')

WebUI.setText(findTestObject('HEALTHCARE_APP_OR/UN'), 'John Doe')

WebUI.setEncryptedText(findTestObject('HEALTHCARE_APP_OR/PWD'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('HEALTHCARE_APP_OR/LOGIN_BUTTON'))

WebUI.selectOptionByValue(findTestObject('HEALTHCARE_APP_OR/FACILITY_DROPDOWN'), 'Hongkong CURA Healthcare Center', false)

WebUI.check(findTestObject('HEALTHCARE_APP_OR/CHECKBOX'))

WebUI.click(findTestObject('HEALTHCARE_APP_OR/MEDICAID'))

WebUI.setText(findTestObject('HEALTHCARE_APP_OR/VISIT_DATE'), '30/08/2024')

WebUI.setText(findTestObject('HEALTHCARE_APP_OR/COMMENT'), 'Body pains & fever issues')

WebUI.click(findTestObject('HEALTHCARE_APP_OR/BOOK_APPT_BUTTON'))

boolean textPresent = WebUI.verifyTextPresent('Appointment Confirmation', false)

if (textPresent==true) {

	WebUI.click(findTestObject('HEALTHCARE_APP_OR/MENU'))

	WebUI.click(findTestObject('HEALTHCARE_APP_OR/LOGOUT'))

	println("The appointment is booked & TC=PASSED")
		WebUI.deleteAllCookies()

	WebUI.closeBrowser()
}

else {
	println("The appointment is not booked & TC=FAILED")
}
