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


///////////////////////////////////////////////////////////////// [부서장] 조직과제 생성 /////////////////////////////////////////////////////
String currentTime1 = new Date().format('yyyy.MM.dd')


bbsj = "bbsj1"
passwd = "mid@sit147"

String env = "운영"

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
	WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'username'), bbsj)
	WebUI.delay(1)
	
	WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'password'), passwd, FailureHandling.STOP_ON_FAILURE)
	WebUI.delay(1)
	WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="frm"]/div[3]/button'), FailureHandling.STOP_ON_FAILURE)
	WebUI.delay(1)
	
	// 과제보기 페이지 이동(스테이징)
	WebUI.navigateToUrl('https://testsvc-sprint017-erpsolution-co-kr.midasweb.net/performance/goal/operate')
	WebUI.delay(1)
}

else if(env=="운영"){
	pro_url = "https://midasinhrqa101.erpsolution.co.kr/"
	pro_admin = "midasinhrqa101"
	
	// 로그인 과정
	WebUI.openBrowser('')
	WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)
	
	//운영 url
	WebUI.navigateToUrl(pro_url)
	WebUI.delay(1)
	
	// 운영 관리자
	WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'username'), bbsj)
	WebUI.delay(1)
	
	WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'password'), passwd, FailureHandling.STOP_ON_FAILURE)
	WebUI.delay(1)
	WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="frm"]/div[3]/button'), FailureHandling.STOP_ON_FAILURE)
	WebUI.delay(1)
	
	// 과제보기 페이지 이동(운영)
	WebUI.navigateToUrl('https://midasinhrqa101.erpsolution.co.kr/performance/goal/operate')
	WebUI.delay(1)
}


// 신규 과제 생성 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="module-text-button"]//*[text()="신규과제 생성"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)


// 과제 구분 선택
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="assignmentRow kind"]//*[@data-module-type="select-box"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

// 조직과제 선택
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="overlay-common"]/div/div/div/div[2]/div/div/div[1]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

// 목표유형 선택
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="assignmentRow goalType"]//*[@data-module-type="select-box"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

// 정량목표 선택
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="overlay-common"]/div/div/div/div[2]/div/div/div[2]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

// 조직과제명 입력
WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="assignmentRow name"]//*[@class="module-input module-basic-input"]'), '조직과제', FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)

// KPI명 입력
WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="assignmentRow quantityKPIName"]//*[@class="module-input module-basic-input"]'), '합산/상향', FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)

// 과제목표 입력
WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="module-input commaNumberInput__commaNumberInput--znsl-"]'), '30000', FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)



// 마일스톤 우회 입력
for (int num=1; num<4; num++){
	WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="gAssignmentFormItem__item--sTX2C"]//*[text()="개별 추가"]'), FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.delay(1)
}

WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="gMilestoneScheduleItemList__itemWrap--32uD2"]//*[text()="과제 시작"] //ancestor::div[1]//*[@class="gMilestoneScheduleItem__delete--1OHlt iconButton__iconBoxButton--1Vc7X button__button--QISUP font__font-default--1wm_8"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="gMilestoneScheduleItemList__itemWrap--32uD2"]//*[text()="과제 종료"] //ancestor::div[1]//*[@class="gMilestoneScheduleItem__delete--1OHlt iconButton__iconBoxButton--1Vc7X button__button--QISUP font__font-default--1wm_8"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

for (int month=7; month <13; ){
	String Text_month = Integer.toString(month)
	WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="gMilestoneScheduleItemList__tempItemWrap--36Sx8"]/div[1]//*[@placeholder="월"]'), Text_month, FailureHandling.STOP_ON_FAILURE)
	WebUI.delay(1)
	WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="gMilestoneScheduleItemList__tempItemWrap--36Sx8"]/div[1]//*[@placeholder="일"]'), '01', FailureHandling.STOP_ON_FAILURE)
	WebUI.delay(1)
	
	
	if(month==7){
		int int_month = Integer.parseInt(Text_month)
		month = month + 2
		print(month)
	}
	else if(month==9){
		int int_month = Integer.parseInt(Text_month)
		month = month +3
		print(month)
	}
	else{
		break;
	}

}



// 시작일부터 성과를 작성합니다. 체크
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="font__font-default--1wm_8"]//*[text()="시작일부터 성과를 작성합니다."]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)
 

// B부서장 담당자 추가 
WebUI.focus(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('class', 'recipientSearch'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="assignmentRow assignee"]//*[@class="module-input module-basic-input input-button-input-area"]'), 'B본부장', FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="autoPosition__autoPosition--2LVU9 box__box-after-clear--4VcYO"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

// B구성원 담당자 추가
WebUI.focus(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('class', 'recipientSearch'), FailureHandling.STOP_ON_FAILURE)
WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="assignmentRow assignee"]//*[@class="module-input module-basic-input input-button-input-area"]'), 'B 구성원', FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="autoPosition__autoPosition--2LVU9 box__box-after-clear--4VcYO"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)


WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="operateNewAssignmentPopup"]/header/div[2]/button[1]/span'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)



