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

'Opens an empty browser'
WebUI.openBrowser('')

'Takes the user to the specified URL'
WebUI.navigateToUrl('https://www.ekhartyoga.com/')

WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

'Left click on the link specified'
WebUI.click(findTestObject('YOGA_OR/CLASSES-LINK'))

'Left click on the link specified'
WebUI.click(findTestObject('YOGA_OR/PROGRAMS-LINK'))

'Left click on the link specified'
WebUI.click(findTestObject('YOGA_OR/TEACHERS-LINK'))

'Left click on the link specified'
WebUI.click(findTestObject('YOGA_OR/ARTICLES-LINK'))

'Left click on the link specified'
WebUI.click(findTestObject('YOGA_OR/RESOURCES-LINK'))

'Left click on the link specified'
WebUI.click(findTestObject('YOGA_OR/SIGN-IN-LINK'))

'Enter the specified text in the email textbox'
WebUI.setText(findTestObject('YOGA_OR/EMAIL-TEXTBOX'), 'tiger@lion.com')

'Enter the specified text in the password textbox'
WebUI.setText(findTestObject('YOGA_OR/PASSWORD-TEXTBOX'), 'welcometojungle')

'Click on the SIGN IN button'
WebUI.click(findTestObject('YOGA_OR/SIGN-IN-BUTTON'))

'Verify if the specified text is present anywhere in the web-page, after SIGN IN button is clicked'
WebUI.verifyTextPresent('Invalid username or password', false)

'Deletes all the incoming cookies received from the web application visited by the user'
WebUI.deleteAllCookies(FailureHandling.OPTIONAL)

'Close the browser, which is opened by Katalon Studio in the step#1'
WebUI.closeBrowser()

