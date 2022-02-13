package yooyeon.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import yooyeon.core.member.repository.MemberRepository;
import yooyeon.core.member.repository.MemoryMemberRepository;

@Configuration
@ComponentScan(
        basePackages = "yooyeon.core",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

    // 설정 꼬일 위험
//    @Bean(name = "memoryMemberRepository")
//    MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }


}
