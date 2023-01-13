package Structural.Bridge;

class Windows implements Platform {
    @Override
    public void execute(String code) {
        System.out.println("Running " + code + " on Windows");
    }
}
