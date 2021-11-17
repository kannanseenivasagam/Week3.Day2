package week3.Day2;

public class AutomationAssignment1 extends MultipleLangaugeAssignment1 implements LanguageAssignment1, TestToolAssignment1 {

	public static void main(String[] args) {
		AutomationAssignment1 automation = new AutomationAssignment1();
		automation.python();
		automation.ruby();
		automation.Selenium();
		automation.java();

	}

	public void Selenium() {
		System.out.println("Selenium is from TestTool interface");
		
	}

	public void java() {
		System.out.println("Java is from Language interface");
		
	}

	@Override
	public void ruby() {
		System.out.println("Ruby is an unimpl method in MultipleLanguage abstract class");
		
	}

}
