package Ball_Management_System;

import java.util.ArrayList;

public class Bag {
    private ArrayList<Ball> balls=new ArrayList<>();
    
    //add ball
    public void addBall(Ball ball){
        balls.add(ball);
        System.out.println("Ball added successfully.");
    }

    //remove ball
    public void removeBall(int index){
        if(index>=0 && index<balls.size()){
            balls.remove(index);
            System.out.println("Ball removed successfully.");
        }
        else{
            System.out.println("Invalid index.");
        }
    }

    //search ball
    public void searchBall(String type){

        boolean found=false;
        for(Ball ball:balls){
            if(ball.getType().equalsIgnoreCase(type))
            {
                System.out.println(type+"found with radius : "+ball.getRadius());
                found=true;
            }
        }
        if(!found)
        {
            System.out.println(type+"not found.");
        }


    }
    public void game()
    {
        if(balls.isEmpty()){
            System.out.println("No balls in bag!");
        }
        for(Ball ball : balls)
        {
            ball.bounce();//polymorphism

            if(ball instanceof TennisBall)
            {
                ((TennisBall) ball).playTennis();//Downcasting
            }
            else if(ball instanceof BasketBall)
            {
                ((BasketBall) ball).playBasketBall();
            }

            System.out.println("-------------");
        }
    }
    public void showAllBalls(){
        if(balls.isEmpty()){
            System.out.println("Bag is empty.");
            return;
        }
        
        for(int i=0;i<balls.size();i++)
        {
            Ball ball=balls.get(i);
            System.out.println(i+" - "+ball.getType()+" (Radius: "+ball.getRadius()+")");
        }
    }
}
