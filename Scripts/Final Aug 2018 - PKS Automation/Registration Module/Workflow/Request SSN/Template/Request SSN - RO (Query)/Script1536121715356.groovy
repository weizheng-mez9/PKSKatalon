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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/login')

not_run: WebUI.setText(findTestObject('Final Object Repo/Login Page/Internal User/Email Address'), 'johorro1@gmail.com')

not_run: WebUI.click(findTestObject('Final Object Repo/Login Page/Internal User/Next Button'))

not_run: WebUI.delay(1)

not_run: WebUI.setEncryptedText(findTestObject('Final Object Repo/Login Page/Internal User/Password'), 'sYLXs9ykYixgExGrleETtQ==')

not_run: WebUI.click(findTestObject('Final Object Repo/Login Page/Internal User/Login Button'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Final Object Repo/Page_MyASSIST - ASSIST - Search Pending Case For Add Supporting Document/Search Information'))

not_run: WebUI.delay(3)

not_run: WebUI.sendKeys(findTestObject('Final Object Repo/Page_MyASSIST - ASSIST - Search Pending Case For Add Supporting Document/Reference No'), 'SSN08201800001039')

not_run: WebUI.click(findTestObject('Final Object Repo/Page_MyASSIST - ASSIST - Search Pending Case For Add Supporting Document/Search Reference No'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Final Object Repo/Page_MyASSIST - ASSIST - Search Pending Case For Add Supporting Document/Continue'))

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Page_Request SSN - ASSIST - RO/Approval For SSN'))

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Page_Request SSN - ASSIST - RO/Approval For SSN - Approve'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Page_Request SSN - ASSIST - RO/Save  Continue in SSN Page'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Page_Request SSN - ASSIST - RO/Page_Request SSN - ASSIST  (Query)/Remark'), 'Query')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Page_Request SSN - ASSIST - RO/Save  Continue in Uploading Document Page'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Page_Request SSN - ASSIST - RO/Page_Request SSN - ASSIST  (Query)/Query'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Page_Request SSN - ASSIST - RO/Page_Request SSN - ASSIST  (Query)/Confirm'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Page_Request SSN - ASSIST - RO/Page_Request SSN - ASSIST  (Query)/Message Case Is Under Query'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Final Object Repo/Page_Request SSN - ASSIST/Page_Request SSN - ASSIST - RO/Page_Request SSN - ASSIST  (Query)/Letter of inquiry'))

