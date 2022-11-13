#### 一、代码提交规范
```
    <type>(<scope>):<subject>
    // 空一行
    <body>
    // 空一行
    <footer>
```
`type`:
- ci: 更改我们的持续集成文件和脚本（e.g.: Travis，GitLab等）
- feat：提交新功能
- fix：修复了bug
- docs：只修改了文档
- style：调整代码格式，未修改代码逻辑（比如修改空格、格式化、缺少分号等）
- refactor：代码重构，既没修复bug也没有添加新功能
- perf：性能优化，提高性能的代码更改
- test: 增加测试代码
- revert: 撤销上一次的commit
- chore: 构建工具或构建过程等的变动，如：关联包升级等

`scope`: 模块范围
`subject`: 提交简短描述
`body`： 修改点详细描述
`footer`: 关联bug/tapd单


