 ## 代理模式(proxy pattern)
 是一个使用率非常高的模式
 <p/>
 provide a surrogate or placeholder for another object to control access to it.
 (为其他对象提供一种代理以控制对这个对象的访问)

 代理模式也叫做委托模式,它是一项基本的设计技巧.许多其他的模式,如状态模式,策略模式,
 访问者模式本质上是在更特殊的场合采用了委托模式,
 而且在日常应用中,代理模式可以提供非常好的访问控制.
 在一些著名的开源软件中也有很多应用,如struts2的From元素映射就采用了代理模式(动态代理)

 #### 三个角色:
 1.Subject抽象主题角色<p/>
 抽象主题类可以是抽象类也可以是接口,是一个最普通的业务类型定义,无特殊要求<p/>
 2.RealSubject具体主题角色<p/>
 也叫做被委托角色,被代理角色.它才是具体业务的执行者.<p/>
 3.Proxy代理主题角色<p/>
 也叫做委托类,代理类.它负责对真实角色的应用,把所有抽象主题类定义的方法先知委托给真实主题角色,
 并且在真正主题角色处理完毕前后做预处理和善后处理工作.<p/>

 代理模式的优点:
 1. 职责清晰
 2. 高拓展性
 3. 智能化