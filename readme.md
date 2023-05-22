#  叶片分厂设备状态大屏图


## 启动步骤

### 数据库配置
1. idea 导入Maven项目正常启动即可
2. 正确配置application-*.yml,可根据需要配置修改
3. applicatin.yml 配置项`spring.profile.actvie`切换启动配置文件
4. idea 正常启动即可

### 部署方式
1. 前端打包后的dist/* 所有文件放入\src\main\resources\static\下
2. `mvn package` 打包在target完成 
   1. target/pack 下分为`lib` | `big-view-api-1.0.0.jar ` 放在同一目录发布版本可以减少体积，体积预计5M
   2. `big-view-api-1.0.0.jar` 把lib打入发布内 体积预计30M
   
### 首页

> http://xxx.xxx.xxx.xxx:8081/big-view-api