package cn.nuaa.why.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Author: why
 * @Description:
 * @Date: Created in 2018/4/19 17:05
 */
@Configuration
@ComponentScan(basePackages = {"cn.nuaa.why"},
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class)})
public class MvcConfig {

}
