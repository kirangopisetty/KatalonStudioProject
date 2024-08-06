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

WebUI.openBrowser('https://mindmajix.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('MINDMAJIX_OR/CORPORATE-TRAINING-LINK'))

WebUI.click(findTestObject('MINDMAJIX_OR/BECOME-INSTRUCTOR-LINK'))

WebUI.switchToWindowIndex(0)

WebUI.setText(findTestObject('MINDMAJIX_OR/SEARCH-TEXTBOX'), 'Python')

WebUI.submit(findTestObject('MINDMAJIX_OR/SEARCH-TEXTBOX'))

WebUI.takeScreenshot()

WebUI.switchToWindowUrl('https://mindmajix.com/corporate-training')

WebUI.enhancedClick(findTestObject('MINDMAJIX_OR/CONNECT-WITH-US'))

WebUI.setText(findTestObject('MINDMAJIX_OR/NAME1-TEXTBOX'), 'Suchitra')

WebUI.setText(findTestObject('MINDMAJIX_OR/EMAIL1-TEXTBOX'), 'suchitra@outlook.com')

WebUI.setText(findTestObject('MINDMAJIX_OR/PHONE-NUMBER1-TEXTBOX'), '9849098490')

WebUI.setText(findTestObject('MINDMAJIX_OR/MESSSAGE1-TEXTBOX'), 'Looking for Python course training')

WebUI.click(findTestObject('MINDMAJIX_OR/SUBMIT1-BUTTON'))

WebUI.takeScreenshot()

WebUI.switchToWindowUrl('https://mindmajix.com/instructor')

WebUI.doubleClick(findTestObject('MINDMAJIX_OR/LOGIN-BUTTON'))

WebUI.setText(findTestObject('MINDMAJIX_OR/EMAIL2-TEXTBOX'), 'suchitra@yahoo.com')

WebUI.setEncryptedText(findTestObject('MINDMAJIX_OR/PASSWORD1-TEXTBOX'), '7wFlgnUX2ogkUr+lMWin+A==')

WebUI.takeScreenshot()

WebUI.click(findTestObject('MINDMAJIX_OR/SUBMIT2-BUTTON'))

WebUI.takeScreenshot()

WebUI.closeWindowIndex(2)

WebUI.closeWindowIndex(1)

WebUI.closeWindowIndex(0)

