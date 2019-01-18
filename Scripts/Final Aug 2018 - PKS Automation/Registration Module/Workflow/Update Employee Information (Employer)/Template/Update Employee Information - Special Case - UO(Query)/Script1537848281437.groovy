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

not_run: WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Workflow/Update Employee Information (Employer)/Template/Update Employer Information - Special Case (OTC)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/c/portal/logout')

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/Reference Number Getter'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/Workflow Owner Finder'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/c/portal/logout')

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Workflow/Login and Search Case For Workflow'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Page_Update Employee Information by Employer (Approve)/Continue'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Page_Update Employee Information by Employer (Approve)/Save  Continue in Update Employee Information Page'))

WebUI.delay(4)

WebUI.setText(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Page_Update Employee Information by Employer (Query)/Remark'), 
    'Query')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Page_Update Employee Information by Employer (Approve)/Save  Continue in Upload Supporting Doucument Page'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Page_Update Employee Information by Employer (Query)/Query'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Page_Update Employee Information by Employer (Approve)/Confirm'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Page_Update Employee Information by Employer (Query)/Query Message The case is Under Query'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Page_Update Employee Information by Employer (Query)/Letter of inquiry'))

WebUI.delay(1)

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/c/portal/logout')

WebUI.delay(1)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Workflow/Search Pending Case For Add Supporting Document (OTC)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Page_Update Employee Information by Employer (Query -OTC -UO)/Next'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Page_Update Employee Information by Employer (Query -OTC -UO)/Add Document Button'))

WebUI.delay(5)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Page_Update Employee Information by Employer (Query -OTC -UO)/Document Type'))

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Page_Update Employee Information by Employer (Query -OTC -UO)/Document Type - Other'))

WebUI.sendKeys(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Page_Update Employee Information by Employer (Query -OTC -UO)/Upload File'), 
    GlobalVariable.UploadDoc)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Page_Update Employee Information by Employer (Query -OTC -UO)/Add Document'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Page_Update Employee Information by Employer (Query -OTC -UO)/Exit'))

WebUI.delay(2)

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/c/portal/logout')

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Workflow/Login and Search Case For Workflow'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Page_Update Employee Information by Employer (Approve)/Continue'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Page_Update Employee Information by Employer (Approve)/Save  Continue in Update Employee Information Page'))

WebUI.delay(4)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Page_Update Employee Information by Employer (Approve)/Save  Continue in Upload Supporting Doucument Page'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Page_Update Employee Information by Employer (Approve)/Approve'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Page_Update Employee Information by Employer (Approve)/Confirm'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Page_Update Employee Information by Employer (Approve)/Successfull Message Submitted Successfully'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Final Object Repo/Page_Update Employee Information By Employer/Page_Update Employee Information by Employer (Approve)/Letter of Successful update'))

