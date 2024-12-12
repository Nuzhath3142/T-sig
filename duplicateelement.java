import java.util.Scanner;
public class duplicateelement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of the elements in the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        int [] dupe=new int[n/2];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    while(k<(n/2))
                    {
                        dupe[k]=arr[i];
                        count++;
                        k++;
                        break;
                    }
                    break;
                }
            }
        }
            



        System.out.println("duplicate elements");
        for(int i=0;i<n/2;i++)
        {
            for(int j=i+1;j<=count;j++){
                if(count!=0)
                {
                    System.out.print(dupe[i]+"\t");
                }

            }
        }
    }
}
