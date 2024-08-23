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

testResult1 = WebUI.verifyEqual(10, 10)

println("Verify Equal: "+testResult1)

testResult2 = WebUI.verifyGreaterThan(10, 9)

println("Verify Greather than: "+testResult2)

testResult3 = WebUI.verifyGreaterThanOrEqual(10, 10)

println("Verify Greater than or equal: "+testResult3)

testResult4 = WebUI.verifyLessThan(8, 14)

println("Verify Less than: "+testResult4)

testResult5 = WebUI.verifyLessThanOrEqual(9, 11)

println("Verify Less than or equal: "+testResult5)

testResult6 = WebUI.verifyNotEqual(8, 4)

println("Verify Not equal: "+testResult6)

