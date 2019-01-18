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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Final Aug 2018 - PKS Automation/Registration Module/New Registration/Form 2/Date Updater'), 
    [:], FailureHandling.STOP_ON_FAILURE)

GlobalVariable.CaseReferenceNo = WebUI.getText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 2/RefNo Acquiring'))

WebUI.delay(4)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 2/Add Employee Button'))

WebUI.delay(1)

WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 2/NRIC Input'), '010903091984')

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 2/button for search for IC'))

WebUI.delay(2)

//'Birthday on the day , 18 y/o on the date\r\n'
WebUI.setText(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 2/Employee Name Input'), 
    'Automate001 eligible 1')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 2/DatePicker Pop Up'))

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 2/DOB Month'), FailureHandling.CONTINUE_ON_FAILURE)

def CurrentMonth = GlobalVariable.CurrentMonth

TestObject selectMonth = new TestObject()

selectMonth.addProperty('xpath', ConditionType.EQUALS, ('//body/div/div/div/select/option[@value=\'' + CurrentMonth) + '\']', 
    true)

WebUI.click(selectMonth)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 2/DOB Year'))

def Eyearsbf = GlobalVariable.EighteenYrsBefore

TestObject selectYear = new TestObject()

selectYear.addProperty('xpath', ConditionType.EQUALS, ('//div/div/div/select/option[@value=\'' + Eyearsbf) + '\']', true)

WebUI.click(selectYear)

TestObject UpdatedSelectDate = WebUI.modifyObjectProperty(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 2/DOB Date'), 
    'xpath', 'equals', ('//body/div/table/tbody/tr/td/a[text()="' + GlobalVariable.CurrentDate) + '"]', true)

//This is to replace original xpath value so that it point to the value we prepare 
WebUI.delay(3)

WebUI.click(UpdatedSelectDate)

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 2/EmploymentStartDate Pop Up'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 2/Socso Employment StartDate Month'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 2/Select Socso Employement Startdate Month'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 2/Socso Employment StartDate Year'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 2/Select Socso Employment Startdate Year'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 2/Socso Employment Start Date Day'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 2/Save Button for Add Employee'))

WebUI.delay(6)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 2/Incomplete Checkbox'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/New Registration - Registration Module Pages/Form 2/Save and Continue Form 2'))

