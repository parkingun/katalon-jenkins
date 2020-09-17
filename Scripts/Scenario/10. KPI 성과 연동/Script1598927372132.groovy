import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


///////////////////////////////// KPI 성과연동 ////////////////////////////////////////////// 


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
	pro_url = "https://midasinhrqa101.erpsolution.co.kr/performance/goal/operate"
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


WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="assignmentCardBundle__assignmentCardBundle--3Ef56"]//*[text()="조직과제"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

WebUI.switchToWindowTitle("조직과제 - 과제상세", FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)

TestObject a = new TestObject()

// 성과 입력값
String[] result_val = new String[6];
result_val[0] = "10000"
result_val[1] = "5000"
result_val[2] = "1000"
result_val[3] = "2500"
result_val[4] = "10000"
result_val[5] = "15000"

for (int i=1; i<4; i++) {
	// 계획 입력
	String xpathStr1 ="//div[@class='container']/div[" + i + "]/div[2]/div/input"
	a.addProperty('xpath', ConditionType.EQUALS, xpathStr1)	
	WebUI.setText(a, '10000')
	WebUI.delay(1)

}

// 성과 연동 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="tabArea"]//*[text()="성과 연동"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

// 연동 안함 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="content__content--3JURr content__box--3XwOs"]//*[text()="연동 안함"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

// 드롭다운 목록에서 사용자 설정 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="dropdown__contentWrap--1hB2-"]/button[4]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

// '합산합니다' 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="box__box--3Ml2g font__font-default--1wm_8 box__box-border--mJp7o gKpiAggregationPopup__ruleDescription--37HLF"]/div[1]/button[2]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

// '최신 성과를 가져옵니다' 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="dropdown__contentWrap--1hB2-"]//*[text()="최신 성과를 가져옵니다."]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

// 전체 체크 박스 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="gAssignmentFormItem__item--sTX2C"]//*[@class="table-header"]//*[@class="icon"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

// 팝업창 확인 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="root"]/div[2]/div/article/header//*[text()="확인"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

