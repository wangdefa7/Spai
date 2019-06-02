package com.util;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

/*@Configuration：Spring中会有很多的XML配置文件，文件中会配置很多的bean。
 * 在类上添加@Configuration注解，大家可以理解为该类变成一个XML配置文件。
@Bean：等同于XML配置文件中的配置。Spring Boot会把加上该注解的方法的返回值装载进Spring IoC容器，
方法的名称对应标签的id属性值。具体代码如下：
*/
@Configuration
public class DruidConfiguration {

        @Bean
        public ServletRegistrationBean druidStatViewServle(){
            //ServletRegistrationBean提供类的进行注册.
            ServletRegistrationBean servletRegistrationBean
                    = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
            //添加初始化参数：initParams
            //白名单：
            servletRegistrationBean.addInitParameter("allow","127.0.0.1");
            //IP黑名单 (存在共同时，deny优先于allow)
            // 如果满足deny的话提示:Sorry, you are not permitted to view this page.
            servletRegistrationBean.addInitParameter("deny","192.168.1.73");
            //登录查看信息的账号和密码.
            servletRegistrationBean.addInitParameter("loginUsername","admin");
            servletRegistrationBean.addInitParameter("loginPassword","123456");
            //是否能够重置数据.
            servletRegistrationBean.addInitParameter("resetEnable","false");
            return servletRegistrationBean;
        }

        @Bean
        public FilterRegistrationBean druidStatFilter(){
            FilterRegistrationBean filterRegistrationBean
                    = new FilterRegistrationBean(new WebStatFilter());
            //添加过滤规则.
            filterRegistrationBean.addUrlPatterns("/*");
            //添加需要忽略的格式信息.
            filterRegistrationBean.addInitParameter("exclusions",
                    "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
            return filterRegistrationBean;
        }
}
