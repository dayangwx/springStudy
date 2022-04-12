package tech.xiu.real;

// 真实对象。 需要被代理
public class UserDao implements IUserDao{

    @Override
    public void save() {
        System.out.println("保存数据");
    }
}
