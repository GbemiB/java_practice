/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverloadingContructor;

/**
 *
 * @author bellogbemisola
 */
public class overloadingcontructor { //CONSTRUCTOR OVERLOADING

    String gold;
    String suit;
    String diamond;
    String rank;
    Boolean faceUp;

    public void playingCard(){
        suit  = diamond; rank = "1st"; faceUp = true;
      }

    public void playingCard(String suit ){
        suit  = diamond; rank = "2nd" ; faceUp = true;
      }

    public void playingCard(String suit, int gold ){
        suit  = diamond; rank ="3rd"; faceUp = true;
      }
}
