public class MinutesToSeconds {

    public static int convert(int minutes) {
        return minutes * 60;
    }
    

    public static void main(String[] args) {
        System.out.println("Conversion of minutes to seconds is: " + convert(5));
        System.out.println("Conversion of minutes to seconds is: " + convert(3));
        System.out.println("Conversion of minutes to seconds is: " + convert(2));
    }
}