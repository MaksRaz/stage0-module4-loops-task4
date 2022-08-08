package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow){
            System.out.println("number to skip is bugger then the last");
        }
        else if (lastInRow < 0){
            System.out.println("last number in row is negative");
        }
        else {
            int skippedSum = 0;
            int sum = 0;
            for (int i = 1; i <= lastInRow; i++) {
                while (i <= numberToSkip){
                    skippedSum+=i;
                    i++;
                }
                if (i > lastInRow){
                    break;
                }
                sum+=i;
            }
            System.out.println(String.format("skipped sum is %s", skippedSum));
            System.out.println(String.format("counted sum is %s", sum));
        }
    }
}
