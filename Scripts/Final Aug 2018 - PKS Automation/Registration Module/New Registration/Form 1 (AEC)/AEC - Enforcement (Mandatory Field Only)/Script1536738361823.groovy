import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/login')

WebUI.setText(findTestObject('Final Object Repo/Registration/Page_login - ASSIST/Email Address'), 'johorotc1@gmail.com')

WebUI.click(findTestObject('Final Object Repo/Registration/Page_login - ASSIST/Next Button'))

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Final Object Repo/Registration/Page_login - ASSIST/Password'), 'sYLXs9ykYixgExGrleETtQ==')

WebUI.click(findTestObject('Final Object Repo/Registration/Page_login - ASSIST/Login Button'))

WebUI.delay(1)

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/web/registration/registration')

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/EC - Yes'))

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/AEC Source'))

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/AEC Source - Enforcement'))

WebUI.setText(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Industry name'), 'perkeso')

WebUI.setText(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Postal Address1'), 'perkeso1')

WebUI.setText(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Postal Address2'), 'perkeso2')

WebUI.setText(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Postal Address3'), 'perkeso3')

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/State'))

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/State - Johor'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/City'))

WebUI.setText(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Postcode - 810'), 'joh')

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/City - Johor Bharu'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Postcode'))

WebUI.delay(1)

WebUI.setText(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Postcode - 810'), '810')

WebUI.delay(3)

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Postcode - 81000'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/SOCSO Office Location'))

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/SOCSO Office Location - Pejabat PERKESO Negeri Johor'))

WebUI.delay(1)

WebUI.check(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Indusrty Address Same As Postal Address'))

WebUI.delay(3)

WebUI.click(findTestObject('Final Object Repo/Registration/Page_Registration - ASSIST/Save  Continue'))

