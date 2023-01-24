public class Factorial {
    public static int fact(int num) {
        if (num == 1 || num == 1)
            return 1;

        int biggerAns = fact(num - 1);
        return biggerAns * num;
    }

    public static int factUsingTailRecursion(int num, int ans) {
        if (num == 1)
            return ans;
        
        return factUsingTailRecursion(num - 1, ans * num);
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(factUsingTailRecursion(7, 1));
    }
}