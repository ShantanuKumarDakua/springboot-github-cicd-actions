package com.shan.githubcicdactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubCicdActionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionsApplication.class, args);
	}

}


//echo "# springboot-github-cicd-actions" >> README.md
//		git init
//		git add README.md
//		git commit -m "first commit"
//		git branch -M main
//		git remote add origin https://github.com/ShantanuKumarDakua/springboot-github-cicd-actions.git
//		git push -u origin main