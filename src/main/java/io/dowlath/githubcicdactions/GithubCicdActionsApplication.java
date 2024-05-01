package io.dowlath.githubcicdactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class GithubCicdActionsApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to CI/CD Github actions.....";
	}

	/*
	echo "# github-workflow-actions" >> README.md
	git init
	git add README.md
	git commit -m "first commit"
	git branch -M main
	git remote add origin https://github.com/DowlathBashaG/github-workflow-actions.git
	git push -u origin main
	 */
	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionsApplication.class, args);
	}

}
