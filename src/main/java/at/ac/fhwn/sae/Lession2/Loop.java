package at.ac.fhwn.sae.Lession2;

public class Loop{

    public static void main(String[] args) {


        int month = 7;
        String monthString = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Month";
        };

        System.out.println(monthString);

//        for(int i=0; i<=10; i++){
//            System.out.println(i);
//        }

        int i = 0;

        while (i < 10) {
            System.out.println(i);
            i++;
        }

        // i==10;

        do {
            System.out.println(i);
            i--;
        } while (false);

        //i==-1;

        System.out.println(add(12,3));
        System.out.println(add(12,3,4));
        System.out.println(add("12",3,4));

        int[] intArr = new int[10];
        System.out.println(intArr[0]);
        intArr[0] = 41;
        intArr[9] = 14;


        System.out.println("foreach");

        for(int value : intArr){
            System.out.println(value);
        }

        System.out.println("Max number: " + getMaxOfBits(4));
    }

    public static long getMaxOfBitsRecoursive(int numberOfBits){
        return getMaxOfBitsRecoursive(1,numberOfBits);
    }
    private static long getMaxOfBitsRecoursive(long number, int numberOfBitsLeft){
        if(numberOfBitsLeft > 0){
            return getMaxOfBitsRecoursive(number*2, --numberOfBitsLeft);
        }
        return number;
    }
    /**
     * Gets the maximum number of a datatype with the passed number of Bits.
     *
     * The datatype is considered to be unsigned.
     *
     * @param numberOfBits the number of Bits of the datatype
     * @return the maximum value of the datatype
     */

    public static long getMaxOfBits(int numberOfBits){
        long result = 1;
        while(numberOfBits>0){
            result*=2; numberOfBits--;
        }
        return result;
    }



    public static int add(int number1, int number2){
        return number1 + number2;
    }
    public static int add(int number1, int number2, int number3){
        return add(add(number1, number2), number3);
    }
    public static int add(String number1, int number2, int number3){
        return add(add(Integer.parseInt(number1), number2), number3);
    }

}