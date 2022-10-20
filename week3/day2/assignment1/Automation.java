package week3.day2.assignment1;

public class Automation extends MultipleLangauge implements Language, TestTool {

	public static void main(String[] args) {
		
		Automation automation = new Automation();
		automation.Selenium();
		automation.java();
		automation.javaScript();
		automation.ruby();
		automation.python();

	}

	public void Selenium() {
		 System.out.println("Selenium");
		
	}

	public void java() {
		System.out.println("Java");
		
	}

	public void javaScript() {
		System.out.println("Javascript");
	}

	public void ruby() {
		System.out.println("Ruby");
		
	}

	

}
