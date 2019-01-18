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

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Workflow/Form 1A - Cessation As Employer/Template/Form 1 A - Cessation As Employer (OTC)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/c/portal/logout')

WebUI.delay(1)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/Workflow Owner Finder'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/c/portal/logout')

WebUI.delay(1)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration/Login and Search Case For Workflow'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Page_Form 1A - Cessation As Employer (Approve)/Save  Continue in Form 1A Page'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Page_Form 1A - Cessation As Employer (Approve)/Save  Continue in Update Add Employee Resigned Date Page'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Page_Form 1A - Cessation As Employer (Approve)/Save  Contine in Uploading Document Page'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Page_Form 1A - Cessation As Employer (Reject)/Reject'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Page_Form 1A - Cessation As Employer (Reject)/Confirm'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Page_Form 1A - Cessation As Employer (Reject)/Message This Case has been Rejected'))

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Page_Form 1A - Cessation As Employer (Reject)/Letter of update rejection'))

