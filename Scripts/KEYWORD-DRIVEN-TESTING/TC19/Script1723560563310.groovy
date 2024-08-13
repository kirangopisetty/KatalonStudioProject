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

WebUI.openBrowser('https://cgi-lib.berkeley.edu/ex/fup.html')

WebUI.maximizeWindow()

WebUI.uploadFile(findTestObject('FILE_UPLOAD_OR/CHOOSE_FILE_BUTTON'), 'C:\\Users\\Kiran\\Downloads\\temp.txt')

WebUI.setText(findTestObject('FILE_UPLOAD_OR/NOTES_TEXTBOX'), 'This is file upload testing')

WebUI.takeScreenshot()

WebUI.click(findTestObject('FILE_UPLOAD_OR/PRESS_BUTTON'))

WebUI.takeScreenshot()

WebUI.verifyTextPresent('File Upload Results', false)

WebUI.verifyTextPresent('You\'ve uploaded a file', false)

WebUI.delay(4)

WebUI.closeBrowser()

