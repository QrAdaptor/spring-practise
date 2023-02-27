package bean.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 从BeanFactory中获取指定的bean
        BaseBean bean = context.getBeanFactory().getBean(BaseBean.class);
        // 从上下文中获取指定的值
        String name = context.getEnvironment().getProperty("name");

        return bean != null && name != null && "zqr".equals(name);
    }
}
