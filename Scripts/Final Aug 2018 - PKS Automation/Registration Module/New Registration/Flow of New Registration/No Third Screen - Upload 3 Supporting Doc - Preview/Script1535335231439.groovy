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
import org.junit.After as After
import org.openqa.selenium.Keys as Keys

WebUI.delay(4)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Third Screen - Upload Supporting Doc- Preview/Add Document Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Third Screen - Upload Supporting Doc- Preview/Supporting Doc Please Select Drop Down'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Third Screen - Upload Supporting Doc- Preview/Select to Upload Form 1'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Third Screen - Upload Supporting Doc- Preview/Upload File Adding'), 
    GlobalVariable.UploadDoc)

WebUI.delay(5)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Third Screen - Upload Supporting Doc- Preview/Inner Form Add Document Button'))

WebUI.delay(3)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Third Screen - Upload Supporting Doc- Preview/Add Document Button'))

WebUI.delay(4)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Third Screen - Upload Supporting Doc- Preview/Supporting Doc Please Select Drop Down'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Third Screen - Upload Supporting Doc- Preview/Select to Upload Form 2'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Third Screen - Upload Supporting Doc- Preview/Upload File Adding'), 
    GlobalVariable.UploadDoc)

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Third Screen - Upload Supporting Doc- Preview/Inner Form Add Document Button'))

WebUI.delay(3)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Third Screen - Upload Supporting Doc- Preview/Add Document Button'))

WebUI.delay(4)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Third Screen - Upload Supporting Doc- Preview/Supporting Doc Please Select Drop Down'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Third Screen - Upload Supporting Doc- Preview/Select to Upload Borang SIP 1'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Third Screen - Upload Supporting Doc- Preview/Upload File Adding'), 
    GlobalVariable.UploadDoc)

WebUI.delay(5)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Third Screen - Upload Supporting Doc- Preview/Inner Form Add Document Button'))

WebUI.delay(3)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Third Screen - Upload Supporting Doc- Preview/Save n Continue in Uploading Supporting Doc Page'))

