public class BinarySearch{
    public static void main(String [] args){
        int [] a = {10,20,30,40,50};
        int key = -40;
        int last = a.length - 1;
        //binarySearchIteratively(a, 0, last, key);
        
        int b = binarySearchRecursively(a, 0, last, key);
        if(b == -1) System.out.println("Not found");
        else System.out.println("found");
        
    }
    
    //iteratively
    static void binarySearchIteratively(int [] a, int first, int last, int key){
        int mid = (first + last) / 2;
        
        while(first <= last){
            if(key < a[mid]) last = mid - 1;
            else if(key > a[mid]) first = mid + 1;
            else{
                System.out.println("Element found at index: "+mid);
                break;
            }
            mid = (first + last) / 2;
        }
        if(first > last) System.out.println("Element not found");
    }
    
    //recursively
    static int binarySearchRecursively(int [] a, int first, int last, int key){
        
        int mid = (first + last) / 2;
        
            if(first > last) return -1;
            else if(key < a[mid]) return binarySearchRecursively(a, first, mid - 1, key);
            else if(key > a[mid]) return binarySearchRecursively(a, mid + 1, last, key);
            else{
                return mid;
            }
    }
}