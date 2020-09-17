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
sp_id = "sprint017"
passwd = "mid@sit147"
num = 200

String currentTime1 = new Date().format('yyyy.MM.dd')

// b부서장 로그인 
WebUI.openBrowser('')
WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)
WebUI.navigateToUrl('https://testsvc-' + sp_id + '-erpsolution-co-kr.midasweb.net/')
WebUI.delay(3)
WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'username'), sp_id)
WebUI.delay(1)
WebUI.setText(CustomKeywords.'common.dynamicTestobject.getSelectorTypeObject'('name', 'password'), passwd, FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@id="frm"]/div[3]/button'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)

// 과제보기 페이지 이동
WebUI.navigateToUrl('https://testsvc-sprint017-erpsolution-co-kr.midasweb.net/performance/goal/operate')
WebUI.delay(1)


// 목표관리 선택
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="box__box--3Ml2g box__box-border--mJp7o font__font-ellipsis--2_5BV selectBox__selectBox--Ft3WZ goalManageSelect__select--tWAT_ button__button--QISUP font__font-default--1wm_8"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

// 해당 목표관리 선택
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[text()="2020년 하반기 목표관리 [피드백] #박인건"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

// 공유과제 보기 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[text()="공유과제 보기"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

// 하위과제 검색
WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="input-button-input-area-wrap"]/input'), '하위과제', FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)


// 검색 버튼 클릭
WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[text()="검색"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

// 과제명 클릭
//WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[text()="[피드백][하위과제] G파트장2 - 개인과제(정성) > 특수문자"]'), FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.delay(3)

//WebUI.switchToWindowTitle("[피드백][하위과제] G파트장2 - 개인과제(정성) > 특수문자 - 과제상세", FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.delay(1)

// 피드백 클릭
//WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[text()="피드백"]'), FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.delay(1)

WebUI.switchToWindowTitle("[피드백][하위과제] G파트장2 - 개인과제(정성) > 특수문자", FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.focus(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="gFeedbackPopup__listWrap--jMQQu"]/div[9]"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)

// 댓글 달 피드백 선택
//WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="gFeedbackPopup__listWrap--jMQQu"]/div[9]"]'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)



while (num < 300)
{
	// 댓글 생성
	WebUI.setText(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[@class="gFeedbackPopup__textarea--46ePf functionalTextarea__textarea--3JWw0 functionalTextarea__empty--2RyjY"]'), num + '. 댓글 추가 시 성능을 알아보기 위한 검증입니다. 글자수는 약 160자 정도로 설정하여 현실 가능성이 있는 글자수를 셋팅 하였습니다. 추가로 댓글 추가 시 느려지는 구간을 확인하고 현재는 개수 제한이 없어 고객에게 어느 정도의 권장사항을 만들어 줄 수 있는 기준치가 되면 좋을거 같습니다.', FailureHandling.STOP_ON_FAILURE)
	WebUI.delay(2)
	WebUI.click(CustomKeywords.'common.dynamicTestobject.getXpathObject'('//*[text()="보내기"]'), FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.delay(1)
	num++
}

