public class Demo062{
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50};
        for(int i=0;i<arr.length;i++){
            if(i==0||i==1||i==arr.length-1){
                System.out.println(arr[i]);
            }
        }
    }
}