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
import org.apache.commons.io.FileUtils as FileUtils
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.TakesScreenshot as TakesScreenshot
import org.openqa.selenium.OutputType as OutputType
import java.io.File as File
import java.util.concurrent.TimeUnit as TimeUnit

WebUI.delay(15)

WebDriver driver = DriverFactory.getWebDriver()

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)

String PresavePath = GlobalVariable.KatalonScreenshots

String pathPrefix = 'C:\\Users\\Public\\Pictures\\Sample Pictures\\Katalon Screenshots\\Automate Ending Screen'

String finalPath

File scrFile = ((driver) as TakesScreenshot).getScreenshotAs(OutputType.FILE)

//create temporary file for screenshot
File PreSaveFile = new File(PresavePath)

int counter = 0

if (PreSaveFile.exists()) {
    while (PreSaveFile.exists()) {
        counter = (counter + 1)

        PreSaveFile = new File((pathPrefix + Integer.toString(counter)) + '.png')
    }
    
    //verifying duplication for file to generate and add counter to it accordingly
    finalPath = ((pathPrefix + Integer.toString(counter)) + '.png' //create path after verify no duplication
    //create path after verify no duplication
    )
} else {
    finalPath = (pathPrefix + '.png')
}

File SaveFile = new File(finalPath)

try {
    FileUtils.copyFile(scrFile, SaveFile)
}
catch (IOException e) {
    // TODO Auto-generated catch block
    e.printStackTrace()
} 

System.out.println('file kept')

WebUI.delay(10)

