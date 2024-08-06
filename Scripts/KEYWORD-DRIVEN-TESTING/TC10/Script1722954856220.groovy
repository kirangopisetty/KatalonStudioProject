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

WebUI.navigateToMaskedUrl('https://stqatools.com/demo/Register.php')

WebUI.scrollToPosition(0, 400)

WebUI.verifyOptionPresentByValue(findTestObject('STQATOOLS_OR/COUNTRY_DROPDOWN'), 'India', false, 4)

WebUI.verifyOptionPresentByLabel(findTestObject('STQATOOLS_OR/COUNTRY_DROPDOWN'), 'Canada', false, 4)

boolean countryOptions = WebUI.verifyOptionsPresent(findTestObject('STQATOOLS_OR/COUNTRY_DROPDOWN'), ['Select a country'
        , 'United States of America', 'Canada', 'United Kingdom', 'Australia', 'India'])

if (countryOptions == true) {
    println('The drop-down options present in the web application are as per SRS document & TC=PASSED')
} else {
    println('The drop-down options present in the web application are not as per SRS document & TC=FAILED')

    WebUI.closeBrowser()
}

int countOfCountryOptions = WebUI.getNumberOfTotalOption(findTestObject('STQATOOLS_OR/COUNTRY_DROPDOWN'))

if (countOfCountryOptions == 6) {
    println('The count of drop-down options present in the web application are 6 and as per SRS document & TC=PASSED')

    println('Count in Country drop down is ' + countOfCountryOptions)
} else {
    println('The count of drop-down options present in the web application are not 6 and as per SRS document & TC=FAILED')

    println('Count in Country drop down is ' + countOfCountryOptions)

    WebUI.closeBrowser()
}

WebUI.selectOptionByIndex(findTestObject('STQATOOLS_OR/COUNTRY_DROPDOWN'), 1)

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('STQATOOLS_OR/COUNTRY_DROPDOWN'), 'Canada', false)

WebUI.takeScreenshot()

WebUI.selectOptionByLabel(findTestObject('STQATOOLS_OR/COUNTRY_DROPDOWN'), 'United Kingdom', false)

WebUI.takeScreenshot()

WebUI.selectOptionByIndex(findTestObject('STQATOOLS_OR/COUNTRY_DROPDOWN'), 4)

WebUI.takeScreenshot()

WebUI.selectOptionByIndex(findTestObject('STQATOOLS_OR/COUNTRY_DROPDOWN'), 5)

WebUI.takeScreenshot()

boolean optionSelected = WebUI.verifyOptionSelectedByIndex(findTestObject('STQATOOLS_OR/COUNTRY_DROPDOWN'), 5, 4)

if (optionSelected == true) {
    println('Index 5=India is selected & TC=PASSED')
} else {
    println('Index 5=India is not selected & TC=FAILED')
}

