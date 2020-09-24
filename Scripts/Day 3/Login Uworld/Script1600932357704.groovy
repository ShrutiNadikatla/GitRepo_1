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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.uworld.com/')

WebUI.click(findTestObject('Object Repository/Uworld Objects/Page_UWorld  Test Prep for NCLEX, SAT, ACT,_0b6352/i__fal fa-user fa-custom-size float-right h_ffd06b'))

WebUI.click(findTestObject('Object Repository/Uworld Objects/Page_UWorld - Login/label_Email'))

WebUI.setText(findTestObject('Object Repository/Uworld Objects/Page_UWorld - Login/input_Sign in using your UWorld account_log_afcf45'), 
    'snadikatla@uworld.in')

WebUI.click(findTestObject('Object Repository/Uworld Objects/Page_UWorld - Login/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Uworld Objects/Page_UWorld - Login/input_Email_login-password'), 
    'aN2yfCuWoe/LDA5CzQwHCg==')

WebUI.click(findTestObject('Object Repository/Uworld Objects/Page_UWorld - Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Uworld Objects/Page_UWorld - My Account/div_STEP1 QBank'))

WebUI.click(findTestObject('Object Repository/Uworld Objects/Page_UWorld - My Account/button_Launch'))

WebUI.click(findTestObject('Object Repository/Uworld Objects/Page_UWorld STEP1 QBank/h1_Welcome                                 _29c108'))

WebUI.verifyTextPresent('Welcome Shruti Nadikatla', false)

WebUI.closeBrowser()

