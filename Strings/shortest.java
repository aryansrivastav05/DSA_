import java.util.*;
public class shortest {
  public static float getpath(String s)
  {
    int x=0,y=0;
    for(int i=0;i<s.length();i++)
    {
        char dir = s.charAt(i);
        if(dir== 'N' ){
               y++;
        }else if(dir =='S')
        {
            y--;
        }
        else if(dir=='E'){
            x++;
        }
        else{
            x--;
        }
    }
    int X2=x*x;
    int Y2=y*y;
    return (float)Math.sqrt(X2+Y2);
  }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Direction");
        String s = sc.nextLine();
        float result = getpath(s);
        System.out.println(result);
        
    }
}
