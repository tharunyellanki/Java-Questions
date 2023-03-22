/* Write a java program to find common elements present in 3 different arrays. and print them in assending order. */

//code for Q2

import java.util.Scanner;

public class CommonElements 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t,m;
        int n1=sc.nextInt();
        int a[]=new int[5];
        for(int i=0;i<n1;i++)
        {
            a[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int b[]=new int[5];
        for(int i=0;i<n2;i++)
        {
            b[i]=sc.nextInt();
        }
        int n3=sc.nextInt();
        int c[]=new int[5];

        for(int i=0;i<n3;i++)
        {
             c[i]=sc.nextInt();
        }
        if(n1<n2 && n1<n3)
        {
             m=n1;  
        }
         else if(n2<n1 && n2<n1)
        {
            m=n2;
        }
        else
        {
            m=n3;
        }
 int s[]=new int[m],p=0;
    for(int i=0;i<n1;i++)
     {
        for(int j=0;j<n2;j++)
        {
            for(int k=0;k<n3;k++)
            {
                if(a[i]==b[j]&&b[j]==c[k]&&c[k]==a[i])
                {
                    s[p]=a[i];
                    p++;
                }
            }
        }
     }
     for(int i=0;i<p-1;i++)
     {
        for(int j=0;j<p-1;j++)
        {
            if(s[j]>s[j+1])
            {
                t=s[j];
                s[j]=s[j+1];
                s[j+1]=t;
            }
        }
     }
    for(int i=0;i<=p-1;i++)
        {
             System.out.print(s[i]+" ");
        }
     }
}
