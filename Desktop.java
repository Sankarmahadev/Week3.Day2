package Week3.Day2;

public class Desktop implements Hardware
{
	public void hardwareResources() {
		System.out.println("hardware");
		
	}

	public void softwareResources() {
		System.out.println("software");
	}


public static void main(String[] args) {
	Desktop des= new Desktop();
	des.hardwareResources();
	des.softwareResources();
}
}
