package config;

import bean.common.QRMyBatisConnection;
import bean.condition.BaseBean;
import bean.condition.ConditionBean;
import bean.condition.ConditionOnClassBean;
import bean.condition.MyCondition;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import properties.QRMyBatisProperties;

@Configuration
@EnableConfigurationProperties(QRMyBatisProperties.class) // IOC容器管理配置类的bean
public class QRMybatisAutoConfiguration {
    // 普通的bean
    @Bean
    public QRMyBatisConnection qrMyBatisConnection() {
        return new QRMyBatisConnection();
    }

    @Bean
    public BaseBean baseBean() {
        return new BaseBean();
    }

    // 只有两个bean都在spring容器中时，才会加载该bean
    @Bean
    @ConditionalOnBean({BaseBean.class, QRMyBatisConnection.class})
    public ConditionOnClassBean conditionOnClassBean() {
        return new ConditionOnClassBean();
    }

    // 测试@Conditional注解
    @Bean
    @Conditional({MyCondition.class})
    public ConditionBean conditionBean() {
        return new ConditionBean();
    }
}
