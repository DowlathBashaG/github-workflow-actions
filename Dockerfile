FROM openjdk:17-oracle
EXPOSE 8080
ADD target/github-workflow-actionsgithub-workflow-actions.jar github-workflow-actions.jar
ENTRYPOINT ["java","-jar","/github-workflow-actions.jar"]
