package LittleRedRidingHood;

public class LittleRed implements Character{
    public String a="从前有个人见人爱的小姑娘，喜欢戴着祖母送给她的一顶红色天鹅绒的帽子，于是大家就叫她小红帽。";
    public String b="她从未见过狼，也不知道狼性残忍，于是把来森林中的目的告诉了狼。";
    public String c="等小红帽来找外婆时，狼一口把她吃掉了。";
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
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void finnal() {

        char array[]=c.toCharArray();
        try {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                Thread.sleep(200);
                if (i % 15 == 0 && i != 0)
                    System.out.println();
            }Thread.sleep(1000);
            System.out.println();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
