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
* CustomerController.java: acts as a REST endpoint receiver. It uses the CustomerService to execute business logic.
* CustomerService.java(Impl): Executes business logic. Current version uses database to create and update CustomerEntity.java and InsuranceAgreementEntity.java. Most likely, the two former entities would be realized as separate (Micro)services.
* CustomerRepository.java and InsuranceAgreementRepository.java: responsible for CRUD-operations on DB.