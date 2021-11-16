package week3.Day2;

public class Desktop implements Software, HardWare {

	public void desktopModel() {
		System.out.println("Desktop Model is New");

	}

	public void hardwareResources() {
		System.out.println("Hardware");

	}

	public void softwareResources() {
		System.out.println("Software");

	}

	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.desktopModel();
		desk.hardwareResources();
		desk.softwareResources();
	}
}
