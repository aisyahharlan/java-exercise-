
public class Calculate {
    public static void main(String[] args) {

        System.out.print("Enter num1 opt num2 (5 * 3) :");

        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        char opt = sc.next().charAt(0);
        double num2 = sc.nextDouble();

        if (opt == '+'){
            System.out.println( (int)(num1 + num2 ));
        }
        else
        if (opt == '-'){
            System.out.println( (int)(num1 - num2));
        }
        else
        if(opt == '/') System.out.println((int) (num1 / num2));
        else
        if (opt == '*') {
            System.out.println((int)(num1 * num2));
        }
        else
            System.out.print("wrong");


    }



}
}
