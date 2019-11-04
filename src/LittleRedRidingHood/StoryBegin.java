package LittleRedRidingHood;

public class StoryBegin {
    public static void main(String[] args) {
        System.out.println("小红帽的故事开始啦！");
        Character little=new LittleRed();
        Character wolf=new Wolf();
        little.begin();
        wolf.begin();
        little.progress();
        wolf.progress();
        little.finnal();
        wolf.finnal();
        System.out.println("喜欢这个故事就把它打印出来吧！");
        System.out.println("3秒后开始打印到TXT上...");
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        PrintTxt print=new PrintTxt();
        print.print();
    }
}
