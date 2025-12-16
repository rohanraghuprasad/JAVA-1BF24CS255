interface Sortable{
    void sort(float[] arr);
}

class BubbleSort implements Sortable{
    public void sort(float[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    float tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        System.out.println("Bubble Sorted array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
class SelectionSort implements Sortable{
   public void sort(float[] arr) {
       int n = arr.length;
       for (int i = 0; i < n - 1; i++) {
           int min = i;
           for (int j = i + 1; j < n; j++) {
               if (arr[j] < arr[min]) {
                   min = j;
               }
           }
           float temp = arr[min];
           arr[min] = arr[i];
           arr[i] = temp;
       }
       System.out.println("Selection Sorted array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
   }
}

public class Lab {
    public static void main(String[]args){

        float arr[]={4f,7f,3f,1f,5f,6f,2f,1f};
        Sortable ob1=new BubbleSort();
        Sortable ob2=new SelectionSort();
        ob1.sort(arr);
        System.out.println();
        ob2.sort(arr);
    }
}

