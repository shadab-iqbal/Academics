public class Task7
{
    public static void main(String[] args)
    {
        int sum = 0;
        int count = 1;
        while(count<=600)
        {
            if(count%7==0 && count%9==0)
            {
                sum += count;
            }
            count++;
        }
        System.out.println("Sum is:" + sum);
    }
}


