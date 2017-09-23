import $ivy.`com.lihaoyi::utest:0.5.3`

//interp.load.ivy( "com.lihaoyi" %% "utest" % "0.5.3")

 


import utest._

val tests = Tests{
    'test1 - {
      // throw new Exception("test1")
    }
    'test2 - {
      'inner - {
        1
      }
    }
    'test3 - {
      val a = List[Byte](1, 2)
      // a(10)
    }
  }


val results1 = TestRunner.run(tests)


val results1 = TestRunner.runAndPrint(tests, "MySuite")

////////////////////


import $ivy.`org.seleniumhq.selenium:selenium-java:3.5.3`

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome


val driver = new chrome.ChromeDriver





driver.findElement(By.ByTagName("body")).sendKeys(openDevTools);


