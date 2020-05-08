public class NumberToWords {
    public static void main(String args[]){
        numberToWords(10);
        //reverse(-12345678);
        //System.out.println (getDigitCount(0));
    }

    public static void numberToWords(int number){
        if (number < 0) System.out.println("Invalid value");
        int digit = 0;
        if (number == 0)  System.out.print("Zero");
        while (number != 0) {
            digit = number % 10;
            switch (digit){
                case (0):
                    System.out.print("Zero ");
                    break;
                case (1):
                    System.out.print("One ");
                    break;
                case (2):
                    System.out.print("Two ");
                    break;
                case (3):
                    System.out.print("Three ");
                    break;
                case (4):
                    System.out.print("Four ");
                    break;
                case (5):
                    System.out.print("Five ");
                    break;
                case (6):
                    System.out.print("Six ");
                    break;
                case (7):
                    System.out.print("Seven ");
                    break;
                case (8):
                    System.out.print("Eith ");
                    break;
                case (9):
                    System.out.print("Nine ");
                    break;
            }
            number = number / 10;
        }
    }

    public static int reverse(int number){
        int razryad = 0;
        int tnumber = number;
        if (number < 0) {
            //int otr = 1;
            tnumber = number * -1;
        }
        for (int i = 0; i < 10;i++){
            if (tnumber > 0) {
                razryad++;
            }
            tnumber = tnumber / 10;
        }
        System.out.println("Razryad = " + razryad);

        int result = 0;
        int temp = 0;
        for (int i = 0; i < razryad;i++){
            temp = number % 10;
            result = ( result + temp )* 10;
            number = number / 10;
        }
        result = result / 10;
        System.out.println("Result - " + result);
        return result;

    }

    public static int getDigitCount(int number){
        if (number < 0) return -1;
        int razryad = 0;
        int tnumber = number;
        for (int i = 0; i < 10;i++) {
            if (tnumber >= 0) {
                razryad++;
            }
            tnumber = tnumber / 10;

        }
        return razryad;
    }
}
