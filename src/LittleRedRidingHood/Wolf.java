package LittleRedRidingHood;

public class Wolf implements Character {
    public String a="有一天，母亲叫她给外婆送食物，并嘱咐她不要离开大路，走得太远。小红帽在森林中遇见了狼。";
    public String b="狼知道后诱骗小红帽去采野花，自己跑到林中小屋去把小红帽的外婆吃了，并装成外婆。";
    public String c="后来一个猎人把小红帽和外婆从狼肚里救了出来。";
    @Override
    public void begin() {

        char array[]=a.toCharArray();
        try {
            for(int i=0;i<array.length;i++) {
                System.out.print(array[i]);
                Thread.sleep(200);
                if(i%15==0&&i!=0)
                    System.out.println();
            }Thread.sleep(1000);
            System.out.println();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void progress() {

        char array[]=b.toCharArray();
        try {
            for(int i=0;i<array.length;i++) {
                System.out.print(array[i]);
                Thread.sleep(200);
                if(i%15==0&&i!=0)
                    System.out.println();
            }Thread.sleep(1000);
            System.out.println();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void finnal() {

        char array[]=c.toCharArray();
        try {
            for(int i=0;i<array.length;i++) {
                System.out.print(array[i]);
                Thread.sleep(200);
                if(i%15==0&&i!=0)
                    System.out.println();
            }Thread.sleep(1000);
            System.out.println();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
