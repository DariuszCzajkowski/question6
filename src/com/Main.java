package com;

public class Main {
    public static int [] intArray= {1, 5, 6, -3, 2, -23};

    public static int findRange(int []intArray) {


        int largest = intArray[0];
        int minimal = intArray[0];
        int sum = 0;
if (intArray.length>1){
        for (int i = 0; i < intArray.length; i++) {
            if (largest < intArray[i]) {
                largest = intArray[i];

            }


            if (minimal > intArray[i]) {
                minimal = intArray[i];
            }

        }
        sum = largest - minimal;
        System.out.println(sum);}

        return -1;
    }


    public static void main(String[] args) {



        findRange(intArray);



    }



}

