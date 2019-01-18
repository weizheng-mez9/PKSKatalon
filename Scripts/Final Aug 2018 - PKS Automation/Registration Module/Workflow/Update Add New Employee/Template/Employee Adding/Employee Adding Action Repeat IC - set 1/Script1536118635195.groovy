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

//'Birthday on the day , 18 y/o on the date\r\n'
WebUI.setText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Employee Name Input'), 'Automate003 eligible 1')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/DatePicker Pop Up'))

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/DOB Month'), FailureHandling.CONTINUE_ON_FAILURE)

def CurrentMonth = GlobalVariable.CurrentMonth

TestObject selectMonth = new TestObject()

selectMonth.addProperty('xpath', ConditionType.EQUALS, ('//body/div/div/div/select/option[@value=\'' + CurrentMonth) + '\']', 
    true)

WebUI.click(selectMonth)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/DOB Year'))

def Eyearsbf = GlobalVariable.EighteenYrsBefore

TestObject selectYear = new TestObject()

selectYear.addProperty('xpath', ConditionType.EQUALS, ('//div/div/div/select/option[@value=\'' + Eyearsbf) + '\']', true)

WebUI.click(selectYear)

TestObject UpdatedSelectDate = WebUI.modifyObjectProperty(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/DOB Date'), 
    'xpath', 'equals', ('//body/div/table/tbody/tr/td/a[text()="' + GlobalVariable.CurrentDate) + '"]', true)

//This is to replace original xpath value so that it point to the value we prepare 
WebUI.delay(3)

WebUI.click(UpdatedSelectDate)

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/EmploymentStartDate Pop Up'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Socso Employment StartDate Month'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Select Socso Employement Startdate Month'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Socso Employment StartDate Year'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Select Socso Employment Startdate Year'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Socso Employment Start Date Day'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Save Button for Add Employee'))

WebUI.delay(6)

//add employee 2 (57 tomorrow)
WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Add Employee Button'))

WebUI.delay(4)

WebUI.setText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/NRIC Input'), '620904059600')

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/button for search for IC'))

WebUI.delay(2)

//'Birthday after the day , 56++ y/o on the date\r\n'
WebUI.setText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Employee Name Input'), 'Automate003 eligible 2')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/DatePicker Pop Up'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/DOB Month'), FailureHandling.CONTINUE_ON_FAILURE)

selectMonth = WebUI.modifyObjectProperty(selectMonth, 'xpath', 'equals', ('//body/div/div/div/select/option[@value="' + 
    CurrentMonth) + '"]', true)

WebUI.click(selectMonth)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/DOB Year'))

selectYear = WebUI.modifyObjectProperty(selectYear, 'xpath', 'equals', ('//div/div/div/select/option[@value="' + GlobalVariable.FiftysevenYrsBefore) + 
    '"]', true)

WebUI.click(selectYear)

UpdatedSelectDate = WebUI.modifyObjectProperty(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/DOB Date'), 
    'xpath', 'equals', ('//body/div/table/tbody/tr/td/a[text()="' + GlobalVariable.OneDayBefore) + '"]', true)

//This is to replace original xpath value so that it point to the value we prepare 
WebUI.click(UpdatedSelectDate)

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/EmploymentStartDate Pop Up'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Socso Employment StartDate Month'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Select Socso Employement Startdate Month'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Socso Employment StartDate Year'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Select Socso Employment Startdate Year'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Socso Employment Start Date Day'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Save Button for Add Employee'))

WebUI.delay(10)

WebUI.waitForElementClickable(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Add Employee Button'), 
    120)

//add 17++ yo
WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Add Employee Button'))

WebUI.delay(4)

WebUI.setText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/NRIC Input'), '000209039100')

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/button for search for IC'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Employee Name Input'), 'Automate003 not eligible 1')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/DatePicker Pop Up'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/DOB Month'), FailureHandling.CONTINUE_ON_FAILURE)

selectMonth = WebUI.modifyObjectProperty(selectMonth, 'xpath', 'equals', ('//body/div/div/div/select/option[@value="' + 
    CurrentMonth) + '"]', true)

WebUI.click(selectMonth)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/DOB Year'))

selectYear = WebUI.modifyObjectProperty(selectYear, 'xpath', 'equals', ('//div/div/div/select/option[@value="' + GlobalVariable.EighteenYrsBefore) + 
    '"]', true)

WebUI.click(selectYear)

UpdatedSelectDate = WebUI.modifyObjectProperty(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/DOB Date'), 
    'xpath', 'equals', ('//body/div/table/tbody/tr/td/a[text()="' + GlobalVariable.OneDayBefore) + '"]', true)

WebUI.click(UpdatedSelectDate)

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/EmploymentStartDate Pop Up'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Socso Employment StartDate Month'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Select Socso Employement Startdate Month'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Socso Employment StartDate Year'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Select Socso Employment Startdate Year'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Socso Employment Start Date Day'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Save Button for Add Employee'))

WebUI.delay(20)

//add 57 yo
WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Add Employee Button'))

WebUI.delay(4)

WebUI.setText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/NRIC Input'), '600203039104')

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/button for search for IC'))

WebUI.delay(2)

WebUI.setText(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Employee Name Input'), 'Automate003 not eligible 2')

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/DatePicker Pop Up'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/DOB Month'), FailureHandling.CONTINUE_ON_FAILURE)

selectMonth = WebUI.modifyObjectProperty(selectMonth, 'xpath', 'equals', ('//body/div/div/div/select/option[@value="' + 
    CurrentMonth) + '"]', true)

WebUI.click(selectMonth)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/DOB Year'))

selectYear = WebUI.modifyObjectProperty(selectYear, 'xpath', 'equals', ('//div/div/div/select/option[@value="' + GlobalVariable.FiftysevenYrsBefore) + 
    '"]', true)

WebUI.click(selectYear)

UpdatedSelectDate = WebUI.modifyObjectProperty(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/DOB Date'), 
    'xpath', 'equals', ('//body/div/table/tbody/tr/td/a[text()="' + GlobalVariable.CurrentDate) + '"]', true)

WebUI.click(UpdatedSelectDate)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/EmploymentStartDate Pop Up'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Socso Employment StartDate Month'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Select Socso Employement Startdate Month'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Socso Employment StartDate Year'))

WebUI.delay(1)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Select Socso Employment Startdate Year'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Socso Employment Start Date Day'))

WebUI.delay(2)

WebUI.click(findTestObject('Final Object Repo/Page_Update Add New Employee - ASSIST/Save Button for Add Employee'))

