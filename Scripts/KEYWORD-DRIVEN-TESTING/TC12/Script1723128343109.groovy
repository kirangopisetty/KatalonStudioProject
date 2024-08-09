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

WebUI.navigateToUrl('https://stqatools.com/demo/Register.php')

WebUI.setText(findTestObject('STQATOOLS DEMO_OR/NAME'), 'KatalonStudio')

WebUI.setMaskedText(findTestObject('STQATOOLS DEMO_OR/ADDRESS'), 'Automation World')

WebUI.click(findTestObject('STQATOOLS DEMO_OR/GENDER_FEMALE'))

WebUI.click(findTestObject('STQATOOLS DEMO_OR/GENDER_MALE'))

WebUI.scrollToPosition(0, 500)

WebUI.check(findTestObject('STQATOOLS DEMO_OR/MUSIC_CHECKBOX'))

WebUI.check(findTestObject('STQATOOLS DEMO_OR/READING_CHECKBOX'))

WebUI.check(findTestObject('STQATOOLS DEMO_OR/TRAVELLING_CHECKBOX'))

WebUI.selectOptionByValue(findTestObject('STQATOOLS DEMO_OR/COUNTRY_DROPDOWN'), 'Australia', false)

WebUI.selectOptionByIndex(findTestObject('STQATOOLS DEMO_OR/COUNTRY_DROPDOWN'), 3)

WebUI.selectOptionByLabel(findTestObject('STQATOOLS DEMO_OR/COUNTRY_DROPDOWN'), 'United States of America', false)

WebUI.selectOptionByIndex(findTestObject('STQATOOLS DEMO_OR/CITY_DROPDOWN'), 2)

WebUI.selectOptionByLabel(findTestObject('STQATOOLS DEMO_OR/CITY_DROPDOWN'), 'London', false)

WebUI.selectOptionByValue(findTestObject('STQATOOLS DEMO_OR/CITY_DROPDOWN'), 'Mumbai', false)

WebUI.setText(findTestObject('STQATOOLS DEMO_OR/DOB'), '01-02-1980')

WebUI.click(findTestObject('STQATOOLS DEMO_OR/SUBMIT_BUTTON'))

WebUI.delay(5)

WebUI.deleteAllCookies()

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

