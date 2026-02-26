package Ball_Management_System;
class TennisBall extends Ball 
{
    public TennisBall(double radius){
        super(radius);
    }

    public String getType(){
        return "tennis Ball";
    }

    public void playTennis(){
        System.out.println("Playing Tennis!");
    }
    
}
