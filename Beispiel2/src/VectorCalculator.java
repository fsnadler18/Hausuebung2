public class VectorCalculator extends AbstractCalculator {

    public VectorCalculator() {
        super( (a, b) -> {
                    Number n = new Number();
                    n.setA(a.getA() + b.getA());
                    n.setB(a.getB() + b.getA());
                    return n;
                },
                (a, b) -> {
                    Number n = new Number();
                    n.setA(a.getA() - b.getA());
                    n.setB(a.getB() - b.getA());
                    return n;
                },
                (a, b) -> {
                    Number n = new Number();
                    n.setA(a.getA() * b.getA());
                    n.setB(a.getB() * b.getB());
                    return n;
                },
                (a, b) -> {
                    Number n = new Number();
                    n.setA(a.getA() / b.getA());
                    n.setB(a.getB() / b.getB());
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
