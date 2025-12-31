public class DemoMethod {
    public static int findMin(int x , int y){
        if(x < y){
            return x;
        }
        else{
            return  y;
        }
    }
    public static void main(String[] args) {
        int a = 34;
        int b = 36;
        int res = findMin(a,b);
        System.out.println(res);
    }
    
}
