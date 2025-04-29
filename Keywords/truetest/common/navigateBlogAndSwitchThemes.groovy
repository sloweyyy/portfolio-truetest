package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class navigateBlogAndSwitchThemes {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on header academicJourney -> Navigate to page 'blog post#blog/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_blog/header_academicJourney'))
        
        "Step 2: Click on button blog -> Navigate to page 'blog#blog'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_blog_post/button_blog'))
        
        "Step 3: Click on header blogTitle -> Navigate to page 'blog post#blog/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_blog/header_blogTitle'))
        
        "Step 4: Click on button resume -> Navigate to page 'resume#resume'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_blog_post/button_resume'))
        
        "Step 5: Click on button switchToLightMode"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/button_switchToLightMode'))
        
        "Step 6: Click on button switchToDarkMode"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_resume/button_switchToDarkMode'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

