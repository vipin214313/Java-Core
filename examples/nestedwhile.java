public class nestedwhile {
    public static void main(String[] args) {
        int row=1;
        while(row<=10){
            int col=1;
            while(col<=10){
                int table=row*col;
                System.out.print(table + "\t");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
