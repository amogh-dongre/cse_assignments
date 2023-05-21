interface Cycle {
    int wheels();
}

interface CycleFactory {
    Cycle getCycle();
}

class UniCycle implements Cycle {
    @Override
    public int wheels() {
        return 1;
    }
}

class BiCycle implements Cycle {
    @Override
    public int wheels() {
        return 2;
    }
}

class TriCycle implements Cycle {
    @Override
    public int wheels() {
        return 3;
    }
}

class CycleFactoryImpl implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new UniCycle();
    }
}

public class TestCycle {
    public static void main(String[] args) {
        CycleFactory factory = new CycleFactoryImpl();
        Cycle unicycle = factory.getCycle();
        System.out.println("Number of wheels in UniCycle: " + unicycle.wheels());
        Cycle bicycle = new BiCycle();
        System.out.println("Number of wheels in BiCycle: " + bicycle.wheels());
        Cycle tricycle = new TriCycle();
        System.out.println("Number of wheels in TriCycle: " + tricycle.wheels());
    }
}
