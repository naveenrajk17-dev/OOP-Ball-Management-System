package Ball_Management_System;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        Bag bag=new Bag();

        while(true)
        {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Ball");
            System.out.println("2. Remove Ball");
            System.out.println("3. Search Ball");
            System.out.println("4. Play Game");
            System.out.println("5. Show All Balls");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("1. Tennis Ball");
                    System.out.println("2. Basket Ball");
                    int type = sc.nextInt();

                    System.out.println("Enter radius: ");
                    double radius=sc.nextDouble();

                    if(type==1){
                        Ball t=new TennisBall(radius);//Upcasting
                        bag.addBall(t);
                    }
                    else if(type==2){
                        Ball b=new BasketBall(radius);//Upcasting
                        bag.addBall(b);
                    }
                    else{
                        System.out.println("Invalid type.");
                    }
                    break;
                
                case 2:
                    bag.showAllBalls();
                    System.out.println("Enter index to remove : ");
                    int index=sc.nextInt();
                    bag.removeBall(index);
                    break;

                case 3:
                    sc.nextLine();//clear buffer
                    System.out.println("Enter ball type to search : ");
                    String searchType=sc.nextLine();
                    bag.searchBall(searchType);
                    break;

                case 4:
                    bag.game();
                    break;

                case 5:
                    bag.showAllBalls();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
