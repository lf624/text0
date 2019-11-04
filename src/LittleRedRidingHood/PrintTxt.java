package LittleRedRidingHood;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class PrintTxt {
    public void print(){
        LittleRed a=new LittleRed();
        Wolf b=new Wolf();
        try {
            File writename=new File("LittleRedRidingHood.txt");
            writename.createNewFile();
            FileWriter writer = new FileWriter(writename);
            BufferedWriter out =new BufferedWriter(writer);
            out.write(a.a+b.a+a.b+b.b+a.c+b.c);
            out.flush();
            out.close();
            Desktop.getDesktop().open(writename);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
