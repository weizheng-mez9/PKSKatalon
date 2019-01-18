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

not_run: WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Workflow/Form 3 EIS - Cessation As Employer/Template/Form 3 A - Cessation As Employer (OTC)'), 
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

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Page_Form 3 EIS - Cessation as Employer (Approve)/Save  Continue in Form 3 Page'))

WebUI.delay(4)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Page_Form 3 EIS - Cessation as Employer (Approve)/Save  Continue in Resigned Page'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Page_Form 3 EIS - Cessation as Employer (Query)/Query - Remark'), 
    'Remark')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Page_Form 3 EIS - Cessation as Employer (Query)/Save  Continue'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Page_Form 3 EIS - Cessation as Employer (Query)/Query'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Page_Form 3 EIS - Cessation as Employer (Query)/Confirm'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Page_Form 3 EIS - Cessation as Employer (Query)/Message The Case Is Under Query'))

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Page_Form 3 EIS - Cessation as Employer (Query)/Letter of inquiry'))

WebUI.delay(1)

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/c/portal/logout')

WebUI.delay(1)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Workflow/Search Pending Case For Add Supporting Document (OTC)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Page_Form 3 EIS - Cessation as Employer (Query - OTC - UO)/Next'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Page_Form 3 EIS - Cessation as Employer (Query - OTC - UO)/Next in Resigned Page'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Page_Form 3 EIS - Cessation as Employer (Query - OTC - UO)/Add Document'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Page_Form 3 EIS - Cessation as Employer (Query - OTC - UO)/Document Type'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Page_Form 3 EIS - Cessation as Employer (Query - OTC - UO)/Document Type - Others'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Page_Form 3 EIS - Cessation as Employer (Query - OTC - UO)/ploading File'), 
    GlobalVariable.UploadDoc, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Page_Form 3 EIS - Cessation as Employer (Query - OTC - UO)/Add Document in Uploading Page'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Page_Form 3 EIS - Cessation as Employer (Query - OTC - UO)/Exit'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.navigateToUrl('https://assist2-uat.perkeso.gov.my/c/portal/logout')

WebUI.delay(1)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/Workflow/Login and Search Case For Workflow'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Page_Form 3 EIS - Cessation as Employer (Approve)/Save  Continue in Form 3 Page'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Page_Form 3 EIS - Cessation as Employer (Approve)/Save  Continue in Resigned Page'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Page_Form 3 EIS - Cessation as Employer (Approve)/Save  Continue in Uploading Page'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Page_Form 3 EIS - Cessation as Employer (Reject)/Reject'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Page_Form 3 EIS - Cessation as Employer (Reject)/Confirm'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Page_Form 3 EIS - Cessation as Employer (Reject)/Message This Case has been Rejected'))

WebUI.click(findTestObject('Final Object Repo/Page_Form 3 EIS - Cessation as Employer/Page_Form 3 EIS - Cessation as Employer (Reject)/Letter of update rejection'))

