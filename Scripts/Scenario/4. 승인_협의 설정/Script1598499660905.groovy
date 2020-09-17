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


String env = "운영"
passwd = "mid@sit147"

if(env=="스테이징"){
	url = "https://testsvc-sprint017-erpsolution-co-kr.midasweb.net/"
	sp_id = "sprint017"
	
	// 로그인 과정
	WebUI.openBrowser('')
	WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)
	
	// 스테이징 url
	WebUI.navigateToUrl('https://testsvc-' + sp_id + '-erpsolution-co-kr.midasweb.net/')
	WebUI.delay(1)
	
	// 스테이징 관리자
	WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'username'), sp_id)
	WebUI.delay(1)
	
	WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'password'), passwd, FailureHandling.STOP_ON_FAILURE)
	WebUI.delay(1)
	WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="frm"]/div[3]/button'), FailureHandling.STOP_ON_FAILURE)
	WebUI.delay(1)
	
	// 목표 과제 관리 페이지 이동
	WebUI.navigateToUrl('https://testsvc-' + sp_id + '-erpsolution-co-kr.midasweb.net/performance/goal/setting/assignment')
	WebUI.delay(3)
	
}

else if(env=="운영"){
	pro_url = "https://midasinhrqa101.erpsolution.co.kr"
	pro_admin = "midasinhrqa101"
	
	// 로그인 과정
	WebUI.openBrowser('')
	WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)
	
	//운영 url
	WebUI.navigateToUrl(pro_url)
	WebUI.delay(1)
	
	// 운영 관리자
	WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'username'), pro_admin)
	WebUI.delay(1)
	
	WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'password'), passwd, FailureHandling.STOP_ON_FAILURE)
	WebUI.delay(1)
	WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="frm"]/div[3]/button'), FailureHandling.STOP_ON_FAILURE)
	WebUI.delay(1)
	
	// 목표 과제 관리 페이지 이동
	WebUI.navigateToUrl('https://midasinhrqa101.erpsolution.co.kr/performance/goal/setting/assignment')
	WebUI.delay(3)
}


// 협의사항 설정 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[text()="협의사항 설정"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(2)

// 과제 생성 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[text()="과제 생성"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)


// 확인 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="containerFooterButtonWrap__containerFooterButtonWrap--aGkSC"]/button[1]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

// 협의 단계 설정 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[text()="협의 단계 설정"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(2)

// on 버튼 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="table__ie--2O__3"]/article/div[2]/article/div[1]/div[2]/label/span'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)


// 확인 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="containerFooterButtonWrap__containerFooterButtonWrap--aGkSC"]//*[text()="확인"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

