package co.zhanglintc.ohMySpringBoot;

import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Server:
 *  - http://localhost:8080
 *
 * Nacos clusters:
 *  - http://192.168.33.10:8848/nacos
 *  - http://192.168.33.11:8848/nacos
 *  - http://192.168.33.12:8848/nacos
 */

@SpringBootApplication
@ServletComponentScan
@EnableNacosConfig(globalProperties = @NacosProperties(serverAddr = "192.168.33.10:8848"))
@NacosPropertySource(dataId = "ohMyNacosBoot", autoRefreshed = true)
public class OhMySpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(OhMySpringBootApplication.class, args);
    }

}
