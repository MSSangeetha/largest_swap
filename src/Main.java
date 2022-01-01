public class Main {
//    function that takes two digit number
//    checks if the swap is largest than the original number
//    return true if larger else false

//    main function
    public static void main (String[] args){

//        create an instance for the class
Main main = new Main();

//        call the function
        System.out.println(main.largestSwap("43"));
    }

//    create a function
    public boolean largestSwap(String givenString){

        String B = String.valueOf(givenString.charAt(1));
        String C = String.valueOf(givenString.charAt(0));
        String D = B +C;
        System.out.println(D);

        int convert1 = Integer.parseInt(givenString);
        int convert2 = Integer.parseInt(D);

        if(convert1 >= convert2){
            return true;
        }
        else{
            return false;
        }
//        if(givenString > B){
//
//            return true;
//        }
//        else{
//            return false;
//        }


    }
}
