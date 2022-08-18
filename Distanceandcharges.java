import java.util.*;
class Distanceandcharges {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("enter the distance");
        float dist = SC.nextInt();
        float cost;

        if(dist<=100){
            cost = dist*8;
        }
        else if(dist<=200){
            cost = dist*10;
        }
        else if(dist<=500){
            cost = dist*12;
        }
        else{
            cost = dist*20;
        }
        System.out.println("charges are :"+ cost);
    }
}
