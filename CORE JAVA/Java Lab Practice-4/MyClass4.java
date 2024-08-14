package LabPracticeiv;
class Sports{
	void play()
	{
		System.out.println("There are different kinds of sports");
	}
}
class FootBall extends Sports{
	void play() {
		System.out.println("Playing Football: Kicking the ball into the goal!");
	}
}
class BasketBall extends Sports{
	void play() {
		System.out.println("Playing Basketball: Shooting hoops and dribbling the ball!");
	}
}
class RugBy extends Sports{
	void play() {
		System.out.println("Playing Rugby: Passing the ball and tackling opponents!");
	}
}
public class MyClass4 {

	public static void main(String[] args) {
		FootBall football=new FootBall();
		football.play();
	    BasketBall basketball=new BasketBall();
		basketball.play();
       RugBy rugby=new RugBy();
       rugby.play();
	}

}
