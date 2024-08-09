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

WebUI.openBrowser('https://mdbootstrap.com/docs/standard/extended/multiselect/')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('Object Repository/MULTI-SELECT-DROPDOWN-OR/ACCEPT_COOKIES'))

WebUI.click(findTestObject('Object Repository/MULTI-SELECT-DROPDOWN-OR/DROP-DOWN-1'))

WebUI.click(findTestObject('MULTI-SELECT-DROPDOWN-OR/CHECKBOX_2'))

WebUI.click(findTestObject('MULTI-SELECT-DROPDOWN-OR/CHECKBOX_3'))

WebUI.click(findTestObject('MULTI-SELECT-DROPDOWN-OR/CHECKBOX_4'))

WebUI.check(findTestObject('MULTI-SELECT-DROPDOWN-OR/CHECKBOX_SELECT_ALL'))

WebUI.uncheck(findTestObject('MULTI-SELECT-DROPDOWN-OR/CHECKBOX_SELECT_ALL'))

