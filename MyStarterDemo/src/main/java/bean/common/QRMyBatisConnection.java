package bean.common;

public class QRMyBatisConnection {
    private String url = "127.0.0.1:3306";

    public void connect() {
        System.out.println("connect url:" + url);
    }
}
