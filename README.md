## **Test Base**

This project contains two workflows to be executed on GitHub Actions. \
    **1-** Start Selenium Hub using "docker-compose.withoutTests.yml" and run test classes parallel using Gradle. \
    **2-** Start Selenium Hub and run tests inside docker container using "docker-compose.withoutTests.yml" and run firstTest and secondTest xml suites parallel using TestNG.

- arm64 and amd64 environments are built for initializing Selenium Hub. Also, to run tests inside docker, it will get the required env according to specified env file. 
  - Ex: `docker compose --env-file .amd64.env -f docker-compose.withTests.yml up --exit-code-from secondTest`
- Both workflows are using QA-Base repo which will be pulled from S3 bucket with given access and secret keys in GitHub secrets.
- Four nodes with one session per node will be built with Selenium Grid. 
- Healthcheck is added to ensure selenium hub and node are up and running before tests.
- Allure report is used to report tests for both workflows.