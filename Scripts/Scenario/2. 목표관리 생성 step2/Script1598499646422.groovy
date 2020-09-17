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


url = "https://testsvc-sprint017-erpsolution-co-kr.midasweb.net/"
sp_id = "sprint017"
passwd = "mid@sit147"

// 시나리오 테스트 2 시작
// 조직과제 차수평가 클릭

WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="organizationAndPersonalSetting organizationAppraisal"]//*[@type="button"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="organizationAndPersonalSetting organizationAppraisal"]//*[@class="drop-down-item-container"]//*[@text()="1차까지"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)


//개인과제 차수평가 클릭 
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="organizationAndPersonalSetting personalAppraisal"]//*[@type="button"]'), FailureHandling.CONTINUE_ON_FAILURE)

// 1차 클릭 실행
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="organizationAndPersonalSetting personalAppraisal"]//*[@class="drop-down-item-container"]//*[@text()="1차까지"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)


WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@data-module-type="next"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(3)



