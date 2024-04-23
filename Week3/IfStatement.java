package Week3;
public class IfStatement{
    public static void main(String[] args) {
        /* Simple if statement, takes condition/expression with boolen value */
        if(true){
            System.out.println("True Statement");
        }
        if(false){
            System.out.println("Skipped Statement");
        }else{
            System.out.println("False Statement");
        }
        /* If condition fails, goes to else block/scope */
        int num1 = 10, num2= 20;
        if(num1 > num2){
            System.out.println("Num1 is greater");
        }else{
            System.out.println("Num2 is greater");
        }
        /* if else if */
        int iNum1 = 10 , iNum2 = 20;
        if(iNum1 == iNum2 ){
            System.out.println("iNum1 is greater");
        }else{
            System.out.println("iNum2 is greater");
        }
        /* Note that else should be at the last of the if statement */
        if(iNum1 <0){
            System.out.println("iNum1 is negative");
        }else if(iNum2 < 0){
            System.out.println("iNum2 is negative");
        }else if(iNum1 == iNum2){
            System.out.println("Equal Number");
        }else if(iNum1 < iNum2){
            System.out.println("iNum1 is less");
        }else{
            System.out.println("Default execution if all fails");
        }
        /* Note that else is not mandatory and cna be skipped */
        /* Question */
        int q1 = 10, q2 =10;
        if(q1 >= q2){
            System.out.println("1st Statement");
        }else if(q1 == q2){
            System.out.println("2nd Statement");
        }else{
            System.out.println("Default Statement");
        }
        /* Nested Statement */
        int nNum1 = -10, nNum2 = 20;
        if(nNum1 < 0){
            if(nNum1 > nNum2){
                System.out.println("nNum1 is negative and greater");
            }else{
                System.out.println("nNum1 is negative and lesser");
            }
        }else{
            if(nNum1 > nNum2){
                System.out.println("nNum1 is positive and greater");
            }else{
                System.out.println("nNum2 is positive and lesser");
            }
        }
        /* Task
         * Given the value below, add the total and take the average
         * if any of the marking is less than 35, print "Fail"
         * if average is less than 60, print "3rd div"
         * if average is less than 70, print "2nd div"
         * if average is less than 80, print "1st div"
         */
        int math = 38, science = 60, english= 35;
        if(math < 35 && science < 35 && english <35){
            System.out.println("Fail");
        }else if(math< 60 && science< 60 && english< 60){
            System.out.println("3rd div");
        }else if(math <70 && science< 70 && english< 60){
            System.out.println("2nd div");
        }else if(math <80 && science< 80 && english<80){
            System.out.println("1st div");
            
        }

        }

    }