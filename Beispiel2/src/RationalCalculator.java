public class RationalCalculator extends AbstractCalculator {

    public RationalCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        super( add = (a, b) -> {
                    Number n = new Number();
                    n.setA(a.getA() * b.getB() + b.getA() * a.getB());
                    n.setB(a.getB() * b.getB());
                     return n;
                },
                subtract = (a, b) -> {
                    Number n = new Number();
                    n.setA(a.getA() * b.getB() - b.getA() * a.getB());
                    n.setB(a.getB() * b.getB());
                    return n;
                },
                multiply = (a, b) -> {
                    Number n = new Number();
                    n.setA(a.getA() * b.getA());
                    n.setB(a.getB() * b.getB());
                    return n;
                },
                divide = (a, b) -> {
                    Number n = new Number();
                    n.setA(a.getA() * b.getB());
                    n.setB(a.getB() * b.getA());
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

