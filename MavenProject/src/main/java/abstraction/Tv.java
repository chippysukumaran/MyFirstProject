package abstraction;

public class Tv implements Remote,AcRemote{

	public static void main(String[] args) {
		Tv t=new Tv();
		t.on();
		t.off();
		t.on();
		t.dipay();
	}

	@Override
	public void on() {
		System.out.println("TV is on");
		
	}

	@Override
	public void off() {
		System.out.println("TV is off");
		
	}

	@Override
	public void dipay() {
		System.out.println("AC Remote");
		
	}

}
