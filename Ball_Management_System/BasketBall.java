package Ball_Management_System;
public class BasketBall extends Ball {
    public BasketBall(double radius){
        super(radius);
    }

    public String getType(){
        return "basket ball";
    }

    public void playBasketBall(){
        System.out.println("Playing BasketBall!");
    }
}
