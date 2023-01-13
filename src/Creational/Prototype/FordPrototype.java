package Creational.Prototype;

public class FordPrototype extends CarPrototype {
    public FordPrototype() {
        maker = "Ford";
        model = "Mustang";
        color = "Red";
        engineSize = "5.0L";
    }

    @Override
    public CarPrototype clone() {
        FordPrototype fordPrototype = new FordPrototype();
        fordPrototype.setMaker(this.maker);
        fordPrototype.setModel(this.model);
        fordPrototype.setColor(this.color);
        fordPrototype.setEngineSize(this.engineSize);
        
        return fordPrototype;
    }
}
