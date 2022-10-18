public class LuckyNumbers
{
    public LuckyNumbers() { }

    public int randomIntegerBetween(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public String getLuckyNumbers() {
        int rand;
        StringBuilder randList = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            rand = randomIntegerBetween(1,65);
            randList.append(rand).append(" ");
        }
        return "Your lucky numbers are: " + randList +  "\nThe super ball is: " + randomIntegerBetween(1,30);
    }
}
