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

WebUI.setText(findTestObject('Final Object Repo/Login Page/Internal User/Email Address'), 'johorotc1@gmail.com')

WebUI.click(findTestObject('Final Object Repo/Login Page/Internal User/Next Button'))

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Final Object Repo/Login Page/Internal User/Password'), 'sYLXs9ykYixgExGrleETtQ==')

WebUI.click(findTestObject('Final Object Repo/Login Page/Internal User/Login Button'))

WebUI.delay(1)

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/web/registration/update/update-director/owner-information')

WebUI.setText(findTestObject('Final Object Repo/Page_Update DirectorOwner Information/Employer Code'), 'E1102001065V')

WebUI.click(findTestObject('Final Object Repo/Page_Update DirectorOwner Information/Search'))

WebUI.click(findTestObject('Final Object Repo/Page_Update DirectorOwner Information/Edit'))

WebUI.delay(3)

WebUI.click(findTestObject('Final Object Repo/Page_Update DirectorOwner Information/Add Director'))

WebUI.click(findTestObject('Final Object Repo/Page_Update DirectorOwner Information/Identification Type'))

WebUI.click(findTestObject('Final Object Repo/Page_Update DirectorOwner Information/Identification Type - IC'))

WebUI.setText(findTestObject('Final Object Repo/Page_Update DirectorOwner Information/IC Number'), '123456789012')

WebUI.setText(findTestObject('Final Object Repo/Page_Update DirectorOwner Information/input_DirectorOwner Name__sear'), 'perkeso')

WebUI.sendKeys(findTestObject('Final Object Repo/Page_Update DirectorOwner Information/Address1'), 'address1')

WebUI.sendKeys(findTestObject('Final Object Repo/Page_Update DirectorOwner Information/Address2'), 'address2')

WebUI.setText(findTestObject('Final Object Repo/Page_Update DirectorOwner Information/Address3'), 'address3')

WebUI.click(findTestObject('Final Object Repo/Page_Update DirectorOwner Information/State'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update DirectorOwner Information/State - Johor'))

WebUI.click(findTestObject('Final Object Repo/Page_Update DirectorOwner Information/City'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Page_Update DirectorOwner Information/City - joh'), 'joh')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update DirectorOwner Information/span_JOHOR BAHRU'))

WebUI.click(findTestObject('Final Object Repo/Page_Update DirectorOwner Information/PostCode'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Page_Update DirectorOwner Information/Post Code'), '810')

WebUI.delay(3)

WebUI.click(findTestObject('Final Object Repo/Page_Update DirectorOwner Information/span_81000'))

WebUI.setText(findTestObject('Final Object Repo/Page_Update DirectorOwner Information/input_P.O. Box'), '100')

WebUI.setText(findTestObject('Final Object Repo/Page_Update DirectorOwner Information/Locked Bag No'), '100')

WebUI.setText(findTestObject('Final Object Repo/Page_Update DirectorOwner Information/Telephone Number'), '123456789')

WebUI.setText(findTestObject('Final Object Repo/Page_Update DirectorOwner Information/Mobile Number'), '123456789')

WebUI.setText(findTestObject('Final Object Repo/Page_Update DirectorOwner Information/Fax Number'), '123456789')

WebUI.setText(findTestObject('Final Object Repo/Page_Update DirectorOwner Information/Email'), 'perkeso@gmail.com')

WebUI.click(findTestObject('Final Object Repo/Page_Update DirectorOwner Information/Marital Status'))

WebUI.click(findTestObject('Final Object Repo/Page_Update DirectorOwner Information/span_Widow  Widower'))

WebUI.click(findTestObject('Final Object Repo/Page_Update DirectorOwner Information/a_SAVE'))

