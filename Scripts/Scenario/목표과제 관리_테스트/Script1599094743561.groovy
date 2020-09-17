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

bbsj = "bbsj1"
bgsw = "bgsw1"
cgsw = "cgsw1"
dgsw = "dgsw1"
egsw = "egsw1"
fgsw = "fgsw1"

sp_id = "sprint016"
passwd = "mid@sit147"

pro_url = "https://midasinhrqa101.erpsolution.co.kr/performance/goal/operate"
pro_admin = "midasinhrqa101"

String currentTime1 = new Date().format('yyyy.MM.dd')

// b부서장 로그인 
WebUI.openBrowser('')
WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

/*
//스테이징 도메인
WebUI.navigateToUrl('https://testsvc-' + sp_id + '-erpsolution-co-kr.midasweb.net/')
WebUI.delay(3)


WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'username'), sp_id)
WebUI.delay(1)
WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'password'), passwd, FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="frm"]/div[3]/button'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)

// 과제보기 페이지 이동(스테이징)
WebUI.navigateToUrl('https://testsvc-' + sp_id +'-erpsolution-co-kr.midasweb.net/performance/goal/operate')
WebUI.delay(1)


for(int i=1; i<10; i++){
	String name = "[최상위] 조직과제 - " + i
	// 신규 과제 생성 클릭
	WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="module-text-button"]//*[text()="신규과제 생성"]'), FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.delay(1)
	
	
	// 과제 구분 선택
	WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="assignmentRow kind"]//*[@data-module-type="select-box"]'), FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.delay(1)
	
	// 조직과제 선택
	WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="overlay-common"]/div/div/div/div[2]/div/div/div[1]'), FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.delay(1)
	
	// 조직과제명 입력
	WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="assignmentRow name"]//*[@class="module-input module-basic-input"]'), name, FailureHandling.STOP_ON_FAILURE)
	WebUI.delay(1)
	
	// B부서장 담당자 추가
	WebUI.focus(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('class', 'recipientSearch'), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="assignmentRow assignee"]//*[@class="module-input module-basic-input input-button-input-area"]'), 'B본부장', FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.delay(1)
	WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="autoPosition__autoPosition--2LVU9 box__box-after-clear--4VcYO"]'), FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.delay(1)
	
	WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="operateNewAssignmentPopup"]/header/div[2]/button[1]/span'), FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.delay(2)
			
}


WebUI.closeBrowser()



//스테이징 도메인
WebUI.navigateToUrl('https://testsvc-' + sp_id + '-erpsolution-co-kr.midasweb.net/')
WebUI.delay(3)


WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'username'), bbsj)
WebUI.delay(1)
WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'password'), passwd, FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="frm"]/div[3]/button'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)

// 과제보기 페이지 이동(스테이징)
WebUI.navigateToUrl('https://testsvc-' + sp_id +'-erpsolution-co-kr.midasweb.net/performance/goal/operate')
WebUI.delay(1)


for(int i=1; i<10; i++){
	String name = "[B본부장] 조직과제 - " + i
	// 하위 과제 연결 클릭
	WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="local-body"]/div[1]/div[2]/div[3]/article[1]//*[text()="하위과제 생성"]'), FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.delay(1)
	
	// 과제 구분 선택
	WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="assignmentRow kind"]//*[@data-module-type="select-box"]'), FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.delay(1)
	
	// 조직과제 선택
	WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="overlay-common"]/div/div/div/div[2]/div/div/div[1]'), FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.delay(1)
	
	// 조직과제명 입력
	WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="assignmentRow name"]//*[@class="module-input module-basic-input"]'), name, FailureHandling.STOP_ON_FAILURE)
	WebUI.delay(1)
	
	// B구성원/F구성원 담당자 추가
	WebUI.focus(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('class', 'recipientSearch'), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="assignmentRow assignee"]//*[@class="module-input module-basic-input input-button-input-area"]'), 'B 구성원', FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.delay(1)
	WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="autoPosition__autoPosition--2LVU9 box__box-after-clear--4VcYO"]'), FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.delay(1)
	
	WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="assignmentRow assignee"]//*[@class="module-input module-basic-input input-button-input-area"]'), 'C 구성원', FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.delay(1)
	WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="autoPosition__autoPosition--2LVU9 box__box-after-clear--4VcYO"]'), FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.delay(1)
	
	WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="assignmentRow assignee"]//*[@class="module-input module-basic-input input-button-input-area"]'), 'D 구성원', FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.delay(1)
	WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="autoPosition__autoPosition--2LVU9 box__box-after-clear--4VcYO"]'), FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.delay(1)
	
	WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="assignmentRow assignee"]//*[@class="module-input module-basic-input input-button-input-area"]'), 'E 구성원', FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.delay(1)
	WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="autoPosition__autoPosition--2LVU9 box__box-after-clear--4VcYO"]'), FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.delay(1)
	
	WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="assignmentRow assignee"]//*[@class="module-input module-basic-input input-button-input-area"]'), 'F 구성원', FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.delay(1)
	WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="autoPosition__autoPosition--2LVU9 box__box-after-clear--4VcYO"]'), FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.delay(1)
	
	WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="operateNewAssignmentPopup"]/header/div[2]/button[1]/span'), FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.delay(2)
			
}

WebUI.closeBrowser()

*/

for(int j=1; j<4; j++){
	if (j==1){
		WebUI.openBrowser('')
		WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)
		
		//스테이징 도메인
		WebUI.navigateToUrl('https://testsvc-' + sp_id + '-erpsolution-co-kr.midasweb.net/')
		WebUI.delay(3)
		
		WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'username'), bgsw)
		WebUI.delay(1)
		WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'password'), passwd, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(1)
		WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="frm"]/div[3]/button'), FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(1)
		
		// 과제보기 페이지 이동(스테이징)
		WebUI.navigateToUrl('https://testsvc-' + sp_id +'-erpsolution-co-kr.midasweb.net/performance/goal/operate')
		WebUI.delay(1)
			for(int i=3; i<10; i++){
				
				String name = "[B구성원] 개인과제 - " + i
				// 하위 과제 연결 클릭
				WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="local-body"]/div[1]/div[2]/div[3]/article[1]//*[text()="하위과제 생성"]'), FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.delay(1)		
							
				// 개인과제명 입력
				WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="assignmentRow name"]//*[@class="module-input module-basic-input"]'), name, FailureHandling.STOP_ON_FAILURE)
				WebUI.delay(1)
	
				// 과제 생성 버튼 클릭
				WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="operateNewAssignmentPopup"]/header/div[2]/button[1]/span'), FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.delay(2)
			}
	}
	
	if (j==2){
		WebUI.openBrowser('')
		WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)
		
		//스테이징 도메인
		WebUI.navigateToUrl('https://testsvc-' + sp_id + '-erpsolution-co-kr.midasweb.net/')
		WebUI.delay(3)
		
		WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'username'), cgsw)
		WebUI.delay(1)
		WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'password'), passwd, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(1)
		WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="frm"]/div[3]/button'), FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(1)
		
		// 과제보기 페이지 이동(스테이징)
		WebUI.navigateToUrl('https://testsvc-' + sp_id +'-erpsolution-co-kr.midasweb.net/performance/goal/operate')
		WebUI.delay(1)
		
		for(int i=1; i<10; i++){

			String name = "[C구성원] 개인과제 - " + i
			// 하위 과제 연결 클릭
			WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="local-body"]/div[1]/div[2]/div[3]/article[1]//*[text()="하위과제 생성"]'), FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.delay(1)
						
			// 개인과제명 입력
			WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="assignmentRow name"]//*[@class="module-input module-basic-input"]'), name, FailureHandling.STOP_ON_FAILURE)
			WebUI.delay(1)

			// 과제 생성 버튼 클릭
			WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="operateNewAssignmentPopup"]/header/div[2]/button[1]/span'), FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.delay(2)
		}
		WebUI.closeBrowser()
	}
	
	if (j==3){
		WebUI.openBrowser('')
		WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)
		
		//스테이징 도메인
		WebUI.navigateToUrl('https://testsvc-' + sp_id + '-erpsolution-co-kr.midasweb.net/')
		WebUI.delay(3)
		
		WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'username'), dgsw)
		WebUI.delay(1)
		WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'password'), passwd, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(1)
		WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="frm"]/div[3]/button'), FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(1)
		
		// 과제보기 페이지 이동(스테이징)
		WebUI.navigateToUrl('https://testsvc-' + sp_id +'-erpsolution-co-kr.midasweb.net/performance/goal/operate')
		WebUI.delay(1)
		
		for(int i=1; i<10; i++){
			
			String name = "[D구성원] 개인과제 - " + i
			// 하위 과제 연결 클릭
			WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="local-body"]/div[1]/div[2]/div[3]/article[1]//*[text()="하위과제 생성"]'), FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.delay(1)
						
			// 개인과제명 입력
			WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="assignmentRow name"]//*[@class="module-input module-basic-input"]'), name, FailureHandling.STOP_ON_FAILURE)
			WebUI.delay(1)

			// 과제 생성 버튼 클릭
			WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="operateNewAssignmentPopup"]/header/div[2]/button[1]/span'), FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.delay(2)
		}
		WebUI.closeBrowser()
	}
	
	if (j==4){
		WebUI.openBrowser('')
		WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)
		
		//스테이징 도메인
		WebUI.navigateToUrl('https://testsvc-' + sp_id + '-erpsolution-co-kr.midasweb.net/')
		WebUI.delay(3)
		
		WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'username'), egsw)
		WebUI.delay(1)
		WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'password'), passwd, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(1)
		WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="frm"]/div[3]/button'), FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(1)
		
		// 과제보기 페이지 이동(스테이징)
		WebUI.navigateToUrl('https://testsvc-' + sp_id +'-erpsolution-co-kr.midasweb.net/performance/goal/operate')
		WebUI.delay(1)
		
		for(int i=1; i<10; i++){

			String name = "[E구성원] 개인과제 - " + i
			// 하위 과제 연결 클릭
			WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="local-body"]/div[1]/div[2]/div[3]/article[1]//*[text()="하위과제 생성"]'), FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.delay(1)
						
			// 개인과제명 입력
			WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="assignmentRow name"]//*[@class="module-input module-basic-input"]'), name, FailureHandling.STOP_ON_FAILURE)
			WebUI.delay(1)

			// 과제 생성 버튼 클릭
			WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="operateNewAssignmentPopup"]/header/div[2]/button[1]/span'), FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.delay(2)
		}
		WebUI.closeBrowser()
	}
		
		if (j==5){
			WebUI.openBrowser('')
			WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)
			
			//스테이징 도메인
			WebUI.navigateToUrl('https://testsvc-' + sp_id + '-erpsolution-co-kr.midasweb.net/')
			WebUI.delay(3)
			
			WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'username'), fgsw)
			WebUI.delay(1)
			WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'password'), passwd, FailureHandling.STOP_ON_FAILURE)
			WebUI.delay(1)
			WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="frm"]/div[3]/button'), FailureHandling.STOP_ON_FAILURE)
			WebUI.delay(1)
			
			// 과제보기 페이지 이동(스테이징)
			WebUI.navigateToUrl('https://testsvc-' + sp_id +'-erpsolution-co-kr.midasweb.net/performance/goal/operate')
			WebUI.delay(1)
			for(int i=1; i<10; i++){
				
				
				String name = "[F구성원] 개인과제 - " + i
				// 하위 과제 연결 클릭
				WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="local-body"]/div[1]/div[2]/div[3]/article[1]//*[text()="하위과제 생성"]'), FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.delay(1)
							
				// 개인과제명 입력
				WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="assignmentRow name"]//*[@class="module-input module-basic-input"]'), name, FailureHandling.STOP_ON_FAILURE)
				WebUI.delay(1)
	
				// 과제 생성 버튼 클릭
				WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="operateNewAssignmentPopup"]/header/div[2]/button[1]/span'), FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.delay(2)
			}
			WebUI.closeBrowser()
	}
			
}
