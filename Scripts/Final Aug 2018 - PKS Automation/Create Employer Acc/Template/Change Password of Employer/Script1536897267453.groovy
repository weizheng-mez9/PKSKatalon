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

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/login')

WebUI.delay(5)

WebUI.setText(findTestObject('Final Object Repo/Login Page/Internal User/Email Address'), 'test@liferay.com')

WebUI.click(findTestObject('Final Object Repo/Login Page/Internal User/Next Button'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Login Page/Internal User/Password'), 'test')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Login Page/Internal User/Login Button'))

WebUI.delay(3)

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/group/control_panel/manage?p_p_id=125&p_p_lifecycle=0&p_p_state=maximized&p_p_mode=view&refererPlid=20455&_125_usersListView=flat-users&_125_toolbarItem=view-all-users&_125_saveUsersListView=true&_125_struts_action=%2Fusers_admin%2Fview')

WebUI.delay(3)

WebUI.setText(findTestObject('Final Object Repo/Creating Employer Account/Page_Users and Organizations - ASSIST/Employer name'), 
    GlobalVariable.Email)

WebUI.delay(3)

WebUI.click(findTestObject('Final Object Repo/Creating Employer Account/Page_Users and Organizations - ASSIST/Search'))

WebUI.delay(3)

WebUI.click(findTestObject('Final Object Repo/Creating Employer Account/Page_Users and Organizations - ASSIST/Action'))

WebUI.delay(3)

WebUI.click(findTestObject('Final Object Repo/Creating Employer Account/Page_Users and Organizations - ASSIST/Edit'))

WebUI.delay(3)

WebUI.click(findTestObject('Final Object Repo/Creating Employer Account/Page_PERKESO - Users and Organizati/a_Password (Modified)'))

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('Final Object Repo/Creating Employer Account/Page_PERKESO - Users and Organizati/input__125_password1'), 
    'sYLXs9ykYiyIzLMk/U5GdA==')

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('Final Object Repo/Creating Employer Account/Page_PERKESO - Users and Organizati/input__125_password2'), 
    'sYLXs9ykYiyIzLMk/U5GdA==')

WebUI.delay(3)

WebUI.click(findTestObject('Final Object Repo/Creating Employer Account/Page_PERKESO - Users and Organizati/Save'))

