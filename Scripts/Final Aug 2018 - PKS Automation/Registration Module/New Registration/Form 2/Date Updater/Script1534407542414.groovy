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
import java.util.Date as Date
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

Date TodayDate = new Date()

//capture today's date
SimpleDateFormat CurrentDateNoFilter = new SimpleDateFormat()

//allow editing on date captured
CurrentDateNoFilter.applyPattern('MM')

//applying to show today's month
int monthContainerMatcher = Integer.parseInt(CurrentDateNoFilter.format(TodayDate))

//container of month in the Assist website pop up is in index format, hence is 0 1 2 3 4 5 6 7 8 9 10 11
//to match the system month column value, we need a matcher
monthContainerMatcher = (monthContainerMatcher - 1)

//minus one will match the value
String CurrentMonth = monthContainerMatcher.toString()

GlobalVariable.CurrentMonth = CurrentMonth

//saving value of current month in a string



/*
 * 
 * 
 *----------------------------------------- Hello, I'm the seperator line-------------------------------------------------------
 * 
 * 
 * 
 */




CurrentDateNoFilter.applyPattern('yyyy')

//applying to show today's year
String CurrentYear = CurrentDateNoFilter.format(TodayDate)

GlobalVariable.CurrentYear = CurrentYear

//saving value of current year in a string
int intCurrentYear = Integer.parseInt(CurrentDateNoFilter.format(TodayDate))

//allowing adjust year to n years ago
eighteenYrsAgo = (intCurrentYear - 18)

//adjusting year to 18 years ago
String eighteenYrsBeforeThisYr = eighteenYrsAgo.toString()

GlobalVariable.EighteenYrsBefore = eighteenYrsBeforeThisYr

//saving value of 18 years ago
fiftysevenYrsAgo = (intCurrentYear - 57)

//adjusting year to 57 years ago
String fiftysevenYrsBeforeThisYr = fiftysevenYrsAgo.toString()

GlobalVariable.FiftysevenYrsBefore = fiftysevenYrsBeforeThisYr


boolean leapYear = false
leapYear = ((intCurrentYear % 4 ) == 0)

/*
 *
 *
 *----------------------------------------- Hello, I'm the seperator line-------------------------------------------------------
 *
 *
 *
 */



CurrentDateNoFilter.applyPattern('dd')

//applying to show today's date
String CurrentDate = CurrentDateNoFilter.format(TodayDate)

CurrentDate = Integer.parseInt(CurrentDate)

GlobalVariable.CurrentDate = CurrentDate

//saving value of current date in a string
int CurrentDay = Integer.parseInt(CurrentDate)
boolean ConfAdder 
System.out.println(CurrentMonth)
System.out.println(CurrentDate)
switch (CurrentDate) {
    case 31:
	if (CurrentMonth == 0 || CurrentMonth == 2 || CurrentMonth == 4 || CurrentMonth == 6 || CurrentMonth == 7 || CurrentMonth == 9 || CurrentMonth == 11)
	ConfAdder = false
        break
	case 29:
	if (CurrentMonth == 1 && leapYear == true)
	ConfAdder = false
			break
	case 28:
	if (CurrentMonth == 1 && leapYear == false)
	ConfAdder = false
			break
	case 30:
	if (CurrentMonth == 3 || CurrentMonth == 5 || CurrentMonth == 8 || CurrentMonth == 10)
	ConfAdder = false
    default:
	ConfAdder = true
        break
}

//This is to allow adjusting to register a day before
/*
 * * Considering different months has different days
 * * it is important to make sure the date addition has to be accurate
 * * hence, we could use a switch case
 * *
 */
int aDayBefore
//
System.out.println(ConfAdder)
if (ConfAdder == true){
	aDayBefore = CurrentDay + 1
}else{ 
aDayBefore = 1
}

System.out.println(aDayBefore)
if ((aDayBefore == 1) && (CurrentMonth ==11)){
//this will override current month and year if the value "aDayBefore is actually falls on next month of next year
	CurrentMonth = 0
	GlobalVariable.CurrentMonth = CurrentMonth
	
	eighteenYrsAgo = (intCurrentYear - 17)
	
	//adjusting year to 18 years ago
	 eighteenYrsBeforeThisYr = eighteenYrsAgo.toString()
	
	GlobalVariable.EighteenYrsBefore = eighteenYrsBeforeThisYr
	
	//saving value of 18 years ago
	fiftysevenYrsAgo = (intCurrentYear - 56)
	
	//adjusting year to 57 years ago
	 fiftysevenYrsBeforeThisYr = fiftysevenYrsAgo.toString()
	
	GlobalVariable.FiftysevenYrsBefore = fiftysevenYrsBeforeThisYr
	
	
}



//adjusting to a day before
String DayBefore = aDayBefore.toString()

GlobalVariable.OneDayBefore = DayBefore

//saving value of a day before today


