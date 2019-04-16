package factoryp.factormethod.pizza;


public class Pizza {

    String name;
    String dough;
    String sauce;

    public void prepare(){
        System.out.println("开始准备制作:"+name);
        System.out.println("揉面团:"+dough);
        System.out.println("加佐料:"+sauce);
    }
    public void bake(){
        System.out.println("烘培...");
    }
    public void cut(){
        System.out.println("切片...");
    }
    public void box(){
        System.out.println("打包...");
    }
}
