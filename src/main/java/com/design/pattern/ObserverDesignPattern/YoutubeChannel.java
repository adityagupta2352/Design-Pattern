package com.design.pattern.ObserverDesignPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class YoutubeChannel implements Subject{

    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer ob) {
        this.subscribers.add(ob);
    }

    @Override
    public void unsubscribe(String subsName) {
        boolean removed = false;
        for (Observer subscriber : subscribers) {
            if (subscriber instanceof Subscriber && ((Subscriber) subscriber).getName().equalsIgnoreCase(subsName)) {
                removed = subscribers.remove(subscriber);
                break;
            }
        }

        if (removed) {
            System.out.println(subsName + " unsubscribed successfully.");
        } else {
            System.out.println("Subscriber '" + subsName + "' not found or already unsubscribed.");
        }
    }


    @Override
    public void newVideoUploaded(String title) {
        for(Observer ob : this.subscribers){
            ob.notified(title);
        }
    }
}
