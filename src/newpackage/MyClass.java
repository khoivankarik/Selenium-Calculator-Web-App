package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyClass {
	/*
	 * public static void main(String[] arg) {
	 * 
	 * //testSuma(); //so nguyen + so thap phan //testSubtracta(); //so nguyen - so
	 * thap phan //testMula(); //so nguyen * so thap phan //testDiva(); //so nguyen
	 * : so thap phan //testCona(); //so nguyen merge so thap phan }
	 */
	
    public static void testSuma(){ //so nguyen + so thap phan
    	System.setProperty("webdriver.chrome.driver","./src/newpackage/chromedriver.exe");
    	WebDriver driver = new ChromeDriver(); 
        
        String url = "https://testsheepnz.github.io/BasicCalculator.html";      
        String expectedResult = "26.4";
        String result = "";
        

       
        for(int i=0;i<9;i++)
        {   
        	String val = Integer.toString(i);
            driver.get(url);
            driver.findElement(By.name("number1")).sendKeys("25");
            driver.findElement(By.name("number2")).sendKeys("1.4");
            
            WebElement element2 = (WebElement)driver.findElement(By.name("selectBuild"));
            Select select2 = new Select(element2);
            select2.selectByValue(val);
            
            WebElement element = (WebElement)driver.findElement(By.name("selectOperation"));
            Select select = new Select(element);
            select.selectByValue("0"); //sum
            
            
            driver.findElement(By.id("calculateButton")).click();
            result = driver.findElement(By.name("numberAnswer")).getAttribute("value");
            
            
            if (result.equals(expectedResult)) {
                System.out.println("Prototype "+i+" :Pass");
            }
            else{
                System.out.println("Prototype "+i+" :Fail"+ " wrong result ");
                
            }
        }
        driver.close();  
    }
    
    public static void testSubtracta(){ //so nguyen - so thap phan
    	System.setProperty("webdriver.chrome.driver","./src/newpackage/chromedriver.exe");
    	WebDriver driver = new ChromeDriver(); 
        
        String url = "https://testsheepnz.github.io/BasicCalculator.html";      
        String expectedResult = "23.6";
        String result = "";
        

       
        for(int i=0;i<9;i++)
        {   
        	String val = Integer.toString(i);
            driver.get(url);
            driver.findElement(By.name("number1")).sendKeys("25");
            driver.findElement(By.name("number2")).sendKeys("1.4");
            
            WebElement element2 = (WebElement)driver.findElement(By.name("selectBuild"));
            Select select2 = new Select(element2);
            select2.selectByValue(val);
            
            WebElement element = (WebElement)driver.findElement(By.name("selectOperation"));
            Select select = new Select(element);
            select.selectByValue("1"); //subtract
            
            
            driver.findElement(By.id("calculateButton")).click();
            result = driver.findElement(By.name("numberAnswer")).getAttribute("value");
            
            
            if (result.equals(expectedResult)) {
                System.out.println("Prototype "+i+" :Pass");
            }
            else{
                System.out.println("Prototype "+i+" :Fail"+ " wrong result ");
                
            }
        }
        driver.close();  
    }
    
    public static void testMula(){ //so nguyen * so thap phan
    	System.setProperty("webdriver.chrome.driver","./src/newpackage/chromedriver.exe");
    	WebDriver driver = new ChromeDriver(); 
        
        String url = "https://testsheepnz.github.io/BasicCalculator.html";      
        String expectedResult = "9";
        String result = "";
        

       
        for(int i=0;i<9;i++)
        {   
        	String val = Integer.toString(i);
            driver.get(url);
            driver.findElement(By.name("number1")).sendKeys("6");
            driver.findElement(By.name("number2")).sendKeys("1.5");
            
            WebElement element2 = (WebElement)driver.findElement(By.name("selectBuild"));
            Select select2 = new Select(element2);
            select2.selectByValue(val);
            
            WebElement element = (WebElement)driver.findElement(By.name("selectOperation"));
            Select select = new Select(element);
            select.selectByValue("2"); //Multiply
            
            
            driver.findElement(By.id("calculateButton")).click();
            result = driver.findElement(By.name("numberAnswer")).getAttribute("value");
            
            
            if (result.equals(expectedResult)) {
                System.out.println("Prototype "+i+" :Pass");
            }
            else{
                System.out.println("Prototype "+i+" :Fail wrong result");
                
            }
        }
        driver.close();  
    }

    public static void testDiva(){ //so nguyen / so thap phan
    	System.setProperty("webdriver.chrome.driver","./src/newpackage/chromedriver.exe");
    	WebDriver driver = new ChromeDriver(); 
        
        String url = "https://testsheepnz.github.io/BasicCalculator.html";      
        String expectedResult = "4";
        String result = "";
        

       
        for(int i=0;i<9;i++)
        {   
        	String val = Integer.toString(i);
            driver.get(url);
            driver.findElement(By.name("number1")).sendKeys("6");
            driver.findElement(By.name("number2")).sendKeys("1.5");
            
            WebElement element2 = (WebElement)driver.findElement(By.name("selectBuild"));
            Select select2 = new Select(element2);
            select2.selectByValue(val);
            
            WebElement element = (WebElement)driver.findElement(By.name("selectOperation"));
            Select select = new Select(element);
            select.selectByValue("3"); //Div
            
            
            driver.findElement(By.id("calculateButton")).click();
            result = driver.findElement(By.name("numberAnswer")).getAttribute("value");
            
            
            if (result.equals(expectedResult)) {
                System.out.println("Prototype "+i+" :Pass");
            }
            else{
                System.out.println("Prototype "+i+" :Fail wrong result");
                
            }
        }
        driver.close();  
    }

    public static void testCona(){ //so nguyen / so thap phan
    	System.setProperty("webdriver.chrome.driver","./src/newpackage/chromedriver.exe");
    	WebDriver driver = new ChromeDriver(); 
        
        String url = "https://testsheepnz.github.io/BasicCalculator.html";      
        String expectedResult = "61.5";
        String result = "";
        

       
        for(int i=0;i<9;i++)
        {   
        	String val = Integer.toString(i);
            driver.get(url);
            driver.findElement(By.name("number1")).sendKeys("6");
            driver.findElement(By.name("number2")).sendKeys("1.5");
            
            WebElement element2 = (WebElement)driver.findElement(By.name("selectBuild"));
            Select select2 = new Select(element2);
            select2.selectByValue(val);
            
            WebElement element = (WebElement)driver.findElement(By.name("selectOperation"));
            Select select = new Select(element);
            select.selectByValue("4"); //Concentrate
            
            
            driver.findElement(By.id("calculateButton")).click();
            result = driver.findElement(By.name("numberAnswer")).getAttribute("value");
            
            
            if (result.equals(expectedResult)) {
                System.out.println("Prototype "+i+" :Pass");
            }
            else{
                System.out.println("Prototype "+i+" :Fail wrong result");
                
            }
        }
        driver.close();  
    }

}
