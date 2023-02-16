public class AllPossibilities {
    public static void main(String[] args) {
        System.out.println(isAllPossibilities(new int[] {1, 2, 0, 3}));
        System.out.println(isAllPossibilities(new int[] {3, 2, 1, 0}));
        System.out.println(isAllPossibilities(new int[] {1, 2, 4, 3}));
        System.out.println(isAllPossibilities(new int[] {0, 2, 3}));
        System.out.println(isAllPossibilities(new int[] {0}));
        System.out.println(isAllPossibilities(new int[] {}));
    }
    public static int isAllPossibilities(int[ ] a){
        if (a.length == 0)
            return 0;

        boolean isAll = false;
        for(int i=0; i<a.length; i++){
            isAll = false;
            for(int j=0; j<a.length; j++){
                if (i == a[j]){
                    isAll = true;
                    break;
                }
            }
            if(!isAll) {
                return 0;
            }

        }
        return 1;

    }
}
