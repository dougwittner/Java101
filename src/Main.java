// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int valA = 21;
        int valB = 6;
        int valN = valA + valB;
        valB = 6;
        int valC = 3;
        int valD = 1;
        int valE = 0;
        if (valE == 5) {
            valE = 22;
        }
        else {
            valE = 10;
        }
        int result1 = valA - valB / valC;
        int result2 = (valA - valB) / valC;

        System.out.println(result1);
        System.out.println(result2);

        int result3 = valA / valC * valD + valB;
        int result4 = valA / (valC * (valD + valB));

        System.out.println(result3);
        System.out.println(result4);}}
