public class ComplexCalculator extends AbstractCalculator {
    public ComplexCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        super( add = (a, b) -> {
                    Number n = new Number();

                    return n;
                },
                subtract = (a, b) -> {
                    Number n = new Number();

                    return n;
                },
                multiply = (a, b) -> {
                    Number n = new Number();

                    return n;
                },
                divide = (a, b) -> {
                    Number n = new Number();

                    return n;
                });
    }

    @Override
    public Number add(Number a, Number b) {
        return this.add.calc(a,b);
    }

    @Override
    public Number subtract(Number a, Number b) {
        return this.subtract.calc(a,b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        return this.multiply.calc(a, b);
    }

    @Override
    public Number divide(Number a, Number b) {
        return this.divide.calc(a, b);
    }
}
