public class Chocolate {

        public static int breakChocolate(int n, int m) {
            if(m==0 || n== 0){
                return 0;
            }
            return n *(m-1) + (n-1);
        }



}
