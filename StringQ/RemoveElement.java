public class RemoveElement{
    public static void main(String[] args) {
        String str="abnbca";
        String updatedString=removeElement(str);
        System.out.println(updatedString);
    }
    static String removeElement(String str){
        if(str.length()==0)
            return str;
        char ch=str.charAt(0);
        if(ch=='a')
            return removeElement(str.substring(1));
        else
            return ch+removeElement(str.substring(1));
    }
}