package Ball_Management_System;
class Ball {
    private double radius;
    public Ball(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public void bounce(){
        System.out.println("Ball is bouncing...");
    }
    public String getType(){
        return "Generic Ball";
    }
}
