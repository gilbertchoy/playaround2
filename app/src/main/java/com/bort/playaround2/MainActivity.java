package com.bort.playaround2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String tag = "berttest output";
    int ar[]=new int[7];  //mergeSort
    int arr[]=new int[7];  //quickSort
    int array[] = new int[7];  //heapSort

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mergesort
        ar[0]=4;
        ar[1]=5;
        ar[2]=3;
        ar[3]=1;
        ar[4]=2;
        ar[5]=6;
        ar[6]=7;
        mergeSort(ar,0,ar.length-1);
        Log.d(tag,"mergesort:");
        printValues(ar);

        //quickSort
        arr[0]=4;
        arr[1]=5;
        arr[2]=3;
        arr[3]=1;
        arr[4]=2;
        arr[5]=6;
        arr[6]=7;
        mergeSort(ar,0,ar.length-1);
        Log.d(tag,"quickSort:");
        printValues(ar);


        array[0]=4;
        array[1]=5;
        array[2]=3;
        array[3]=1;
        array[4]=2;
        array[5]=6;
        array[6]=7;


    }

    public static void quickSort(int[] a, int l, int r){
        int pi = partition(a,l,r);
        quickSort(a,l,pi-1);
        quickSort(a,pi+1,r);
    }

    public static int partition(int[] a, int l, int r){
        int incrementi;
        int swapi;

        for()


        return 1;
    }




    public static void mergeSort(int [] a, int l, int r){
        //split then merge
        if(l<r){
            int m = (l+r)/2;
            mergeSort(a,l,m);
            mergeSort(a,m+1, r);
            merge(a,l,m,r);
        }
    }

    public static void merge(int[] a, int l, int m, int r){
        int[] left = new int[m-l+1];
        int[] right = new int[r-m];

        for(int i=0; i<left.length; i++){
            left[i] = a[l+i];
        }
        for(int i=0; i<right.length; i++){
            right[i] = a[m+1+i];
        }

        //merge
        int lc = 0;
        int rc = 0;
        int index = l;
        while(lc<left.length && rc<right.length){
            if(left[lc]<right[rc]){
                a[index] = left[lc];
                lc++;
            }
            else{
                a[index] = right[rc];
                rc++;
            }
            index++;
        }
        while(lc<left.length){
            a[index] = left[lc];
            lc++;
            index++;
        }
        while(rc<right.length){
            a[index] = right[rc];
            rc++;
            index++;
        }
    }


    public void printValues(int a[]){
        for(int i=0; i<a.length; i++){
            Log.d(tag, "print values: " + a[i]);
        }
    }
}