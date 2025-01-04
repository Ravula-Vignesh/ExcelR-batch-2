public class Demo05 {
    public static void main(String[] args) {
        String username = "user001";
        String pwd = "user_001";
        while(("user001".equals(username)) && ("user_001".equals(pwd))) {
            System.err.println("Hello");
            break;
        }
    }
}
