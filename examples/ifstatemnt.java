public class ifstatemnt{
    public static void main(String[] args) {
        int age=25;
        if(age>18){
            System.out.println("the user is minors");
        }

        //if-else statemnt
        int num=5;
        if(num>=0){
            System.out.println("given number is pastive");
        }else{
            System.out.println("the number is negative values");

        }
        //switch satement
        char garde='A';
        switch (garde) {
            case 'A':
                System.out.println("excellent");
                
                break;
                case 'B':
                    System.out.println("good");
                    break;
                    case 'C':
                        System.out.println("everage");
            break;
            default:
                System.out.println("the garde not define");
        }
    }

}