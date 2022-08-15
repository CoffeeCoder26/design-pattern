package singleton;

/***
 * This fixes one problem, but another one still exists.
 * What if two different clients access the Singleton class at the same time,
 * right to the millisecond? Well, they will check if the instance is null at the same time,
 * and will find it true, and so will create two instances of the class for each request by the two clients.
 * To fix this, Thread Safe instantiation is to be implemented.
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton(){}

    private static LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }

        return instance;
    }
}
