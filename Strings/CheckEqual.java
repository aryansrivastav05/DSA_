public class CheckEqual {
    public static void main(String[] args) {
        String s1 = "aryan";
        String s2 = "aryan";
        String s3 = new String("aryan");
        if(s1==s2){
            System.out.println("s1 and s2 are equal");
        }
        else{
            System.out.println("s1 and s2 are not equal");

        }
        // if(s1==s3){
        //     System.out.println("s1 and s3 are equal");
        // }
        // else{
        //     System.out.println("s1 and s3 are not equal");

        // }
        if(s1.equals(s3)){
            System.out.println("s1 and s3 are equal");
        }
        else{
            System.out.println("s1 and s3 are not equal");

        }
    }
}
