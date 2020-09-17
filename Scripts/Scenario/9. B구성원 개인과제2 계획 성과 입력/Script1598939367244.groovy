import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


///////////////////////////////// B구성원 개인과제 계획/성과 입력 //////////////////////////////////////////////
String currentTime1 = new Date().format('yyyy.MM.dd')

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
	pro_url = "https://midasinhrqa101.erpsolution.co.kr/performance/goal/operate"
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


// 개인과제2 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="assignmentCardBundle__assignmentCardBundle--3Ef56"]//*[text()="개인과제2"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

WebUI.switchToWindowTitle("개인과제2 - 과제상세", FailureHandling.STOP_ON_FAILURE)
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

for (int i=1; i<7; i++) {
	// 계획 입력
	String xpathStr1 ="//div[@class='container']/div[" + i + "]/div[2]/div/input"
	a.addProperty('xpath', ConditionType.EQUALS, xpathStr1)	
	WebUI.setText(a, '5000')
	WebUI.delay(1)
	
	//성과 입력
	String xpathStr2 ="//div[@class='container']/div[" + i + "]/div[3]/div/div/input"
	a.addProperty("xpath", ConditionType.EQUALS, xpathStr2) 
	WebUI.setText(a, result_val[i-1])
	WebUI.delay(1)
	
}

WebUI.verifyElementText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="planPerformanceTab__term--f5S7w"]'), "실행기간 : 7월 30일 ~ 12월 30일", FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

String[] per_text = new String[7];
per_text[0] = "개별"
per_text[1] = "상향"
per_text[2] = "6회"
per_text[3] = "4회"
per_text[4] = "67%"
per_text[5] = "[보기]"
/*
for (int i=1; i<7; i++) {
	// 성과달성 방식 확인
	String xpathStr1 ="//*[@class='performanceSummaryBox__header--3ISKO']/div[" + i + "]/article"
	a.addProperty('xpath', ConditionType.EQUALS, xpathStr1)
	WebUI.verifyElementText(a, per_text[i-1])
	WebUI.delay(1)
	
}

*/
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="performanceSummaryBox__header--3ISKO"]/div[6]/article/button'), FailureHandling.CONTINUE_ON_FAILURE)
