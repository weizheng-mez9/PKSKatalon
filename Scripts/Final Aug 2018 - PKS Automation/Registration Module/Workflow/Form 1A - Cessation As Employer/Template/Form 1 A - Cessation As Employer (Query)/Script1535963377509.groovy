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

not_run: WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Workflow/Form 1A - Cessation As Employer/Template/Form 1 A - Cessation As Employer (OTC)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/c/portal/logout')

WebUI.delay(1)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/Reference Number Getter'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/Workflow Owner Finder'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/c/portal/logout')

WebUI.delay(1)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Workflow/Login and Search Case For Workflow'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Page_Form 1A - Cessation As Employer (Approve)/Save  Continue in Form 1A Page'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Employment Resign Date'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Employment Resign Date - Year'), 
    '2030', false)

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Employment Resign Date - Year - Date'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Page_Form 1A - Cessation As Employer (Approve)/Save  Continue in Update Add Employee Resigned Date Page'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Set Latest - Yes'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Page_Form 1A - Cessation As Employer (Query)/Query - remark'), 
    'remark')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Page_Form 1A - Cessation As Employer (Approve)/Save  Contine in Uploading Document Page'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Page_Form 1A - Cessation As Employer (Query)/Query'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Page_Form 1A - Cessation As Employer (Query)/Confirm'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Page_Form 1A - Cessation As Employer (Query)/MessageThe Case Is Under Query'))

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Page_Form 1A - Cessation As Employer (Query)/Letter of inquiry'))

WebUI.delay(1)

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/c/portal/logout')

WebUI.delay(1)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Workflow/Search Pending Case For Add Supporting Document (OTC)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Page_Form 1A - Cessation As Employer (Query -OTC -UO)/Next in Form 1A Page'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Page_Form 1A - Cessation As Employer (Query -OTC -UO)/Next in Resigned Date Page'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Page_Form 1A - Cessation As Employer (Query -OTC -UO)/Add Document'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Page_Form 1A - Cessation As Employer (Query -OTC -UO)/Document Type'))

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Page_Form 1A - Cessation As Employer (Query -OTC -UO)/Document Type - Others'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Uploading File'), GlobalVariable.UploadDoc)

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Page_Form 1A - Cessation As Employer (Query -OTC -UO)/Add Document in Uploading Page'))

WebUI.delay(4)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Page_Form 1A - Cessation As Employer (Query -OTC -UO)/Exit'))

WebUI.delay(1)

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/c/portal/logout')

WebUI.delay(1)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Workflow/Login and Search Case For Workflow'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Page_Form 1A - Cessation As Employer (Approve)/Save  Continue in Form 1A Page'))

WebUI.delay(3)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Page_Form 1A - Cessation As Employer (Approve)/Save  Continue in Update Add Employee Resigned Date Page'))

WebUI.delay(3)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Page_Form 1A - Cessation As Employer (Approve)/Save  Contine in Uploading Document Page'))

WebUI.delay(3)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Page_Form 1A - Cessation As Employer (Approve)/Approve'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Confirm'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Page_Form 1A - Cessation As Employer (Approve)/Message Your Request    Form 1A '))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 1A - Cessation As Employer/Page_Form 1A - Cessation As Employer (Approve)/Letter of successful update'))

