public class LinearSearchForString {
    public static void main(String[] args) {
        String name="Rameshwar";
        char target='z';
        boolean ans=linearSearch(name,target);
        System.out.println(ans);
    }
    static boolean linearSearch(String str,char target){
        if(str.length()==0)
            return false;
        //Checking of everyindex with the target
        for(int i = 0;i < str.length(); i++){
            if(target == str.charAt(i))
                return true;
        }
        return false;
    }
}
