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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

not_run: WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Workflow/Update Employer Information/Template/Update Employer Information - Special Case (OTC)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(1)

not_run: WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/c/portal/logout')

WebUI.delay(1)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/Reference Number Getter'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/Workflow Owner Finder'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/c/portal/logout')

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Workflow/Login and Search Case For Workflow'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Page_Update Employer Information UO (Approve)/Continue'))

WebUI.delay(10)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Page_Update Employer Information UO (Approve)/Save  Continue in Update Employer Information Page'))

WebUI.delay(3)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Page_Update Employer Information UO (Approve)/Save  Continue in Uploading Supporting Document Page'))

WebUI.delay(3)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Page_Update Employer Information UO (Approve)/Approve'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Employer Information/Page_Update Employer Information UO (Approve)/Confirm'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Final Object Repo/Page_Update Employer Information/Page_Update Employer Information UO (Approve)/Message Your Request'))

WebUI.verifyElementVisible(findTestObject('Final Object Repo/Page_Update Employer Information/Page_Update Employer Information UO (Approve)/Letter of successful update'))

