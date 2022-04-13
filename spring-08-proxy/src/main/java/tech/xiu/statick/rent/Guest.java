package tech.xiu.statick.rent;

public class Guest {

    public static void main(String[] args) {
        // 直接找房东租房子。
//        Host host = new Host();
//        host.rent();

        /**
         * 代理和真实的host都做了同一件事情：租房。
         * 所以他们两都需要implements 租房
         */
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
