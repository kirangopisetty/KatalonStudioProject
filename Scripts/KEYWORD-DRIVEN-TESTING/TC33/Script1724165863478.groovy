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

WebUI.openBrowser('https://stqatools.com/demo/index.php')

WebUI.maximizeWindow()

status1 = WebUI.verifyElementPresent(findTestObject('STQATOOLS_OR/LOGIN_BUTTON'), 2)

println('Verify Login button element present: ' + status1)

status2 = WebUI.verifyElementText(findTestObject('STQATOOLS_OR/LOGIN_BUTTON'), 'Login')

println('Verify Login button element text : ' + status2)

status3 = WebUI.verifyElementVisible(findTestObject('STQATOOLS_OR/LOGIN_BUTTON'))

println('Verify Login button visible : ' + status3)

status4 = WebUI.verifyElementNotPresent(findTestObject('STQATOOLS_OR/LOGIN_BUTTON'), 2)

println('Verify Login button element is not present: ' + status4)

status5 = WebUI.verifyElementNotVisible(findTestObject('STQATOOLS_OR/LOGIN_BUTTON'))

println('Verify Login button not visible: ' + status5)
