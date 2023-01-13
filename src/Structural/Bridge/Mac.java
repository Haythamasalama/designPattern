package Structural.Bridge;

class Mac implements Platform {
    @Override
    public void execute(String code) {
        System.out.println("Running " + code + " on MAC");
    }
}
