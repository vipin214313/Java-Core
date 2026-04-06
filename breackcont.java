public class breackcont {
    public static void main(String[] args) {
        for(int i  =1;i<=5;i++){
            if(i==3){
                // break;//exit when i is 3
                continue;//skip when i is 3
            }
            System.out.println(i);
        }
    }
}
