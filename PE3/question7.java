import java.util.*;
public class question7 {
    
    public static void main(String[] args) throws Exception {
        try {
            throw new Exception("There's a problem!\n");
        } catch (Exception e) {         
            e.printStackTrace();
        }
        finally {
            System.out.println("I was here.");
        }
    }
}