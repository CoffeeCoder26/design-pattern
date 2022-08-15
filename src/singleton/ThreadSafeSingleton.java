package singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton() {
    }

    private static ThreadSafeSingleton getInstance() {

        /***
         * keyword synchronized is used on methods or objects to implement thread safety,
         * so that only one thread will access a particular resource at one time.
         */
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}


