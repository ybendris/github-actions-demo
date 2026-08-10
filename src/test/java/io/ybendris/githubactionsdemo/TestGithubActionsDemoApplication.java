package io.ybendris.githubactionsdemo;

import org.springframework.boot.SpringApplication;

public class TestGithubActionsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.from(GithubActionsDemoApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
