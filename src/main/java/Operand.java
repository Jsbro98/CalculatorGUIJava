public class Operand extends CalculatorPart {
    private StringBuilder value;

    public Operand() {
        super();
        this.value = new StringBuilder();
    }

    public void addToValue(char number) {
        this.value.append(number);
    }

    public void addToValue(String number) {
        this.value.append(number);
    }

    public void resetToDefault() {
        this.value = new StringBuilder();
        this.setIsDone(false);
    }

    public boolean hasValue() {
        if (this.value.length() == 0) {
            return false;
        }

        return true;
    }

    @Override
    public String getValue() {
        return this.value.toString();
    }
}
