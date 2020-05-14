# micro-service-consumer
    服务消费者
    使用硬编码方式调用服务
    
## 使用 RestTemplate 调用接口
在配置类，或者启动类中添加 @Bean…… 如以下代码
``` java
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        // Do any additional configuration here
        return builder.build();
    }
```
在调用的地方进行使用
``` java
    private RestTemplate restTemplate;
    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
    }
    
    @Value("${user.userServicePath}")
    private String userServicePath;
    
    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id) {
    return this.restTemplate.getForObject(this.userServicePath + id, User.class);
    }
```
