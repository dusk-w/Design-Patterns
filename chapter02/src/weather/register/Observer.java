package weather.register;

/**
 * 观察者接口
 * 所有气象组件都实现此观察则接口
 *
 * @author wei
 * @since 2022-06-01-23-17
 */
public interface Observer {

    // 当主题状态改变时调用该方法
    void update(double temp, double humidity, double pressure);
}
