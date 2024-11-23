class LoopQuestions {
    public static void pyramid(int r){
        for(int i=1; i<=r; i++){
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            }
            for(int k =1; k<=2*i-1; k++){
                System.out.print("*");

            }
            System.out.println();

        }
    }
    public static void pattern(int r){
        for(int i=r; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void fact(int n){
        int ans=1;
        for(int i=1; i<=n; i++){
            ans*=i;
            System.out.println("factorial of "+i+": "+ans);
        }
    }
    public static void pow(int a, int b) {
        int res = 1;
        for (int i = 1; i <= b; i++) {
            res *= a;
        }
        System.out.println(res);

    }

    public static void targetSum(int [] arr,int target){
        int n=arr.length;
        int ans=0;
        for(int i=0 ;i <n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

    public static void threePairSum(int[]arr,int target){
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static int uniqueNum(int[]arr){
        int n=arr.length;

        for(int i=0; i<n; i++){
            for(int j=i+1 ; j<n; j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=0;
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                ans=arr[i];
            }
        }
        return ans;
    }

    public static int maxNum(int[]arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static int secondMax(int []arr){
        int max=maxNum(arr);
        int n=arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondNum=maxNum(arr);
        return secondNum;
    }

    public static int repeatValue(int[]arr){
        int n=arr.length;
        int ans=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    ans=arr[i];
                }
            }
        }

         return ans;
    }

    public static int smallestNum(int[]arr){
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]<min){
                min=arr[i];
            }

        }
        return min;
    }

    public static int secondMinNum(int[]arr){
        int min = smallestNum(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == min) {
                arr[i] = Integer.MAX_VALUE;
            }
        }
        int secondMin = smallestNum(arr);
        return secondMin;
    }

    public static void swap(int a,int b){
        System.out.println("Befor swap a ="+a+" b ="+b);
        System.out.println("after swap the a and b");

        int temp=a;
        a=b;
        b=temp;
        System.out.println("a ="+a+" b= "+b);
    }

    static void swapWithoutTemp(int a,int b){
        System.out.println("Befor swap a ="+a+" b ="+b);
        System.out.println("after swap the a and b");

        a=a+b;
        b=a-b;
        a=a-b;


        System.out.println("a ="+a+" b= "+b);
    }

    public static void printArray(int arr[]){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]);
        }
    }

    public static int[] reverse(int[]arr) {
        int n=arr.length;
        int[]ans=new int[n];
        int j=0;
        for(int i=n-1; i>=0; i--){
            ans[j++]=arr[i];
        }
        return ans;
    }

    public static void swapArray(int[]arr){
        int n=arr.length;
         int i=0;
            for(int j=n-1; j>0; j--){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

                i++;
            }
            System.out.println(arr[i]);

        }
    }



public class BasicDsaCodeAllCode {
    public static void main(String[]args){
//        System.out.println("enter the size of array ");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int [] arr=new int[n];
//        System.out.println("enter the "+n+" elements ");
//        for(int i=0; i<n; i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println("enter the target sum");
//        int target=sc.nextInt();

        int a=3;
        int b=9;
        int arr[]={1,2,3,4,5,6};

        LoopQuestions.swapArray(arr);
        //demo.reverse(arr);
      // System.out.println("max number  is "+demo.reverse(arr));

        System.out.println("RADHA KRISHNA");
    }
}
