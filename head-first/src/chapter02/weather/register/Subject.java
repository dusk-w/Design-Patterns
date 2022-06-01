package chapter02.weather.register;

/**
 * 主题接口
 *
 * @author wei
 * @since 2022-06-01-23-15
 */
public interface Subject {

    // 注册观察者
    Boolean registerObserver(Observer o);
    // 删除观察者
    Boolean removeObserver(Observer o);
    // 通知观察者
    void notifyObserver();
}
