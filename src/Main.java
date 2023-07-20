
public class Main {
    public static int helpFromSam(int number){
        int helpFromCount = 1, temp = 1;
        while (temp < number){
            temp *= 2;
            if (temp > number){
                temp /= 2;
                temp ++;
                helpFromCount++;
            }
        }
        return helpFromCount;
    }

    public static void main(String[] args) {
        System.out.println(helpFromSam(16));
    }
}