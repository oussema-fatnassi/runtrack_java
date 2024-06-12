package jour03.job03;

public class StringArray {
    public static void main (String [] args) {
        String[] names = {"Josette", "John", "Myrtille", "Marc"};
        System.out.println(names[1]);
        
        System.out.println("Original array values:");
        for(String name : names) {
            System.out.println(name);
        }

        names[2] = "Mireille";
        
        System.out.println("Array with changed values:");
        for(String name : names) {
            System.out.println(name);
        }

    }
}
