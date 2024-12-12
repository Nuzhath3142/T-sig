

import java.util.Scanner;

public class second_largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of the elements in the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max){
                max=arr[i];
            }
            
        }
        int second_max=arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]>second_max && arr[i]!=max){
                second_max=arr[i];
            }
        }

        if(second_max!=max){
            System.out.println("the second largest element is: "+second_max+" and the largest element is "+max);
        }
        else{
            System.out.println(-1);
        }

    }

}
