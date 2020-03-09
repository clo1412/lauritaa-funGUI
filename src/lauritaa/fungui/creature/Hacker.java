package creature;

public class Hacker extends User{
	public String hackattack(String input){
        if (findUser(input)) return "User hacked";
        else return "User does not exist";
    }
   
    public Hacker(){
        System.out.println("hacker");
    }
}
