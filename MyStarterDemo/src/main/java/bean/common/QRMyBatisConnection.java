package bean.common;

import properties.QRMyBatisProperties;

import javax.annotation.Resource;

public class QRMyBatisConnection {
    @Resource
    private QRMyBatisProperties qrMyBatisProperties;

    private String url = "127.0.0.1:3306";

    public void connect() {
        System.out.println("connect url:" + qrMyBatisProperties.getUrl());
    }
}
