package Week3.Day2;

public class college extends University{
	

	@Override
	public void pg() {
		
	}

	@Override
	public void ug() {
		System.out.println("undergraduate");
		
	}
	
	public static void main(String[] args) {
		college col= new college();
		col.pg();
		col.ug();
	}

}
