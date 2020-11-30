import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://adminfarmveggii.bilsamtech.in/')

WebUI.setText(findTestObject('Object Repository/Page_eCommerce Platform/input_Sign In_email'), 'admin@farmveggii.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_eCommerce Platform/input_Sign In_password'), 'nwr9I1qT+J0GbQ++JlYjHw==')

WebUI.click(findTestObject('Object Repository/Page_eCommerce Platform/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_eCommerce Platform/button_VERIFY OTP'))

WebUI.click(findTestObject('Object Repository/Page_eCommerce Platform/b_START BUSINESS'))

WebUI.click(findTestObject('Object Repository/Page_eCommerce Platform/p_Total items'))

WebUI.click(findTestObject('Object Repository/Page_eCommerce Platform/button_AddEditRemove'))

for(def rowNum=1; rowNum<=findTestData("TestDatafile").getRowNumbers(); rowNum++)
{

WebUI.setText(findTestObject('Object Repository/Page_eCommerce Platform/input_Unit Value_item_unitValue'), findTestData("TestDatafile").getValue(1,rowNum))

WebUI.setText(findTestObject('Object Repository/Page_eCommerce Platform/input_Unit MRP_item_unitPrice'),findTestData("TestDatafile").getValue(2,rowNum))

WebUI.setText(findTestObject('Object Repository/Page_eCommerce Platform/input_Max One Time Orders_item_maxOrders'), findTestData("TestDatafile").getValue(3,rowNum))

WebUI.setText(findTestObject('Object Repository/Page_eCommerce Platform/input_Low Alert Quantity_item_unitLowThreshold'), 
    findTestData("TestDatafile").getValue(4,rowNum))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_eCommerce Platform/select_Select                      Kilogram_5462af'), 
    'mg', true)

WebUI.setText(findTestObject('Object Repository/Page_eCommerce Platform/input_Unit Selling Price_unitSellPrice'), findTestData("TestDatafile").getValue(5,rowNum))

WebUI.setText(findTestObject('Object Repository/Page_eCommerce Platform/input_Available Quantity_item_unitQty'), findTestData("TestDatafile").getValue(6,rowNum))

WebUI.click(findTestObject('Object Repository/Page_eCommerce Platform/button_Add'))

Thread.sleep(3000)
}

WebUI.closeBrowser()

