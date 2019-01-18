import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/employer/login')

WebUI.delay(3)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Create Employer Acc/Template/Employer Email Getter'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Final Object Repo/Login Page/External Login Page/Email'), GlobalVariable.Email)

WebUI.click(findTestObject('Final Object Repo/Login Page/External Login Page/Next'))

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('Final Object Repo/Login Page/External Login Page/Password'), 'sYLXs9ykYiyIzLMk/U5GdA==')

WebUI.click(findTestObject('Final Object Repo/Login Page/External Login Page/Login'))

WebUI.delay(3)

WebUI.click(findTestObject('Final Object Repo/Creating Employer Account/Page_Terms of Use - ASSIST/button_I Agree'))

WebUI.delay(2)

WebUI.setEncryptedText(findTestObject('Final Object Repo/Creating Employer Account/Page_New Password - ASSIST/input_password1'), 'sYLXs9ykYixgExGrleETtQ==')

WebUI.setEncryptedText(findTestObject('Final Object Repo/Creating Employer Account/Page_New Password - ASSIST/input_password2'), 'sYLXs9ykYixgExGrleETtQ==')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Creating Employer Account/Page_New Password - ASSIST/Save'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Creating Employer Account/Page_Password Reminder - ASSIST/Reminder Query Answer'), 'test')

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Final Object Repo/Creating Employer Account/Page_Password Reminder - ASSIST/Save'))

