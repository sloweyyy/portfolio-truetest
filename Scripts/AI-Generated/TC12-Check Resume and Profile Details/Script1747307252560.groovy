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

WebUI.takeScreenshot(reportLocation + '/TC12/Step 2-Click on button resume - Navigate to page resumeresume.png')

"Step 3: Click on div profileSummary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/div_profileSummary'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 3-Click on div profileSummary.png')

"Step 4: Click on div skillsOverview"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/div_skillsOverview'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 4-Click on div skillsOverview.png')

"Step 5: Click on div container"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/div_container'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 5-Click on div container.png')

"Step 6: Click on div container"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/div_container'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 6-Click on div container.png')

"Step 7: Click on div container"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/div_container'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 7-Click on div container.png')

"Step 8: Click on div container"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/div_container'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 8-Click on div container.png')

"Step 9: Click on div container"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/div_container'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 9-Click on div container.png')

"Step 10: Click on button home -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/button_home'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 10-Click on button home - Navigate to page .png')

"Step 11: Click on div skilledInTech"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_skilledInTech'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 11-Click on div skilledInTech.png')

"Step 12: Click on button resume -> Navigate to page 'resume#resume'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_resume'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 12-Click on button resume - Navigate to page resumeresume.png')

"Step 13: Click on div productSupportEngineer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/div_productSupportEngineer'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 13-Click on div productSupportEngineer.png')

"Step 14: Click on item teamCoordination (coordinateWithTeams)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resume/item_teamCoordination"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resume/item_teamCoordination', ['item_teamCoordination_liNthChild': item_teamCoordination_liNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 14-Click on item teamCoordination coordinateWithTeams.png')

"Step 15: Click on item teamCoordination (coordinateWithTeams)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resume/item_teamCoordination"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resume/item_teamCoordination', ['item_teamCoordination_liNthChild': item_teamCoordination_liNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 15-Click on item teamCoordination coordinateWithTeams.png')

"Step 16: Click on button linkedIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/button_linkedIn'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 16-Click on button linkedIn.png')

"Step 17: Click on div backendEngineerFocus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/div_backendEngineerFocus'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 17-Click on div backendEngineerFocus.png')

"Step 18: Click on span letter (letterO)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resume/span_letter"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resume/span_letter', ['span_letter_spanNthChild': span_letter_spanNthChild, 'span_letter_spanNthChild_1': span_letter_spanNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 18-Click on span letter letterO.png')

"Step 19: Click on span letter (letterT)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resume/span_letter"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resume/span_letter', ['span_letter_spanNthChild': span_letter_spanNthChild_1, 'span_letter_spanNthChild_1': span_letter_spanNthChild_1_1]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 19-Click on span letter letterT.png')

"Step 20: Click on div fullProfileSummary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/div_profileSummary'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 20-Click on div fullProfileSummary.png')

"Step 21: Click on span letterA"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/span_letterA'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 21-Click on span letterA.png')

"Step 22: Click on div backendEngineerFocus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/div_backendEngineerFocus'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 22-Click on div backendEngineerFocus.png')

"Step 23: Click on button viewPdf2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'resume?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/button_viewPdf2'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 23-Click on button viewPdf2 - Navigate to page .png')

"Step 24: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC12-Check Resume and Profile Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}