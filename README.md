# customer

## Project prerequisites (recommended)

* Eclipse Oxygen or IntelliJ IDEA 2017.2.2 or above.
* Java 9 (will run on 1.8 also)
* Maven 3.2+

## Build, run and test
* mvn clean install
* mvn spring-boot:run
* Test endpoint from: http://localhost:8080/customer/insert/<norwegian fødselsnummer>
* TIP: view inserted customers at at http://localhost:8080/snowdevelopment

## About the code
* Code in this example uses package names like controller, database, repository, service. These names are not mandatory an may be changed.
* The use of english in the code is done for simplicity and may be changed.

## Architecture (simple overview)
* Customer.java: is the main class of this app that runs spring-boot.
* CustomerController.java: acts as a REST endpoint receiver. It uses various service-classes to execute business logic.
* CustomerService.java(Impl): Executes business logic for Customer. Current version uses database to create Customer. 
* InsuranceAgreementService.java(Impl): Executes business logic for InsuranceAgreement. Current version uses database to create and update InsuranceAgreement.
* CustomerRepository.java and InsuranceAgreementRepository.java: responsible for CRUD-operations on DB.
* PostService: Just a mock for now returning OK.
* Most likely, the two former services/entities would be realized as separate (Micro)services.