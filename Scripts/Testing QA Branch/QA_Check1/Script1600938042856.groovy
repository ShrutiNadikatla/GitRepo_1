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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.uworld.com/')

WebUI.click(findTestObject('Object Repository/Page_UWorld  Test Prep for NCLEX, SAT, ACT,_0b6352/i__fal fa-user fa-custom-size float-right h_ffd06b'))

WebUI.click(findTestObject('Object Repository/Page_UWorld - Login/label_Email'))

WebUI.setText(findTestObject('Object Repository/Page_UWorld - Login/input_Sign in using your UWorld account_log_afcf45'), 
    'snadikatla@uworld.in')

WebUI.click(findTestObject('Object Repository/Page_UWorld - Login/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_UWorld - Login/input_Email_login-password'), 'aN2yfCuWoe/LDA5CzQwHCg==')

WebUI.sendKeys(findTestObject('Object Repository/Page_UWorld - Login/input_Email_login-password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_UWorld - My Account/div_STEP3 QBank'))

WebUI.click(findTestObject('Object Repository/Page_UWorld - My Account/button_Launch'))

WebUI.click(findTestObject('Object Repository/Page_UWorld STEP3 QBank/span_Welcome'))

WebUI.click(findTestObject('Object Repository/Page_UWorld STEP3 QBank/span_Search'))

WebUI.click(findTestObject('Object Repository/Page_UWorld STEP3 QBank/span_Log out'))

WebUI.click(findTestObject('Object Repository/Page_UWorld STEP3 QBank/button_Yes'))

WebUI.closeBrowser()

