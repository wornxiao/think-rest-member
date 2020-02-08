package rest.server.thinkcat.think.rest.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("rest.server.thinkcat.think.rest.member.mapper")
public class ThinkRestMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThinkRestMemberApplication.class, args);
    }

}
