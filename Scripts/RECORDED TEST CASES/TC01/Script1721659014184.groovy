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

'This keyword will launch an empty browser'
WebUI.openBrowser('')

'This keyword will take the user to the specified website mentioned in Input column'
WebUI.navigateToUrl('https://mindmajix.com/')

WebUI.click(findTestObject('Object Repository/MINDMAJIX_OR/CORPORATE-TRAINING-LINK'))

WebUI.delay(1)

WebUI.switchToWindowTitle('Corporate Training Programs | Online Courses - MindMajix')

WebUI.click(findTestObject('Object Repository/MINDMAJIX_OR/BECOME-INSTRUCTOR-LINK'))

WebUI.delay(1)

WebUI.switchToWindowTitle('Become an Instructor - Mindmajix')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/MINDMAJIX_OR/BLOG-LINK'))

WebUI.delay(1)

WebUI.switchToWindowTitle('Technology & IT Related Blog - Free Resources to Upskill - MindMajix')

WebUI.click(findTestObject('Object Repository/MINDMAJIX_OR/LOGIN-LINK'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/MINDMAJIX_OR/EMAIL-TEXTBOX'), 'tiger@lion.com')

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Object Repository/MINDMAJIX_OR/PASSWORD-TEXTBOX'), 'Uu/737mHRuLPNq5OuYQEZQ==')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/MINDMAJIX_OR/SUBMIT_BUTTON'))

WebUI.delay(1)

'This keyword will close the browser which is opened by the tool for test execution'
WebUI.closeBrowser()

