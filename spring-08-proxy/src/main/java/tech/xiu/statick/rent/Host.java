package tech.xiu.statick.rent;

/**
 * 房东要出租房子。
 * 属于租房的范畴
 * 租房范畴：
 *   出租房子，
 *   租房子
 */
public class Host implements Rent{

    @Override
    public void rent() {
        System.out.println("房东出租房子！");
    }
}
