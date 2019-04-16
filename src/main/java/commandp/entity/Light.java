package commandp.entity;

public class Light {

    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println(name+"灯打开");
    }

    public void off() {
        System.out.println(name+"灯关闭");
    }
}
