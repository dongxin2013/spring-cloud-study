spring-cloud-study
===========================

### 环境依赖
    JDK1.8及以上版本
### 目录结构描述
    ├── micro-service-app1  // app1
    ├── micro-service-app2  // app2
    ├── micro-service-consumer  // 服务消费者
    ├── micro-service-consumer-ribbon  // 服务消费者ribbon实现
    ├── micro-service-consumer-ribbon-properties-customizing  // 服务消费者ribbon-配置文件实现
    ├── micro-service-consumer-ribbon-without-eureka  // 服务消费者ribbon-（不依赖eureka）配置文件实现
    ├── micro-service-consumer-feign  // 服务消费者feign实现
    ├── micro-service-discovery-eureka // eureka 服务注册管理平台
    ├── micro-service-provider  // 服务生产者
    ├── micro-service-sso  // 单点登录认证系统
    ├── .gitignore  //Git上传文件过滤配置
    ├── pom.xml     //maven配置
    └── README.md