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
public class hacker extends users{
    /**
     * method that runs findUser and relays back to the main method
     * @param input
     * @return 
     */
    public String hackattack(String input){
        if (findUser(input)){
            return "User hacked";
        }
        else return "User does not exist";
    }
    /**
     * constructor
     */
    public hacker(){
        System.out.println("hacker");
    }
}
