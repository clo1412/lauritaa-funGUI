package creature;

public class User {
	public String[] users = {"lauritaa","burgerp","falconed","horriganb","shens", "adilettad"};
	
	public boolean findUser(String input){
        for(int i =0; i<users.length;i++)
            if (input.equals(users[i])) return true;
        return false;   
    }
	
	public User(){
        System.out.println("parent");
    }
}
