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

WebUI.navigateToUrl('https://mindmajix.com/write-for-us')

WebUI.maximizeWindow()

WebUI.scrollToPosition(0, 1400)

WebUI.click(findTestObject('MINDMAJIX_OR/SUBMIT-YOUR-INTEREST-BUTTON'))

WebUI.setText(findTestObject('MINDMAJIX_OR/NAME-TEXTBOX'), 'Lion')

WebUI.setText(findTestObject('MINDMAJIX_OR/EMAIL2-TEXTBOX'), 'lion@jungle.com')

WebUI.setText(findTestObject('MINDMAJIX_OR/PHONE-TEXTBOX'), '1010101010')

WebUI.setText(findTestObject('MINDMAJIX_OR/MESSAGE-TEXTBOX'), 'Lion is the king of the Jungle')

WebUI.click(findTestObject('MINDMAJIX_OR/SUBMIT2-BUTTON'))

WebUI.verifyTextPresent('Thanks you for the details.', false)

def screenshotPath = WebUI.takeScreenshot()

println('The screenshot is taken & available at : ' + screenshotPath)

WebUI.deleteAllCookies()

WebUI.closeBrowser()

