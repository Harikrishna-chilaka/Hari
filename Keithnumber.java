import java.util.*;
class Keithnumber
{
    public static void main(String args[])
    {
        String n;
        int m,r[],count=0,sum=0;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        n = sc.next();
        r = new int[20];
        for(int i=0;i<n.length();i++)
            r[i] = Character.digit(n.charAt(i),20);
        m = Integer.parseInt(n);
        int n1 = m;
        for(int i=0;n1>0;i++)
        {
            n1 = n1 / 10;
            count++;
        }
        int s = count;
        for(int i=0;i<r.length;i++)
        {
            int j = i;
            while(count!=0){
                sum = sum + r[j];
                j++;
                count=count-1;
            }
            r[i+s] = sum;
            count = s;
            if(sum == m)
            {
                 flag = true;
                 break;
            }
            else if(sum > m)
                break;
            sum = 0;
        }
        if(flag == true)
            System.out.println(m+" is a Keith number");
        else
            System.out.println(m+" is not Keith number");
    };
}
/*Input 19 or 28 or 47 or 197 is a Keith number
197= 1+9+7=17
9+7+17=33
7+17+33=57
17+33+57=197 is a Keith number */
