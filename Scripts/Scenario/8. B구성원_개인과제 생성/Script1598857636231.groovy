import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI




//// [부서장] 개인과제 생성 


bgsw = "bgsw1"
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
	WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'username'), bgsw)
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
	WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'username'), bgsw)
	WebUI.delay(1)
	
	WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'password'), passwd, FailureHandling.STOP_ON_FAILURE)
	WebUI.delay(1)
	WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="frm"]/div[3]/button'), FailureHandling.STOP_ON_FAILURE)
	WebUI.delay(1)
	
	// 과제보기 페이지 이동(운영)
	WebUI.navigateToUrl('https://midasinhrqa101.erpsolution.co.kr/performance/goal/operate')
	WebUI.delay(1)
}

// 하위 과제 연결 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[text()="조직과제"]//ancestor::div//*[@data-module-type="add-task"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

// 협의자 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@placeholder="이름으로 추가"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

// B본부장1을 협의자로 선택
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="virtualScroll__container--3B8-n"]//*[@title="B본부장1 (B 레벨조직 (본부) : B)"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)


// 목표유형 선택
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="assignmentRow goalType"]//*[@data-module-type="select-box"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

// 정량목표 선택
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="overlay-common"]/div/div/div/div[2]/div/div/div[2]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

// 개인과제명 입력
WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="assignmentRow name"]//*[@class="module-input module-basic-input"]'), '개인과제2', FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)

// KPI명 입력
WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="assignmentRow quantityKPIName"]//*[@class="module-input module-basic-input"]'), '개별/상향', FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)

// 성과달성방식 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="assignmentRow quantityAchievementMethod"]//*[@class="module-select-box module-controlled-select-box"]'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)

// 평균 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="module-drop-down"]//*[text()="개별"]'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)

// 측정기준 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="assignmentRow quantityMeasurementCriteria"]//*[@class="module-select-box module-controlled-select-box"]'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)

// 상향 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="module-drop-down"]//*[text()="상향"]'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)

// 과제목표 입력
WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="module-input commaNumberInput__commaNumberInput--znsl-"]'), '6', FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)



// 마일스톤 우회 입력 (동적 xpath로 변화)
for(int i=1; i<7; i++){
	WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="gAssignmentFormItem__item--sTX2C"]//*[text()="개별 추가"]'), FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.delay(1)
}

WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="gMilestoneScheduleItemList__itemWrap--32uD2"]//*[text()="과제 시작"] //ancestor::div[1]//*[@class="gMilestoneScheduleItem__delete--1OHlt iconButton__iconBoxButton--1Vc7X button__button--QISUP font__font-default--1wm_8"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="gMilestoneScheduleItemList__itemWrap--32uD2"]//*[text()="과제 종료"] //ancestor::div[1]//*[@class="gMilestoneScheduleItem__delete--1OHlt iconButton__iconBoxButton--1Vc7X button__button--QISUP font__font-default--1wm_8"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

for (int month=7; month <13; month++){
	String Text_month = Integer.toString(month)
	WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="gMilestoneScheduleItemList__tempItemWrap--36Sx8"]/div[1]//*[@placeholder="월"]'), Text_month, FailureHandling.STOP_ON_FAILURE)
	WebUI.delay(1)
	WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="gMilestoneScheduleItemList__tempItemWrap--36Sx8"]/div[1]//*[@placeholder="일"]'), '30', FailureHandling.STOP_ON_FAILURE)
	WebUI.delay(1)
}


// 시작일 부터 체크
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="font__font-default--1wm_8"]//*[text()="시작일부터 성과를 작성합니다."]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

// 평가 균등 체크 해제
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[text()="평가를 균등하게 반영합니다."]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

TestObject a = new TestObject()

// 성과 입력값
String[] percent = new String[7];
percent[0] = "30"
percent[1] = "20"
percent[2] = "20"
percent[3] = "10"
percent[4] = "10"
percent[5] = "10"


for (int i=1; i <7; i++){
	String per_xpath ="//*[@class='box__box--3Ml2g containerContent__containerContent--2l_Al']/div[" + i + "]/div[3]/input"
	a.addProperty('xpath', ConditionType.EQUALS, per_xpath)
	WebUI.setText(a, percent[i-1])
	
	WebUI.delay(1)
}

// 과제 생성 버튼 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="operateNewAssignmentPopup"]/header/div[2]/button[1]/span'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)
WebUI.closeBrowser()

// b부서장 로그인
WebUI.openBrowser('')
WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)
WebUI.navigateToUrl('https://testsvc-' + sp_id + '-erpsolution-co-kr.midasweb.net/')
WebUI.delay(3)
WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'username'), bbsj)
WebUI.delay(1)
WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'password'), passwd, FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="frm"]/div[3]/button'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)

WebUI.navigateToUrl('https://testsvc-sprint017-erpsolution-co-kr.midasweb.net/performance/goal/operate')
WebUI.delay(1)

WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="requestStatusListItem__buttonList--CJyI4"]//*[text()="수락하기"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)



