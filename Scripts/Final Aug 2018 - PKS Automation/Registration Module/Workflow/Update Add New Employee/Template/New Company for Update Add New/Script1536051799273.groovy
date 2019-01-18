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

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/New Registration/Form 1/Form 1 - Corporation - BHD'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/New Registration/Form 2/Add 1 Eligible'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/New Registration/Flow of New Registration/Third Screen - Upload Supporting Doc - Preview'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/New Registration/Submit and Screenshot/Submit Registration and Screenshot - Copy'), 
    [:], FailureHandling.STOP_ON_FAILURE)

GlobalVariable.UpdateAddNewECode = WebUI.getText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/getEmpCode'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Common/Emp Code Setter'), [:], FailureHandling.STOP_ON_FAILURE)

