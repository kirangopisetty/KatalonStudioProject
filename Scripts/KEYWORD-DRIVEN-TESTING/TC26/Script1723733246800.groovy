import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://stqatools.com/demo/Register.php')

WebUI.maximizeWindow()

nameHeight = WebUI.getElementHeight(findTestObject('REGISTRATION_FORM_OR/NAME-TEXTBOX'))

nameWidth = WebUI.getElementWidth(findTestObject('REGISTRATION_FORM_OR/NAME-TEXTBOX'))

nameFontSize = WebUI.getCSSValue(findTestObject('REGISTRATION_FORM_OR/NAME-TEXTBOX'), 'font-size')

System.out.println('The height is ' + nameHeight)

println('The width is ' + nameWidth)

WebUI.comment(nameFontSize)

nameType = WebUI.getAttribute(findTestObject('REGISTRATION_FORM_OR/NAME-TEXTBOX'), 'type')

nameId = WebUI.getAttribute(findTestObject('REGISTRATION_FORM_OR/NAME-TEXTBOX'), 'id')

nameName = WebUI.getAttribute(findTestObject('REGISTRATION_FORM_OR/NAME-TEXTBOX'), 'name')

nameXpath = WebUI.getAttribute(findTestObject('REGISTRATION_FORM_OR/NAME-TEXTBOX'), 'xpath')

nameCSS = WebUI.getAttribute(findTestObject('REGISTRATION_FORM_OR/NAME-TEXTBOX'), 'css')

println("The id is "+nameId)
println("The type is "+nameType)
println("The name is "+nameName)
println("The xpath is "+nameXpath)
println("The css is "+nameCSS)