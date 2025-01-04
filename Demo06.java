public class Demo06 {
    public static void main(String[] args) {
        String username = "user001";
        String pwd = "user_001";
        while(("Vignesh".equals(username)) && ("Vignesh@123".equals(pwd))) {
            System.err.println("Hello");
            break;
        }
    }
}