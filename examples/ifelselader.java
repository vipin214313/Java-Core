public class ifelselader {
    public static void main(String[] args) {
        double totalMrak=385;

        double percentage=(totalMrak/500)*100;
        String grade;
        if(percentage>=80){
            grade ="A";

        }else if(percentage>=70){
            grade="B";
        }else if(percentage>=60){
            grade="C";
        }else{
            grade="F";
        }
        System.out.println("the total percentage is "+percentage);
        System.out.println("the Grade is "+grade);
    }
}
