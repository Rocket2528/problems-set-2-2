import java.util.Scanner;
class demo{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);{
            System.out.println(" ENTER FIRST NAME ");
            String fn = scan.nextLine();
            System.out.println(" ENTER LAST NAME ");
            String ls = scan.nextLine();
            System.out.println(" HOW MANY TIMES I PRINT ");
            int k = scan.nextInt();
            String join = fn+ls;
            for(int i=0;i<k;i=i+1){
                System.out.println(join);
            }

        }
    }
}