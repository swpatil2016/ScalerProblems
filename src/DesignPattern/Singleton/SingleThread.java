package DesignPattern.Singleton;

public class SingleThread {

        private static SingleThread singleThread;

        // Attr goes here


    public SingleThread() {
    }

    public static SingleThread createInstance() {
            if(singleThread == null) {
                singleThread = new SingleThread();
            }

            return singleThread;
        }

}
