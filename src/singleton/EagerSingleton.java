package singleton;

/***
 * This type of instantiation happens during class loading,
 * as the instantiation of the variable instance happens outside any method.
 * This poses a hefty drawback if this class is not being used at all by the client application.
 * Solution ---> Lazy Instantiation.
 */

public class EagerSingleton {

    private static EagerSingleton   instance =new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton  getInstance(){
        return instance;
    }
}
