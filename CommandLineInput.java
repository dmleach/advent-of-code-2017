public class CommandLineInput {

    private String input = null;

    public CommandLineInput(String[] args) {
        if (args.length > 0 && args[0] != null) {
            this.input = args[0];
        }
    }

    public String getInput() {
        return this.input;
    }

}
