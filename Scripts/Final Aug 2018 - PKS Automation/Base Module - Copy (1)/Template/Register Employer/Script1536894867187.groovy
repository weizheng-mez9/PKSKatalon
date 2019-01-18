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

WebUI.setText(findTestObject('Final Object Repo/Login Page/Internal User/Email Address'), 'johorotc1@gmail.com')

WebUI.click(findTestObject('Final Object Repo/Login Page/Internal User/Next Button'))

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Final Object Repo/Login Page/Internal User/Password'), 'sYLXs9ykYixgExGrleETtQ==')

WebUI.click(findTestObject('Final Object Repo/Login Page/Internal User/Login Button'))

WebUI.delay(1)

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/web/base/portal-id/registration')

WebUI.setText(findTestObject('Final Object Repo/Creating Employer Account/Page_Registration - ASSIST (Base)/Employer Name'), 'AUTOMATION EMPLOYER')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Creating Employer Account/Page_Registration - ASSIST (Base)/Registration Type'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Creating Employer Account/Page_Registration - ASSIST (Base)/Registration Type - Registration No'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Creating Employer Account/Page_Registration - ASSIST (Base)/Registration Number'), '1234567890')

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Creating Employer Account/Page_Registration - ASSIST (Base)/Postal Address 1'), 'ADDRESS 1')

WebUI.setText(findTestObject('Final Object Repo/Creating Employer Account/Page_Registration - ASSIST (Base)/Postal Address 2'), 'ADDRESS 2')

WebUI.click(findTestObject('Final Object Repo/Creating Employer Account/Page_Registration - ASSIST (Base)/State'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Creating Employer Account/Page_Registration - ASSIST (Base)/State - Johor'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Creating Employer Account/Page_Registration - ASSIST (Base)/City'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Creating Employer Account/Page_Registration - ASSIST (Base)/City - joh'), 'joh')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Creating Employer Account/Page_Registration - ASSIST (Base)/City - Johor Bharu'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Creating Employer Account/Page_Registration - ASSIST (Base)/Post Code'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Creating Employer Account/Page_Registration - ASSIST (Base)/Post Code - 810'), '810')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Creating Employer Account/Page_Registration - ASSIST (Base)/Post Code - 81000'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Creating Employer Account/Page_Registration - ASSIST (Base)/Full Name'), 'PERKESO')

Random rnd = new Random()

int snum = rnd.nextInt(899999 + 1) + 100000

int tnum = rnd.nextInt(899999 + 1) + 100000

String IC = Integer.toString(snum) + Integer.toString(tnum)

System.out.println(IC)

WebUI.setText(findTestObject('Final Object Repo/Creating Employer Account/Page_Registration - ASSIST (Base)/Identification Number'), IC)

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Creating Employer Account/Page_Registration - ASSIST (Base)/Contact Number'), '123456789012')

GlobalVariable.Email = (('perkeso' + IC) + '@gmail.com')

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Create Employer Acc/Template/Employer Email Settler'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Creating Employer Account/Page_Registration - ASSIST (Base)/Email'), GlobalVariable.Email)

WebUI.setText(findTestObject('Final Object Repo/Creating Employer Account/Page_Registration - ASSIST (Base)/Security Phase'), '123')

WebUI.click(findTestObject('Final Object Repo/Creating Employer Account/Page_Registration - ASSIST (Base)/Save  Continue'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Creating Employer Account/Page_Registration - ASSIST (Base)/Add Document'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Creating Employer Account/Page_Registration - ASSIST (Base)/Document Type'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Creating Employer Account/Page_Registration - ASSIST (Base)/Document Type - Letter of Authorization'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Final Object Repo/Creating Employer Account/Page_Registration - ASSIST (Base)/Uploading File'), 'C:\\Users\\yuki\\Desktop\\Test.png')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Creating Employer Account/Page_Registration - ASSIST (Base)/Add Document in Uploading File'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Creating Employer Account/Page_Registration - ASSIST (Base)/Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Creating Employer Account/Page_Registration - ASSIST (Base)/Submit'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Creating Employer Account/Page_Registration - ASSIST (Base)/Confirm'))

