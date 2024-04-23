package Week1;

public class VariableCLass{
    /* Instance variable
     * Needs object to access
     * not shared in multiple object
     */
    int instanceVariable = 10;
    /* Static Vaiable 
     * No need objects, can be accessed using class
     * shared in multiple object
     */

    public static void main(String[] args) {

        /* Non primitive Data Type */
        /* Declaration */
        byte byteVariable;
        /* Initialization */
        byteVariable = 100;
        /* Declaration and Initialization */
        short shortVariable = 1000;
        /*Multiple Declaration */
        int intVariable1, intVariable2;
        /*Initialization */
        intVariable1 = 10;
        intVariable2 = -10;
        /*Multiple Declaration and Initialization */
        long longVariable1 = 100000, longVariable2 = -199999;
        /* Initialization */
        longVariable1 = 100000;
        longVariable2= -199999;
        float floatVaraible = 1.89f; // the letter 'f' is required
        double doubleVaraible = 189.8923d; // the letter 'd' is optional
        char charVariable = 'c'; // Single letter enclosed in single quotation
        boolean booleanVariable = true; // Small case true/False
        /* Illegal action */
        // byte byteVariable = 20; // cannot redeclare a variable
        // byteVariable = 30: // instead use reassignment
        // boolean boolVar2 = 'false'; // should match the exact datatype
        // byte byteVariable2= 1000000; // cannot exceed min or max

        /* Non-primitive data type */
        String stringVariable = "This is a string";
        /* Or use the Class */
        String stringVariable2 = new String("String using class");
        /* Class/Object */
        VariableCLass variableObject = new VariableCLass();
        /* Use the same class Name as specified in public class <ClassName> */
        /* Need object to access instance variable */
        System.out.println(VariableCLass.staticVariable);

        /* Type Casting */
        int intVariableConvert = 10;
        double intVariableConvertToVariable = intVariableConvert;
        /* Explicit casting */
        double doubleVaraibleConvert = 100.29;
        int doubleVariableConvertToInt = (int) doubleVaraibleConvert;
    
        
        
    }   

}