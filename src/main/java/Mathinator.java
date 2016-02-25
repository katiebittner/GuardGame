public class Mathinator {
    public int answer(long input) {
        if (input < 10) {
            return (int)(input);
        }
        int[] numbersToAdd = convertLongOrIntToIntArray(input);
        int answer = addDigitsInIntArray(numbersToAdd);
        while (answer >= 10) {
            int[] nextNumber = convertLongOrIntToIntArray(answer);
            answer = addDigitsInIntArray(nextNumber);
        }
        return answer;
    }


    public int[] convertLongOrIntToIntArray(long input) {
        String temp = Long.toString(input);
        int[] numberArray = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            numberArray[i] = temp.charAt(i) - '0';
        }
        return numberArray;
    }

    public int addDigitsInIntArray(int[] input) {
        int length = input.length;
        int answer = 0;
        for (int i = 0; i < length; i += 2) {
            answer += input[i] + input[i + 1];
        }
        return answer;
    }

    public int[] convertLongOrIntToIntArray(int input) {
        String tempString = Integer.toString(input);
        int[] numberArray = new int[tempString.length()];
        for (int i = 0; i < tempString.length(); i++) {
            numberArray[i] = tempString.charAt(i) - '0';
        }
        return numberArray;
    }
}