public class Calculator {
    private Operation operation;
    private Operand operand1;
    private  Operand operand2;

    public Calculator() {
        this.operation = new Operation();
        this.operand1 = new Operand();
        this.operand2 = new Operand();
    }

    public void resetOperand(int numberOfResets) {

        if (numberOfResets == 1) {

            this.operand1.resetToDefault();
            this.operand1.addToValue(this.operand2.getValue());
            this.operand2.resetToDefault();

        } else if (numberOfResets == 2) {

            this.operand1.resetToDefault();
            this.operand2.resetToDefault();
            this.operation.resetToDefault();
        }
    }

    public void addToOperand(String value) {

        if (this.operand1.getIsDone()) {
            this.operand2.addToValue(value);

        } else {
            this.operand1.addToValue(value);
        }
    }

    public void setOperation(String value) {
        if (this.operation.getIsDone()) {
            return;
        }

        this.operation.setOperation(value);
        this.setDone();
    }

    public void setDone() {

        if (!this.operand1.getIsDone()) {
            this.operand1.setIsDone(true);
            this.operation.setIsDone(true);
            return;
        }

        if (!this.operand2.getIsDone()) {
            this.operand2.setIsDone(true);
        }
    }

    public Operand getOperand2() {
        return this.operand2;
    }

    public String getOperator() {
        return this.operation.getValue();
    }

    //master eval method
    public String eval() {
        String result = "";

        switch (this.operation.getValue()) {
            case "+":
                result = String.valueOf(this.add());
                break;

            case "-":
                result = String.valueOf(this.subtract());
                break;

            case "*":
                result = String.valueOf(this.multiply());
                break;

            case "/":
                result = String.valueOf(this.divide());
                break;

            default:
                System.out.println("Something Broke!");
                break;
        }

        return result;
    }

    // helper methods for eval
    public int add() {
        return Integer.parseInt(operand1.getValue()) + Integer.parseInt(operand2.getValue());
    }

    public int subtract() {
        return Integer.parseInt(operand1.getValue()) - Integer.parseInt(operand2.getValue());
    }

    public int multiply() {
        return Integer.parseInt(operand1.getValue()) * Integer.parseInt(operand2.getValue());
    }

    public int divide() {
        return Integer.parseInt(operand1.getValue()) / Integer.parseInt(operand2.getValue());
    }
}
