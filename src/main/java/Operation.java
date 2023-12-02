public class Operation extends CalculatorPart {
    private String operation;
    public Operation() {
        super();
    }

    public void setOperation(String value) {
        this.operation = value;
    }

    public void resetToDefault() {
        this.operation = "";
        this.setIsDone(false);
    }

    @Override
    public String getValue() {
        return this.operation;
    }
}
