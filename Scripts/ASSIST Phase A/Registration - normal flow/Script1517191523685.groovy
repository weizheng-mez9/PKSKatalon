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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://assist-uat.perkeso.gov.my')

WebUI.setText(findTestObject('Final Object Repo/Login Page/External Login Page/Email'), 'klotc3@gmail.com')

WebUI.click(findTestObject('Registration/Page_login - ASSIST/Next Btn'))

WebUI.setText(findTestObject('Registration/Page_login - ASSIST/pw input'), 'Test1@3456789')

WebUI.click(findTestObject('Registration/Page_login - ASSIST/login btn'))

WebUI.click(findTestObject('Registration/Page_MyASSIST - ASSIST/My Site Drop Down'))

WebUI.click(findTestObject('Registration/Page_MyASSIST - ASSIST/MySite-Registration'))

WebUI.click(findTestObject('Registration/Page_MyASSIST - ASSIST/Registration Tab'))

WebUI.click(findTestObject('Registration/Page_Registration - ASSIST/AEC radio'))

WebUI.click(findTestObject('Registration/Page_Registration - ASSIST/Business Entity Span'))

WebUI.click(findTestObject('Registration/Page_Registration - ASSIST/Business Entity - Corporation'))

WebUI.delay(2)

WebUI.click(findTestObject('Registration/Page_Registration - ASSIST/Page_Registration - ASSIST/Sub Business Entity Span'))

WebUI.click(findTestObject('Registration/Page_Registration - ASSIST/Page_Registration - ASSIST/Sub Business Entity Sdn Bhd'))

WebUI.delay(2)

WebUI.setText(findTestObject('Registration/Page_Registration - ASSIST/Registration Number Input'), 'DXS102991093')

WebUI.click(findTestObject('Registration/Page_Registration - ASSIST/Registered with SSM radio'))

WebUI.click(findTestObject('Registration/Page_Registration - ASSIST/Registering As Branch radio'))

WebUI.setText(findTestObject('Registration/Page_Registration - ASSIST/Industry Name Input'), 'Dallas Xelement supreme sdn bhd')

WebUI.setText(findTestObject('Registration/Page_Registration - ASSIST/Postal Address Line 1'), 'Dallas 1')

WebUI.setText(findTestObject('Registration/Page_Registration - ASSIST/Postal Address Line 2'), 'Dallas 2')

WebUI.setText(findTestObject('Registration/Page_Registration - ASSIST/Postal Address Line 3'), 'Dallas 3')

WebUI.click(findTestObject('Registration/Page_Registration - ASSIST/State Selection'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 1/State - Johor'))

WebUI.delay(2)

WebUI.click(findTestObject('Registration/Page_Registration - ASSIST/City Selection'))

WebUI.setText(findTestObject('Registration/Page_Registration - ASSIST/City Search - Johor Bahru'), 'JOH')

WebUI.delay(1)

WebUI.click(findTestObject('Registration/Page_Registration - ASSIST/City - Select JB'))

WebUI.delay(2)

WebUI.click(findTestObject('Registration/Page_Registration - ASSIST/Page_Registration - ASSIST (1)/PostCode Selection'))

WebUI.setText(findTestObject('Registration/Page_Registration - ASSIST/City Search - Johor Bahru'), '810')

WebUI.delay(2)

WebUI.click(findTestObject('Registration/Page_Registration - ASSIST/PostCode Input'))

WebUI.delay(2)

WebUI.click(findTestObject('Registration/Page_Registration - ASSIST/Socso Office DropDown'))

WebUI.delay(2)

WebUI.click(findTestObject('Registration/Page_Registration - ASSIST/Socso Office Selection JB'))

WebUI.click(findTestObject('Registration/Page_Registration - ASSIST/input__newreg_WAR_registration_4'))

WebUI.closeBrowser()

