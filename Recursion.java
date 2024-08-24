public class Recursion{

    public static int recursiveFunc(int k){
        if (k>0){
            return k + (recursiveFunc(k-1));
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        int sum = recursiveFunc(10);
        System.out.println(sum);
    }
}