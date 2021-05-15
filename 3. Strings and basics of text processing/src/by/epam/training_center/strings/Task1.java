package by.epam.training_center.strings;

public final class Task1 {
    public static Result solution(String str) {

        int index = -1;
        int length = 0;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == SPACE) {
                count++;
            } else if (count>0) {
                if (count>length) {
                    length = count;
                    index = i - count;
                }
                count = 0;
            }
        }

        return new Result(index, length);
    }

    public static class Result {
        private final int index;
        private final int length;

        public Result(int index, int length) {
            this.index = index;
            this.length = length;
        }

        public int getIndex() {
            return index;
        }

        public int getLength() {
            return length;
        }
    }

    private static final char SPACE = ' ';
}
