

// Code For Binary Search

class Test{

    public int bsearch(int low,int high,int[] a,int key){

        while(low<high){

            int mid = (low+high)/2;

            if(a[mid]<key){
                low = mid+1;
            }
            else if(a[mid]>key){
                high = mid-1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args){

        Test obj = new Test();

        int[] a = {1,3,5,7,9,11,13,15};

        int key = 4;

        int out = obj.bsearch(0,a.length-1,a,key);

        System.out.println(out); 
    }
}
