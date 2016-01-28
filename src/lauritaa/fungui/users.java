/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lauritaa.fungui;

/**
 *
 * @author Andrew_2
 */
public class users {
    // array of users availible to hack
    public String[] users = {"lauritaa","burgerp","falconed","horriganb","shens", "adilettad"};
    /**
     * checks so see if a string matches a user
     * @param input
     * @return 
     */
    public boolean findUser(String input){
        for(int i =0; i<users.length;i++){
            if (input.equals(users[i])){
                return true;
            }
            
        }
        return false;   
    }
    /**
     * constructor for an instantiated users class
     */
    public users(){
        System.out.println("parent");
    }
}
