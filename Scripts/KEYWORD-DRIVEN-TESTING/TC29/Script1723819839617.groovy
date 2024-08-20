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

WebUI.openBrowser('https://stqatools.com/demo/Register.php')

isIdPresent = WebUI.verifyElementHasAttribute(findTestObject('REGISTRATION_FORM_OR/NAME-TEXTBOX'), 'id', 2)

isNamePresent = WebUI.verifyElementHasAttribute(findTestObject('REGISTRATION_FORM_OR/NAME-TEXTBOX'), 'name', 2)

isTypePresent = WebUI.verifyElementHasAttribute(findTestObject('REGISTRATION_FORM_OR/NAME-TEXTBOX'), 'type', 2)

println('ID attribute is present: ' + isIdPresent)

println('Name attribute is present: ' + isNamePresent)

println('Type attribute is present: ' + isTypePresent)

isIdValueCorrect = WebUI.verifyElementAttributeValue(findTestObject('REGISTRATION_FORM_OR/NAME-TEXTBOX'), 'id', 'name', 
    1)

isNameValueCorrect = WebUI.verifyElementAttributeValue(findTestObject('REGISTRATION_FORM_OR/NAME-TEXTBOX'), 'name', 'name', 
    1)

isTypeValueCorrect = WebUI.verifyElementAttributeValue(findTestObject('REGISTRATION_FORM_OR/NAME-TEXTBOX'), 'type', 'text', 
    1)

println('is ID attribute value correct: ' + isIdValueCorrect)

println('is Name attribute value correct: ' + isNameValueCorrect)

println('is Type attribute value correct: ' + isTypeValueCorrect)

isXpathAbsent = WebUI.verifyElementNotHasAttribute(findTestObject('REGISTRATION_FORM_OR/NAME-TEXTBOX'), 'xpath', 1)

isCssAbsent = WebUI.verifyElementNotHasAttribute(findTestObject('REGISTRATION_FORM_OR/NAME-TEXTBOX'), 'css', 1)

println('Is xpath attribute not present for NAME textbox : ' + isXpathAbsent)

println('Is css attribute not present for NAME textbox : ' + isCssAbsent)

