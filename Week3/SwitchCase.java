package Week3;

public class SwitchCase {
    public static void main(String[] args) {
        char value ='a';
        int numVal = 10;
        switch (value) {
            case 'a':
            // Nested Switch
            switch(numVal){
                case 10:
                    System.out.println("10");
                    break;
                default:
                    System.out.println("Default");
                    break;
            }
                System.out.println("Apple");
                break;
            case 'b':
                System.out.println("Ball");
                break;
            case 'c':
                System.out.println("CAt");
                break;
            case 'd':
                System.out.println("Dog");
                break;
            default:
                System.out.println("NO word found");
                break;
        }
    }
    

  
}
