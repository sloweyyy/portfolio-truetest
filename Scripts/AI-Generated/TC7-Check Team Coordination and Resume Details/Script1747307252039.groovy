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

"Step 2: Click on button resume -> Navigate to page 'resume#resume'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_resume'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 2-Click on button resume - Navigate to page resumeresume.png')

"Step 3: Click on item teamCoordination (coordinateWithTeams)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resume/item_teamCoordination"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resume/item_teamCoordination', ['item_teamCoordination_liNthChild': item_teamCoordination_liNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3-Click on item teamCoordination coordinateWithTeams.png')

"Step 4: Click on item teamCoordination (coordinateWithTeams)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resume/item_teamCoordination"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resume/item_teamCoordination', ['item_teamCoordination_liNthChild': item_teamCoordination_liNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on item teamCoordination coordinateWithTeams.png')

"Step 5: Click on div dateTimePartTime"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/div_dateTimePartTime'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Click on div dateTimePartTime.png')

"Step 6: Click on div dateTimePartTime -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/div_dateTimePartTime'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Click on div dateTimePartTime - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Check Team Coordination and Resume Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}