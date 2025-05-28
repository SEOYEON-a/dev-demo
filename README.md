# DevOps-Based Spring Boot Todo Project

![Todo](https://github.com/user-attachments/assets/799ece0a-f1e3-42e9-bf88-9de63e6b50c3)


## 프로젝트 소개

- 이 프로젝트는 사용자가 할 일을 추가, 완료 처리, 삭제할 수 있는 웹 기반 ToDo List 애플리케이션입니다.  
- 단순 기능 구현뿐만 아니라, Jenkins를 활용해 Spring Boot 애플리케이션을 AWS EC2에 자동으로 빌드, 테스트, 배포하는 CI/CD 파이프라인을 구축하는 데 중점을 두었습니다.  
- Docker를 이용해 애플리케이션을 컨테이너 이미지로 빌드하고 EC2 서버에서 실행하여 일관된 운영 환경을 제공하였습니다.  
- 또한, Spring Boot와 JPA를 기반으로 AWS RDS(MySQL)와 연동하여 데이터베이스 테이블 자동 생성 기능도 구현하였습니다.

<br>

## 1. 개발 환경

- CI/CD 도구: Jenkins 2.375.3, Git 2.40.0, Docker 24.0.2
- Infra : AWS EC2 (Amazon Linux 2, AMI 2023.12)
- DB : AWS RDS (MySQL 8.0.x)
- Back-end : Spring Boot 3.1.6 
- Java: Amazon Corretto 17 (Java 17 LTS)
  
<br>

## 2. 주요 기능

### [주요 기능]
- Jenkins를 이용한 CI/CD 파이프라인 구축: 코드 변경 시 자동으로 빌드, 테스트, 배포 진행  
- Docker 이미지 빌드 및 배포: 컨테이너화로 일관된 실행 환경 보장  
- Spring Boot 애플리케이션과 AWS RDS(MySQL) 연동: JPA를 통한 데이터베이스 테이블 자동 생성  
- ToDo List 기능 구현: 할 일 추가, 완료 처리, 삭제 기능 제공

| 주요 기능 |
|----------|
|![Todo](https://github.com/user-attachments/assets/799ece0a-f1e3-42e9-bf88-9de63e6b50c3)|

<br>

## 3. 트러블 슈팅

- [EC2 서버의 공인 IP와 RDS 인바운드 규칙 불일치 이슈](https://github.com/SEOYEON-a/dev-demo/wiki/%ED%8A%B8%EB%9F%AC%EB%B8%94-%EC%8A%88%ED%8C%85_EC2-%EC%84%9C%EB%B2%84%EC%9D%98-%EA%B3%B5%EC%9D%B8-IP%EC%99%80-RDS-%EC%9D%B8%EB%B0%94%EC%9A%B4%EB%93%9C-%EA%B7%9C%EC%B9%99-%EB%B6%88%EC%9D%BC%EC%B9%98
)
- [STS 3 버전에서 프로젝트 빌드 오류 이슈](https://github.com/SEOYEON-a/dev-demo/wiki/%ED%8A%B8%EB%9F%AC%EB%B8%94-%EC%8A%88%ED%8C%85_STS-3-%EB%B2%84%EC%A0%84%EC%97%90%EC%84%9C-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%EB%B9%8C%EB%93%9C-%EC%98%A4%EB%A5%98)

<br>

## 4. 개선 목표

- API: REST API 및 데이터베이스 연동 기능을 확장하여 서비스 완성도 향상 예정  
- 테스트: Jenkins 파이프라인에 단위 테스트 및 빌드 상태 체크 자동화를 추가해 품질 관리 강화  

<br>

## 5. 프로젝트 후기

- 이번 프로젝트를 통해 Jenkins와 Docker를 활용한 자동화된 CI/CD 파이프라인 구축 경험을 쌓았습니다.  
- AWS EC2와 RDS 환경에서의 배포 및 운영 과정을 직접 다뤄, 실제 서비스 운영에 필요한 DevOps 역량을 강화할 수 있었습니다.  
- Spring Boot와 JPA 기반 애플리케이션 개발과 데이터베이스 연동 과정도 체계적으로 익히게 되어 매우 의미 있는 프로젝트였습니다.
