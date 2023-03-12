import java.util.Scanner;

public class instance {
    public static int numInstances=0;
    public instance(){
        ++numInstances;
    }
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char answer;
        while (true) {
            System.out.println("Do you want to create an instance? y/n ");
            answer = in.next().charAt(0);
            if (answer == 'y') {
                instance i = new instance();
            } else if(answer != 'n') {
                System.out.println("please answer with y or n");
            }
            System.out.println("number of the created instances is: "+numInstances);
        }
    }
}
