import java.util.Scanner;

public class ifelseDemo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter teh number of copy to be printed");
        int noofCopy=s.nextInt();

        if(noofCopy >0 && noofCopy <100){
            int pricePercopy=5;
            System.out.println("price per copy"+pricePercopy);
            int totalCost=noofCopy*pricePercopy;
            System.out.println("total cost is "+totalCost);
        }
        else if(noofCopy >=100 && noofCopy <500){
            int pricePercopy=4;
            System.out.println("price per copy"+pricePercopy);
            int totalCost=noofCopy*pricePercopy;
            System.out.println("total cost os "+totalCost);
        }else if(noofCopy >=500 && noofCopy<800){
            int pricePercopy=3;
            System.out.println("price per copy "+pricePercopy);
            int totalCost=pricePercopy*noofCopy;
            System.out.println("tottal cost is "+totalCost);
        }else if(noofCopy >=800 && noofCopy <1000){
            int pricePercopy=2;
            System.out.println("price per copy"+pricePercopy);
            int totalCost=noofCopy*pricePercopy;
            System.out.println("total cost is"+totalCost);
        }else{
            int pricePercopy=1;
            System.out.println("price per copy"+pricePercopy);
            int totalCost=noofCopy*pricePercopy;
            System.out.println("total cost is "+totalCost);
        }
    }
}
