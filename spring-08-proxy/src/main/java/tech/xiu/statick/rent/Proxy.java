package tech.xiu.statick.rent;

/**
 * 中介
 *  中介可以有一些除了租房意外的附属的属性，比如说：看房，签合同，收钱、多家房源进行比对，有针对性的推荐等等
 */
public class Proxy implements Rent{

    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    public Proxy() {
    }

    @Override
    public void rent() {
        host.rent();
        this.seeHouse();
        this.signContract();
    }

    private void seeHouse() {
        System.out.println("中介看房！");
    }

    private void signContract() {
        System.out.println("和中介签租房合同！");
    }
}
