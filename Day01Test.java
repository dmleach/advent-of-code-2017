public class Day01Test {

    public static void main(String[] args) {
        try {
            Day01 solver = new Day01(args);

            int result = solver.getCaptchaAnswer(ReciprocalMethod.NEXT);
            System.out.println("The answer to the captcha using the next method is " + result);

            result = solver.getCaptchaAnswer(ReciprocalMethod.OPPOSITE);
            System.out.println("The answer to the captcha using the opposite method is " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
