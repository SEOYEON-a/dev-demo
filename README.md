# CI/CD-based Spring Boot Web Application Deployment Project

![prj](https://github.com/user-attachments/assets/4667af61-bed6-4e5d-a3e0-f7b3dd87a7fa)


## 프로젝트 소개

- 이 프로젝트는 Jenkins를 활용해 Spring Boot 애플리케이션을 AWS EC2에 자동으로 빌드, 테스트, 배포하는 CI/CD 파이프라인을 구축한 경험을 담고 있습니다.
- Docker를 이용해 애플리케이션을 컨테이너 이미지로 빌드하고, EC2 서버에서 실행하여 일관된 운영 환경을 제공했습니다.
- Jenkins 파이프라인 스크립트를 작성해 빌드, 테스트, 배포를 자동화하고, 반복 작업의 효율성을 높였습니다.
- Spring Boot와 JPA를 기반으로 AWS RDS(MySQL)와 연동해 데이터베이스 테이블 자동 생성 기능도 구현했습니다.

<br>

## 1. 개발 환경

- CI/CD 도구: Jenkins 2.375.3, Git 2.40.0, Docker 24.0.2
- Infra : AWS EC2 (Amazon Linux 2, AMI 2023.12)
- DB : AWS RDS (MySQL 8.0.x)
- Back-end : Spring Boot 3.1.6 
- Java: Amazon Corretto 17 (Java 17 LTS)
  
<br>

## 2. 배포 결과 확인

### [배포 결과]
- EC2 서버에 배포된 애플리케이션은 단일 HTML 페이지(index.html)를 통해 구성되며, 프로젝트 개요와 기술 스택을 소개합니다.
- GitHub 링크를 통해 실제 배포 상태를 확인할 수 있습니다.

| 배포 결과 |
|----------|
|![demo-page](https://github.com/user-attachments/assets/4667af61-bed6-4e5d-a3e0-f7b3dd87a7fa)|

<br>

## 3. 트러블 슈팅

- [EC2 서버의 공인 IP와 RDS 인바운드 규칙 불일치 이슈](https://github.com/SEOYEON-a/dev-demo/wiki/%ED%8A%B8%EB%9F%AC%EB%B8%94-%EC%8A%88%ED%8C%85_EC2-%EC%84%9C%EB%B2%84%EC%9D%98-%EA%B3%B5%EC%9D%B8-IP%EC%99%80-RDS-%EC%9D%B8%EB%B0%94%EC%9A%B4%EB%93%9C-%EA%B7%9C%EC%B9%99-%EB%B6%88%EC%9D%BC%EC%B9%98
)
- [STS 3 버전에서 프로젝트 빌드 오류 이슈](https://github.com/SEOYEON-a/dev-demo/wiki/%ED%8A%B8%EB%9F%AC%EB%B8%94-%EC%8A%88%ED%8C%85_STS-3-%EB%B2%84%EC%A0%84%EC%97%90%EC%84%9C-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%EB%B9%8C%EB%93%9C-%EC%98%A4%EB%A5%98)

<br>

## 4. 개선 목표

- API: REST API 및 DB 연동 기능 확장을 통해 서비스 완성도 향상 예정
- 테스트: Jenkins 파이프라인에 단위 테스트 및 빌드 상태 체크 자동화 추가
- 보안: Jenkins와 EC2 접근 권한 최소화 및 HTTPS 적용 검토

<br>

## 5. 프로젝트 후기

실제 운영 환경에 배포하는 전 과정을 경험하며 CI/CD 흐름에 대한 깊은 이해를 쌓았고, Docker·Jenkins·AWS 간 연동 이슈를 직접 해결하며 실무 수준의 문제 해결 역량을 키울 수 있었습니다.
