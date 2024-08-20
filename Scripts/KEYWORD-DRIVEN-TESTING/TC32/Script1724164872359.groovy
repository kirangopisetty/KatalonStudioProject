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

WebUI.openBrowser('https://stqatools.com/demo/fileupload.php')

WebUI.maximizeWindow()

WebUI.setViewPortSize(260, 310)

status2 = WebUI.verifyElementNotInViewport(findTestObject('FILE_UPLOAD_OR/CHOOSE_FILE'), 0)

println('Verify Element not in ViewPort and its status = ' + status2)

status1 = WebUI.verifyElementNotVisible(findTestObject('FILE_UPLOAD_OR/CHOOSE_FILE'))

println('Verify Element not visible and its status = ' + status1)

status3 = WebUI.verifyElementVisible(findTestObject('FILE_UPLOAD_OR/CHOOSE_FILE'))

println('Verify Element not in ViewPort and its status = ' + status3)

status4 = WebUI.verifyElementInViewport(findTestObject('FILE_UPLOAD_OR/CHOOSE_FILE'), 2)

println('Verify Element in ViewPort and its status = ' + status4)

