public class Demo083{
    public static void main(String[] args){
        String str = "elephant";
        char ch = str.charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("It is a vowel");
        } else {
            System.out.println("Not a vowel");
        }
    }
}