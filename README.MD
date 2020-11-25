# JAVA LEARN

## 设计模式
### 单例模式 designpattern
### 懒汉式 LazySingleton
```
public class LazySingleton {

    private LazySingleton(){} //private 避免类在外部被实例化

    public static volatile LazySingleton instance = null; //保证 instance 在所有线程中同步

    public static synchronized LazySingleton getInstance(){
        //getInstance 方法前加同步
        if(null == instance){
            instance = new LazySingleton();
        }
        return instance;

    }

}
```
### 饿汉式 HungrySingleton
