public abstract class CalculatorPart {
    protected boolean isDone;

    public CalculatorPart() {
        this.isDone = false;
    }

    public abstract String getValue();

    public boolean getIsDone() {
        return this.isDone;
    }

    public void setIsDone(boolean value) {
        this.isDone = value;
    }
}
