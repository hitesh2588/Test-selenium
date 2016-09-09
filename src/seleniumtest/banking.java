package seleniumtest;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;

public class banking {
	
	//Calculator calc=new Calculator();
	
	public void profit(){
		
	}

	public void loss(){
		
	}
	
	public void addSalary(){
		
		//calc.add();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		banking b= new banking();
		b.addSalary();
		
		/*DefaultSelenium selenium= new DefaultSelenium();
		selenium.start();
		selenium.open("http://google.com");
		selenium.windowMaximize();*/
		
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		String title=driver.getTitle();
		
		title.length();
		
		System.out.println(driver.getTitle().length());
		
		System.out.println(title.length());
		//driver.manage().window().maximize();
		
		Options opt = driver.manage();
		Window win = opt.window();
		win.maximize();
		
	}

}


