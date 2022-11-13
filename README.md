#### 目标：
构建一个通用的Android项目模板工程，通过这个过程一方面梳理技术栈、复盘业务中的通用技术实现；另一方面沉淀通用工具和组件，提升开发效率。

#### 计划：
作为Android的模板项目，这里落地会更偏向于基础设置和通用组件能力的沉淀。大致会分如下几块：
##### 1）工程组件化及基础设施建设
Shell: 应用壳工程 app

Module/Plugin: 业务

Lib: 基础库
- lib-imageloader
- lib-alive
- lib-reach
- lib-hotfix
- lib-plugin
- lib-apm
- lib-dyelog
  ...

Base: 基础层
- base-core
- base-network
- base-ui
- base-framework
- base-route
  ...
##### 2）基础库能力封装和输出

基于Base和Lib落地对应基础能力，上maven统一对外输出能力；

##### 3) 相关技术文档沉淀

这里主要会有两部分文档：一部分是技术栈梳理文档；另一部分是
基础库实现详设。