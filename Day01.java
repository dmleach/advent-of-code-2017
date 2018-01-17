enum ReciprocalMethod {
    NEXT, OPPOSITE
}

public class Day01 extends CommandLineInput {

    public Day01(String[] args) {
        super(args);
    }

    public char[] getReciprocalCharacters(int index, ReciprocalMethod method) {
        String input = this.getInput();
        int inputLength = input.length();

        char[] result = new char[2];
        result[0] = input.charAt(index);

        switch (method) {
            case NEXT:
                if (index + 1 < inputLength) {
                    result[1] = input.charAt(index + 1);
                } else {
                    result[1] = input.charAt(0);
                }

                break;
            case OPPOSITE:
                int idxOpposite = index + (inputLength / 2);

                if (idxOpposite >= inputLength) {
                    idxOpposite -= inputLength;
                }

                result[1] = input.charAt(idxOpposite);
                break;
        }

        return result;
    }

    public int getCaptchaAnswer(ReciprocalMethod method)
    {
        String input = this.getInput();
        int inputLength = input.length();
        int sum = 0;

        for (int idxInput = 0; idxInput < inputLength; idxInput++) {
            char[] reciprocals = this.getReciprocalCharacters(idxInput, method);

            if (reciprocals[0] == reciprocals[1]) {
                sum += Character.getNumericValue(reciprocals[0]);
            }
        }

        return sum;
    }

}
