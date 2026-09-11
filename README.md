# Java 学习仓库

> 大一 Java 学习全过程记录 · IntelliJ IDEA 环境

## 仓库介绍

本仓库用于记录大一期间 Java 课程的完整学习过程，包含课堂练习、课后作业、小项目和个人笔记。所有代码在 IntelliJ IDEA 中编写，附带简单注释方便复习。

## 学习目录

```
git1/
├── 01_basics/              # 基础语法
│   ├── HelloWorld.java
│   ├── Variables.java
│   └── DataType.java
├── 02_control_flow/        # 流程控制
│   ├── IfElse.java
│   ├── ForLoop.java
│   └── SwitchCase.java
├── 03_array_string/        # 数组与字符串
├── 04_oop/                 # 面向对象
├── 05_exception/           # 异常处理
├── 06_collection/          # 集合框架
├── 07_io/                  # IO 流
├── 08_thread/              # 多线程
├── 09_gui/                 # GUI 编程
└── 10_project/             # 综合小项目
```

## 学习进度

- [x] 01 环境搭建 & HelloWorld
- [ ] 02 基础语法（变量、数据类型、运算符）
- [ ] 03 流程控制（if/else、for、while、switch）
- [ ] 04 数组与字符串
- [ ] 05 面向对象（类、对象、封装、继承、多态）
- [ ] 06 异常处理
- [ ] 07 集合框架（List、Set、Map）
- [ ] 08 IO 流（文件读写）
- [ ] 09 多线程基础
- [ ] 10 GUI 编程（Swing / JavaFX）
- [ ] 11 综合小项目

## 开发环境

| 项目 | 配置 |
|------|------|
| IDE | IntelliJ IDEA |
| JDK | OpenJDK 17 |
| 构建工具 | IntelliJ 内置 / Maven |
| 版本控制 | Git + GitHub |

## Git 提交规范

```
<type>: <简短描述>
```

常用 type：

| type | 说明 | 示例 |
|------|------|------|
| feat | 新增代码/功能 | `feat: 添加 if-else 练习` |
| fix | 修复 bug | `fix: 修正数组越界问题` |
| docs | 更新文档/README | `docs: 更新学习进度` |
| refactor | 重构代码 | `refactor: 优化循环逻辑` |
| chore | 杂项（配置等） | `chore: 更新 .gitignore` |

## 使用说明

1. 克隆仓库
```bash
git clone git@github.com:wyjcode51/git1.git
```

2. 用 IntelliJ IDEA 打开项目

3. 每次写完代码后提交
```bash
git add .
git commit -m "feat: 添加xxx练习"
git push
```

---

*最后更新：2026-09-10*
