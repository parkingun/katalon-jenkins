import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


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
	WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'username'), sp_id)
	WebUI.delay(1)
	
	WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'password'), passwd, FailureHandling.STOP_ON_FAILURE)
	WebUI.delay(1)
	WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="frm"]/div[3]/button'), FailureHandling.STOP_ON_FAILURE)
	WebUI.delay(1)
	
	// 평가 진행 페이지 이동(스테이징)
	WebUI.navigateToUrl('https://testsvc-sprint017-erpsolution-co-kr.midasweb.net/performance/goal/setting/appraisal')
	WebUI.delay(2)
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
	WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'username'), pro_admin)
	WebUI.delay(1)
	
	WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'password'), passwd, FailureHandling.STOP_ON_FAILURE)
	WebUI.delay(1)
	WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="frm"]/div[3]/button'), FailureHandling.STOP_ON_FAILURE)
	WebUI.delay(1)
	
	// 평가 진행 페이지 이동(운영)
	WebUI.navigateToUrl('https://midasinhrqa101.erpsolution.co.kr/performance/goal/setting/appraisal')
	WebUI.delay(2)
}

/*
TestObject a = new TestObject()

for (int i=1; i<13; i++){
	
	if(i==7 || i==9 | i==12){
	String month_xpath ="//*[@class='top-table-control__topTableControlWrap---Px-o']//*[@id='appraisalMonthList']/button[" + i + "]"
	a.addProperty('xpath', ConditionType.EQUALS, month_xpath)
	
	
	System.out.println('*****************************************************************************')
	println(month_xpath)
	System.out.println('*****************************************************************************')
	
	
	WebUI.click(a)
	WebUI.delay(1)
	
	WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="top-table-control__topTableControlWrap---Px-o"]//*[@id="appraisalMonthList"]/button[1]'), FailureHandling.STOP_ON_FAILURE)
	WebUI.delay(1)
	}
}
*/

WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="top-table-control__topTableControlWrap---Px-o"]//*[@id="appraisalMonthList"]/button[1]'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(2)
	
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="appraisalTableBodyRowList__rowList--PIvh4"]//*[text()="B 레벨 조직 (본부)(LV2)"]//following-sibling::div[3]/label'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1) 

WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="top-table-control__topTableControlWrap---Px-o"]//*[@id="appraisalMonthList"]/button[3]'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(2)

WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="appraisalTableBodyRowList__rowList--PIvh4"]//*[text()="B 레벨 조직 (본부)(LV2)"]//following-sibling::div[3]/label'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)
 
	
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="top-table-control__topTableControlWrap---Px-o"]//*[@id="appraisalMonthList"]/button[6]'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(2)

WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="appraisalTableBodyRowList__rowList--PIvh4"]//*[text()="B 레벨 조직 (본부)(LV2)"]//following-sibling::div[3]/label'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)