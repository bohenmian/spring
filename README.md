## spring-framework

### How it play

1. git clone https://github.com/bohenmian/spring
2. open IDEA --> File --> New --> Open
3. choose build.gradle，open it

### Spring相关组件阅读笔记

### 注意

1. 导入的时候可能会报错`Error:Kotlin:[Internal Error]java.lang.IllegalStateException`，升级Kotlin的版本即可
2. 导入Spring-beans项目时，报错`org.springframework.beans.factory.support.CglibSubclassingInstantiationStrategy`编译报错，
提示缺少`org.springframework.cglib.*.*`等类，原因是因为为了避免包冲突所以spring把最新的cglib和objenesis给repack了，
在gradle界面中的Tasks中other中run cglibRepackJar和objenesisRepackJar即可导入jar包
3. 第一次git push代码到代码仓库时注意注释掉.gitignore中的target/，否则spring-aop和spring-context_test中的源文件也提交不上去


