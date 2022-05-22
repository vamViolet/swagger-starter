# swagger集成组件

#### 介绍
通过注解方式实现springboot集成swagger-ui功能

#### 技术栈
springboot + spring-context + springfox-swagger2

#### 说明

1. 需要在客户端的启动类上添加注解[EnableCustomSwagger2]以集成swagger
2. 需要在客户端的配置文件中配置自定义的swagger相关信息，**<font color ="dd00dd">可为空</font>**，默认效果如下图。比如：tittle，description，包扫描路径（basePackage:默认所有，可为空）等

#### 配置及效果信息展示

![引入方式](README.assets/annotation.png)
![application](README.assets/application.png)
![swagger-ui](README.assets/swagger-ui.png)