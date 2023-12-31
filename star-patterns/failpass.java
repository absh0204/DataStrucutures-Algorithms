import java.util.*;
public class failpass {
    public static void main(String args[]){
        float per;
        int max,marks;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Maximum marks:-");
        max=sc.nextInt();
        System.out.print("Enter the total marks obtained:-");
        marks=sc.nextInt();
        per=(marks*100)/max;
        System.out.print(per+"\n");
        String result=(per<33)?"YOUR ARE FAIL":"WELL DONE YOU ARE PASS";
        System.out.print(result);


    }
}
