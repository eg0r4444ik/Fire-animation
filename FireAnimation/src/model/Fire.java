package model;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Fire {
    private List<Spark> sparks;
    private Random rnd = new Random();

    public Fire() {
        sparks = new ArrayList<>();
    }

    public void draw(Graphics2D g){
        for (Spark spark : sparks){
            spark.draw(g);
        }
    }

    public void generateFire(int w, int h){
        for(int i = 0; i < sparks.size(); i++){
            if(sparks.get(i).getTemperature()<400){
                sparks.remove(i);
                i--;
            }
        }
        for(int i = 0; i < 1000; i++){
            sparks.add(new Spark(1200, rnd.nextInt(w), h));
        }
    }

    public void updateFire() {
        //System.out.println(sparks.size());
        for (Spark spark : sparks) {
            int dy = rnd.nextInt(5)*Math.min(Math.abs(800-spark.getX0()), Math.abs(spark.getX0()))/100 - rnd.nextInt(5);
            spark.setY(spark.getY() - dy);

            int dt = Math.max(Math.abs(800-spark.getX0()), Math.abs(spark.getX0()))/100;
            spark.setTemperature(spark.getTemperature()-10);


//            int dy = rnd.nextInt(10);
//            int dx = (int) Math.pow(-1, rnd.nextInt(2)) * rnd.nextInt(5);
//            spark.setY(spark.getY() - dy);
//            spark.setX(spark.getX() - dx);
//
//            int dt = (int) (Math.sqrt(dx * dx + dy * dy) * 600 / Math.min(Math.abs(spark.getX() - 800), spark.getX()));
//            spark.setTemperature(spark.getTemperature() - rnd.nextInt(50));
        }

//        for(int i = 0; i < sparks.size()/2; i++){
//            Spark spark = sparks.get(i);
//            int dy = rnd.nextInt(10);
//            spark.setY(spark.getY() - dy);
//            spark.setX(spark.getX() - (int)Math.pow(-1, rnd.nextInt(2)));
//            int dt = (int)(dy*600/Math.min(Math.abs(spark.getX()-800), spark.getX()));
//            spark.setTemperature(spark.getTemperature()-dt);
//        }
//        for(int i = sparks.size()/2; i < sparks.size(); i++){
//            Spark spark = sparks.get(i);
//            int dy = rnd.nextInt(10);
//            int dx = (int)Math.pow(-1, rnd.nextInt(2))*rnd.nextInt(5);
//            if(spark.getY() > 500 && spark.getX() <= 300 || spark.getY() <= 500 && spark.getX() > 500){
//                dx = rnd.nextInt(5)-2;
//            }else{
//                dx = -rnd.nextInt(5)+2;
//            }
//
//            if(spark.getX() > 300 && spark.getX() <= 500){
//                dx = 0;
//            }
//
//            spark.setY(spark.getY() - dy);
//            spark.setX(spark.getX() - dx);
//
//            int dt = (int)(Math.sqrt(dx*dx + dy*dy)*600/Math.min(Math.abs(spark.getX()-800), spark.getX()));
//            spark.setTemperature(spark.getTemperature()-dt);
//        }


        generateFire(800, 600);
    }
}
