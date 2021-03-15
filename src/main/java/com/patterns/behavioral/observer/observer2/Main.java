package com.patterns.behavioral.observer.observer2;

/**
 * GoF Definition: Define a one-to-many dependency between objects so that when one object changes state,
 * all its dependents are notified and updated automatically.
 *
 * Subject
 * Observer
 *      ConcreteObserverA
 *      ConcreteObserverB
 */
public class Main {

    public static void main(String[] args) {

        // subjects
        ConcreteSubject elon = new ConcreteSubject("@elonmusk");
        ConcreteSubject donald = new ConcreteSubject("@donaltrump");

        // observers
        Observer bloomberg = new ConcreteObserver("Bloomberg");
        Observer yahoo = new ConcreteObserver("YahooFinance");
        Observer wallmine = new ConcreteObserver("Wallmine");

        // subscribe observers
        elon.addSubscriber(bloomberg);
        elon.addSubscriber(yahoo);
        elon.addSubscriber(wallmine);
        donald.addSubscriber(yahoo);

        // tweet and notify
        elon.tweet("BTC goes up!");
        donald.tweet("WhiteHouse is mine!");


        // unsubscribe observers
        elon.removeSubscriber(bloomberg);
        elon.removeSubscriber(yahoo);
        elon.removeSubscriber(wallmine);
        donald.removeSubscriber(yahoo);

        // tweet and notify
        elon.tweet("BTC goes up!");
        donald.tweet("WhiteHouse is mine!");

    }
}
