import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on header object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/header_object'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 2-Click on header object.png')

"Step 3: Click on header locationInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/header_locationInfo'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 3-Click on header locationInfo.png')

"Step 4: Click on header fullStackDeveloper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/header_object'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 4-Click on header fullStackDeveloper.png')

"Step 5: Click on button navigation (contact)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_navigation', ['button_navigation_internalText': button_navigation_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 5-Click on button navigation contact.png')

"Step 6: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 6-Click on button close.png')

"Step 7: Click on button navigation (about2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_navigation', ['button_navigation_internalText': button_navigation_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 7-Click on button navigation about2.png')

"Step 8: Click on button navigation (about2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_navigation', ['button_navigation_internalText': button_navigation_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 8-Click on button navigation about2.png')

"Step 9: Click on button navigation (work)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/button_navigation', ['button_navigation_internalText': button_navigation_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 9-Click on button navigation work.png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Navigate Through Header Options in Portfolio Web_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}