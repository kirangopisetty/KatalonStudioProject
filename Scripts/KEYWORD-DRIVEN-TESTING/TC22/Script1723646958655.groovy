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

WebUI.openBrowser('https://ui.vision/demo/webtest/frames/')

WebUI.maximizeWindow()

WebUI.switchToFrame(findTestObject('FRAMES_OR/FRAME1'), 2)

WebUI.setText(findTestObject('FRAMES_OR/TEXTBOX1'), 'FRAME1-YELLOW')

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('FRAMES_OR/FRAME2'), 2)

WebUI.setText(findTestObject('FRAMES_OR/TEXTBOX2'), 'FRAME2-GREEN')

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('FRAMES_OR/FRAME3'), 2)

WebUI.setText(findTestObject('FRAMES_OR/TEXTBOX3'), 'FRAME3-BLUE')

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('FRAMES_OR/FRAME4'), 2)

WebUI.setText(findTestObject('FRAMES_OR/TEXTBOX4'), 'FRAME4-GREY')

