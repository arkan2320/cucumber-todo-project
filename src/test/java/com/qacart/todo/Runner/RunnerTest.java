package com.qacart.todo.Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        // استخدم المسار النسبي (من أول src) وبلاش المسار الكامل اللي بيبدأ بالدرايفر
        features = "src/test/resources/features",
        // 2. ده التعديل المهم: اكتب اسم الباكيج مش مسار الفولدر
        glue = "com.qacart.todo"

)
public class RunnerTest extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
