import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


///////////////////////////////////////////////////////////////// [부서장] 조직과제 생성 /////////////////////////////////////////////////////

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
	WebUI.navigateToUrl('https://testsvc-sprint017-erpsolution-co-kr.midasweb.net/performance/goal/appraisal')
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
	WebUI.navigateToUrl('https://midasinhrqa101.erpsolution.co.kr/performance/goal/appraisal')
	WebUI.delay(1)
}


WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="top-table-control__topTableControlWrap---Px-o"]//*[@id="monthly-appraisal"]/div[2]'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(3)

// 본인평가 > B본부장 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="appraisal-list"]//*[@class="virtualScroll__container--3B8-n"]/article[2]/article[1]'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)

// B조직과제 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="profileBox"]//*[@title="조직과제"]'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)

// 가중치 수정 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="assignment-item-wrap"]//*[text()="조직과제"]//ancestor::div[4]//*[text()="가중치 수정"]'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)

// 조직과제 가중치 입력
WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="operateChangeWeightPopup"]//*[text()="조직과제"]/../following-sibling::div[2]/input[1]'), "50",FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)

// 개인과제 가중치 입력
WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="operateChangeWeightPopup"]//*[text()="개인과제1"]/../following-sibling::div[2]/input[1]'), "50",FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)

// 저장 버튼 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="operateChangeWeightPopup"]//*[text()="저장"]'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)

// 평가 점수 입력란 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="assignment-item-wrap"]//*[text()="조직과제"]//ancestor::div[3]/div[2]//*[@class="scoreText"]'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)

// 평가 D 입력
WebUI.focus(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="assignment-item-wrap"]//*[text()="조직과제"]//ancestor::div[4]//*[@title="목표대비 70% 미만 달성"]'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="assignment-item-wrap"]//*[text()="조직과제"]//ancestor::div[4]//*[@title="목표대비 70% 미만 달성"]'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)





WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="top-table-control__topTableControlWrap---Px-o"]//*[@id="monthly-appraisal"]/div[4]'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(3)
 
 // 본인평가 > B본부장 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="appraisal-list"]//*[@class="virtualScroll__container--3B8-n"]/article[2]/article[1]'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)

WebUI.scrollToPosition(0, 0)
 
 // B조직과제 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="profileBox"]//*[@title="조직과제"]'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)

 
 // 평가 점수 입력란 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="assignment-item-wrap"]//*[text()="조직과제"]//ancestor::div[3]/div[2]//*[@class="scoreText"]'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)

// 평가 D 입력
WebUI.focus(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="assignment-item-wrap"]//*[text()="조직과제"]//ancestor::div[4]//*[@title="목표대비 100% 초과 달성"]'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="assignment-item-wrap"]//*[text()="조직과제"]//ancestor::div[4]//*[@title="목표대비 100% 초과 달성"]'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)

 
 
 
 
 
 
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="top-table-control__topTableControlWrap---Px-o"]//*[@id="monthly-appraisal"]/div[7]'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(3)
 
// 본인평가 > B본부장 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="appraisal-list"]//*[@class="virtualScroll__container--3B8-n"]/article[2]/article[1]'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)

WebUI.scrollToPosition(0, 0)
  
// B조직과제 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="profileBox"]//*[@title="조직과제"]'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)

  
// 평가 점수 입력란 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="assignment-item-wrap"]//*[text()="조직과제"]//ancestor::div[3]/div[2]//*[@class="scoreText"]'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)
  
// 평가 s 입력
WebUI.focus(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="assignment-item-wrap"]//*[text()="조직과제"]//ancestor::div[4]//*[@title="목표대비 100% 초과 달성"]'), FailureHandling.STOP_ON_FAILURE)
  
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="assignment-item-wrap"]//*[text()="조직과제"]//ancestor::div[4]//*[@title="목표대비 100% 초과 달성"]'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)