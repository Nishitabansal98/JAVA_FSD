package lockedme;

public class Main {
     /*Enter your desired Directory path */
	public static final String path = "C:\\JAVA_FSD\\Nishita_Phase1_AssignmentProject\\src\\lockedme\\Project Files"; 
	
	public static void main(String[] args) {
		Menus menu = new Menus();
		menu.introScreen();
		menu.mainMenu();
	}
}