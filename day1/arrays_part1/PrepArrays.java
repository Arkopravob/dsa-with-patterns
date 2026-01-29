package arrays_part1;

public class PrepArrays {
    public static void main(String[] args) {

        //arrays: - array is a collection of similar  types of data .
        int n = 6; //array length;
        int arr[] ; //array declaration
        arr = new int[n]; //memory allocation
        arr[0] = 67;
        arr[1] = 69;
        arr[2]= 100;
        arr[3] = 201;
        arr[4]= 34;
        arr[5] = 99;
        //how much size of this array required => 5*4 -= 20 bytes . 5 element and integer size 4 bytes
        System.out.println(arr[4]); //print the array element


//        for(int i : arr){
//            System.out.print(arr[i]);
//        }
//        System.out.println();

    }
}
