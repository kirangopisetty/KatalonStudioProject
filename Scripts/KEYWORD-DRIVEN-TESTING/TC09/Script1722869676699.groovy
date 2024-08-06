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

WebUI.scrollToPosition(0, 200)

WebUI.check(findTestObject('STQATOOLS_OR/READING-CHECKBOX'))

boolean isCheckedReadingCheckbox = WebUI.verifyElementChecked(findTestObject('STQATOOLS_OR/READING-CHECKBOX'), 5)

if (isCheckedReadingCheckbox == true) {
    println('The READING checkbox is selected by Katalon Studio during test execution & TC=PASSED')

    WebUI.takeScreenshot()
} else {
    println('The READING checkbox is not selected by Katalon Studio during test execution & TC=FAILED, closing the browser')

    WebUI.takeScreenshot()

    WebUI.closeBrowser()
}

WebUI.check(findTestObject('STQATOOLS_OR/TRAVELLING_CHECKBOX'))

boolean isCheckedTravellingCheckbox = WebUI.verifyElementChecked(findTestObject('STQATOOLS_OR/TRAVELLING_CHECKBOX'), 5)

if (isCheckedTravellingCheckbox == true) {
    println('The TRAVELLING checkbox is selected by Katalon Studio during test execution & TC=PASSED')

    WebUI.takeScreenshot()
} else {
    println('The TRAVELLING checkbox is not selected by Katalon Studio during test execution & TC=FAILED, closing the browser')

    WebUI.takeScreenshot()

    WebUI.closeBrowser()
}

WebUI.check(findTestObject('STQATOOLS_OR/MUSIC_CHECKBOX'))

boolean isCheckedMusicCheckbox = WebUI.verifyElementChecked(findTestObject('STQATOOLS_OR/MUSIC_CHECKBOX'), 5)

if (isCheckedMusicCheckbox == true) {
    println('The MUSIC checkbox is selected by Katalon Studio during test execution & TC=PASSED')

    WebUI.takeScreenshot()
} else {
    println('The MUSIC checkbox is not selected by Katalon Studio during test execution & TC=FAILED, closing the browser')

    WebUI.takeScreenshot()

    WebUI.closeBrowser()
}

if (isCheckedReadingCheckbox == true) {
    WebUI.uncheck(findTestObject('STQATOOLS_OR/READING-CHECKBOX'))
} else {
    WebUI.takeScreenshot()
}

boolean isUncheckedReadingCheckbox = WebUI.verifyElementNotChecked(findTestObject('STQATOOLS_OR/READING-CHECKBOX'), 4)

if (isUncheckedReadingCheckbox == true) {
    println('The READING checkbox is now deselected by Katalon Studio during test execution & TC=PASSED')

    WebUI.takeScreenshot()
} else {
    println('The READING checkbox is not selected & hence Katalon Studio cannot deselect it during test execution & TC=FAILED')

    WebUI.takeScreenshot()

    WebUI.closeBrowser()
}

if (isCheckedTravellingCheckbox == true) {
    WebUI.uncheck(findTestObject('STQATOOLS_OR/TRAVELLING_CHECKBOX'))
} else {
    WebUI.takeScreenshot()
}

boolean isUncheckedTravellingCheckbox = WebUI.verifyElementNotChecked(findTestObject('STQATOOLS_OR/TRAVELLING_CHECKBOX'), 
    4)

if (isUncheckedTravellingCheckbox == true) {
    println('The TRAVELLING checkbox is now deselected by Katalon Studio during test execution & TC=PASSED')

    WebUI.takeScreenshot()
} else {
    println('The TRAVELLING checkbox is not selected & hence Katalon Studio cannot deselect it during test execution & TC=FAILED')

    WebUI.takeScreenshot()

    WebUI.closeBrowser()
}

if (isCheckedMusicCheckbox == true) {
    WebUI.uncheck(findTestObject('STQATOOLS_OR/MUSIC_CHECKBOX'))
} else {
    WebUI.takeScreenshot()
}

boolean isUncheckedMusicCheckbox = WebUI.verifyElementNotChecked(findTestObject('STQATOOLS_OR/MUSIC_CHECKBOX'), 4)

if (isUncheckedMusicCheckbox == true) {
    println('The MUSIC checkbox is now deselected by Katalon Studio during test execution & TC=PASSED')

    WebUI.takeScreenshot()
} else {
    println('The MUSIC checkbox is not selected & hence Katalon Studio cannot deselect it during test execution & TC=FAILED')

    WebUI.takeScreenshot()

    WebUI.closeBrowser()
}

WebUI.closeBrowser()