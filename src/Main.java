public class Main {
    public static void main(String[] args) {
        int n = 10000;

        //1st code block
        long startTime1 = System.currentTimeMillis();
        String result1 = "";
        for (int i = 1; i < n; i++) {
            result1 += "hello";
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("1st code block runtime: " + (endTime1-startTime1));

        //2nd code bloc
        long startTime2 = System.currentTimeMillis();
        StringBuilder result2 = new StringBuilder();
        for (int i = 1; i < n; i++) {
            result2.append("hello");
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("2nd code block runtime: " + (endTime2-startTime2));
        }
    }