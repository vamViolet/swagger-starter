package com.dongxq.annotation;


import com.dongxq.config.SwaggerAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;


/**
 * 需要在客户端的启动类上添加此注解以开启swagger
 * @author:      dongxiaoqi <br>
 * Date:         2021/7/13 br>
 * Description:  swagger 自动配置类 <br>
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({SwaggerAutoConfiguration.class})
public @interface EnableCustomSwagger2 {

}
