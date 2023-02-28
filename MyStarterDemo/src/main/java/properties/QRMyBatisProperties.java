package properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

// 自定义属性类，用于管理starter中的属性
@ConfigurationProperties(prefix = "zqr.mybatis") // 该注解需要引入依赖spring-boot-configuration-processor
public class QRMyBatisProperties {
    private String url = "127.0.0.1";

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
