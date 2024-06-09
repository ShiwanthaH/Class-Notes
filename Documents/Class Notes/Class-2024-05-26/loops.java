public class loops{
    public static void main(String[] args){
        // while (//condition){} // while loop
        System.out.println("While loop");
        
        int i = 10;

        while (i < 10) {
            System.out.println(i);
            i++;
        }

        // do-while loop
        System.out.println("Do-While loop");

        int j = 0;

        do {
            System.out.println(j);
            j++;
        } while (j < 10);
    }
}