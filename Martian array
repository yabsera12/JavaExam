public class MartianArray {
    public static void main(String[] args) {
        //expectec ret =  1 , 1 , 0 , 0 , 0 ,0 , 1 , 0
        System.out.println(isMartian(new int[]{1, 3}));
        System.out.println(isMartian(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1}));
        System.out.println(isMartian(new int[]{1, 3, 2}));
        System.out.println(isMartian(new int[]{1, 3, 2, 2, 1, 5, 1, 5}));
        System.out.println(isMartian(new int[]{1, 2, -18, -18, 1, 2}));
        System.out.println(isMartian(new int[]{}));
        System.out.println(isMartian(new int[]{1}));
        System.out.println(isMartian(new int[]{2}));
    }
    static int isMartian(int[ ] a){
        int no1 = 0, no2 = 0;
        if (a.length < 1){
            return 0;
        }
        if (a.length == 1 && a[0] == 1){
            return 1;
        } else if (a.length == 1 && a[0] > 1) {
            return 0;
        }
        for (int i=0; i < a.length; i++){
            if (a[i] == 1){
                no1++;
            }
            if (a[i] == 2){
                no2++;
            }
            if (i < a.length - 1 && a[i] == a[i+1]){
                if (a[i] == a[i+1])
                    return 0;
            }

        }
        if (no1 > no2){
            return 1;
        }
        return 0;
    }
}
