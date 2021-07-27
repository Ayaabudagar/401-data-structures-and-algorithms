static void BinarySearch(int[]arr,int num,int n){
    int L=0 ;
        int R=n-1 ;
        while (L<=R){
            int m=(L+R)/2;
            if(arr[m]<num){
                L=m+1;
        } else if (arr[m]>num){
                R=m-1;
        } else if(arr[m]==num){
                System.out.println(num);
                break;
        }
        }
        }