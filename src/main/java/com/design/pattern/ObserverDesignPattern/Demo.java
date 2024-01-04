package com.design.pattern.ObserverDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Demo {

    public static void main(String[] args) throws IOException {

        Subject channel = new YoutubeChannel();

        Observer aman = new Subscriber("Aadi");
        Observer raman = new Subscriber("Raman");

        channel.subscribe(aman);
        channel.subscribe(raman);

        channel.newVideoUploaded("Java");
        channel.newVideoUploaded("Angular");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){

            System.out.println("Press 1 to upload video");
            System.out.println("Press 2 to create new Subscriber");
            System.out.println("Press 3 to unsubscribe");
            System.out.println("Press 4 to exist");

            int c = Integer.parseInt(br.readLine());

            if(c == 1){
                System.out.println("Enter video title");
                String videoTitle = br.readLine();
                channel.newVideoUploaded(videoTitle);
            }
            else if(c == 2){
                System.out.println("Enter name of subscriber");
                String subsName = br.readLine();
                Subscriber subscriber = new Subscriber(subsName);
                channel.subscribe(subscriber);
            }
            else if(c == 3){
                System.out.println("Enter name of subscriber");
                String subsName = br.readLine();
                channel.unsubscribe(subsName);
            }
            else if(c == 4) {
                System.out.println("Thankyou for using app");
                break;
            }
            else {
                System.out.println("Wrong Input");
            }
        }

    }

}
